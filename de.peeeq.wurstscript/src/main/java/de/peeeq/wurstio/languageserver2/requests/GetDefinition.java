package de.peeeq.wurstio.languageserver2.requests;

import de.peeeq.wurstio.languageserver.ModelManager;
import de.peeeq.wurstio.languageserver2.BufferManager;
import de.peeeq.wurstio.languageserver2.Convert;
import de.peeeq.wurstscript.WLogger;
import de.peeeq.wurstscript.ast.*;
import de.peeeq.wurstscript.parser.WPos;
import de.peeeq.wurstscript.utils.Utils;
import org.eclipse.lsp4j.Location;
import org.eclipse.lsp4j.TextDocumentPositionParams;

import java.util.Collections;
import java.util.List;

public class GetDefinition extends UserRequest<List<? extends Location>> {

    private final String filename;
    private final String buffer;
    private final int line;
    private final int column;


    public GetDefinition(TextDocumentPositionParams position, BufferManager bufferManager) {
        this.filename = position.getTextDocument().getUri();
        this.buffer = bufferManager.getBuffer(position.getTextDocument());
        this.line = position.getPosition().getLine();
        this.column = position.getPosition().getCharacter();
    }


    @Override
    public List<? extends Location> execute(ModelManager modelManager) {
        CompilationUnit cu = modelManager.replaceCompilationUnitContent(filename, buffer, false);
        Element e = Utils.getAstElementAtPos(cu, line, column, false);
        WLogger.info("get definition at: " + e.getClass().getSimpleName());
        if (e instanceof FuncRef) {
            FuncRef funcRef = (FuncRef) e;
            FunctionDefinition decl = funcRef.attrFuncDef();
            return linkTo(decl);
        } else if (e instanceof NameRef) {
            NameRef nameRef = (NameRef) e;
            NameDef decl = nameRef.attrNameDef();
            return linkTo(decl);
        } else if (e instanceof TypeExpr) {
            TypeExpr typeExpr = (TypeExpr) e;
            TypeDef decl = typeExpr.attrTypeDef();
            return linkTo(decl);
        } else if (e instanceof WImport) {
            WImport wImport = (WImport) e;
            WPackage p = wImport.attrImportedPackage();
            if (p == null) {
                return null;
            }
            return linkTo(p);
        } else if (e instanceof ExprNewObject) {
            ExprNewObject exprNew = (ExprNewObject) e;
            ConstructorDef def = exprNew.attrConstructorDef();
            return linkTo(def);
        } else if (e instanceof ModuleUse) {
            ModuleUse use = (ModuleUse) e;
            ModuleDef def = use.attrModuleDef();
            return linkTo(def);
        } else if (e instanceof ExprBinary) {
            ExprBinary eb = (ExprBinary) e;
            FunctionDefinition def = eb.attrFuncDef();
            if (def != null) {
                return linkTo(def);
            }
        }
        return Collections.emptyList();
    }

    private List<? extends Location> linkTo(AstElementWithSource decl) {
        if (decl == null) {
            return null;
        }
        WPos pos = decl.getSource();
        return Collections.singletonList(Convert.posToLocation(pos));
    }

    static class DefinitionInfo {
        private String filename;
        private int line;
        private int column;

        public DefinitionInfo(String filename, int line, int column) {
            this.filename = filename;
            this.line = line;
            this.column = column;
        }

        public String getFilename() {
            return filename;
        }

        public int getLine() {
            return line;
        }

        public int getColumn() {
            return column;
        }
    }
}
