package de.peeeq.wurstscript.ast;

import katja.common.KatjaSort;

public interface WScopePos extends de.peeeq.wurstscript.ast.AST.SortPos {

    //----- methods of WScopePos -----

    public KatjaSort term();
    public de.peeeq.wurstscript.ast.WScope termWScope();
    public <CT, E extends Throwable> CT Switch(de.peeeq.wurstscript.ast.WScopePos.Switch<CT, E> switchClass) throws E;

    //----- nested classes of WScopePos -----

    public static interface Switch<CT, E extends Throwable> extends de.peeeq.wurstscript.ast.PackageOrGlobalPos.Switch<CT, E> {

        //----- methods of Switch<CT, E extends Throwable> -----

        public CT CaseClassDefPos(de.peeeq.wurstscript.ast.ClassDefPos term) throws E;
        public CT CaseFuncDefPos(de.peeeq.wurstscript.ast.FuncDefPos term) throws E;
        public CT CaseConstructorDefPos(de.peeeq.wurstscript.ast.ConstructorDefPos term) throws E;
        public CT CaseOnDestroyDefPos(de.peeeq.wurstscript.ast.OnDestroyDefPos term) throws E;
        public CT CaseInitBlockPos(de.peeeq.wurstscript.ast.InitBlockPos term) throws E;
    }

    static interface VisitorType<E extends Throwable> {

        //----- methods of VisitorType<E extends Throwable> -----

        public void visit(de.peeeq.wurstscript.ast.WPosPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.VisibilityModifierPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StringPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.BooleanPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ClassSlotsPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.VisibilityPublicPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.VisibilityPrivatePos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.VisibilityPublicreadPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.VisibilityProtectedPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.VisibilityDefaultPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.IntegerPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ClassSlotPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ConstructorDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OnDestroyDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ClassMemberPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.GlobalVarDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.FuncDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WParametersPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WStatementsPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OptTypeExprPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OptExprPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.FuncSignaturePos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.NoTypeExprPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.TypeExprPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.NoExprPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprAssignablePos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprBinaryPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprUnaryPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprMemberVarPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprMemberArrayVarPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprMemberMethodPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprFunctionCallPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprNewObjectPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprCastPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprAtomicPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprVarAccessPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprVarArrayAccessPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprIntValPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprRealValPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprStringValPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprBoolValPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprFuncRefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprThisPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ExprNullPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WParameterPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WStatementPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ArraySizesPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpBinaryPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpUnaryPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.IndexesPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ArgumentsPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.DoublePos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtIfPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtWhilePos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtLoopPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.LocalVarDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtSetPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtCallPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtReturnPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtDestroyPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtIncRefCountPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtDecRefCountPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtErrPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.StmtExitwhenPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpOrPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpAndPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpEqualsPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpUnequalsPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpLessEqPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpLessPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpGreaterEqPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpGreaterPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpPlusPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpMinusPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpMultPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpDivRealPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpModRealPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpModIntPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpDivIntPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpNotPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpAssignmentPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.OpAssignPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WImportsPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WEntitiesPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WImportPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WEntityPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.TypeDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.InitBlockPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.NativeFuncPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.NativeTypePos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.ClassDefPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.TopLevelDeclarationPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WPackagePos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.JassToplevelDeclarationPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.JassGlobalBlockPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.FunctionDefinitionPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.WScopePos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.PackageOrGlobalPos term) throws E;
        public void visit(de.peeeq.wurstscript.ast.CompilationUnitPos term) throws E;
    }

    public static abstract class Visitor<E extends Throwable> implements de.peeeq.wurstscript.ast.WScopePos.VisitorType<E> {

        //----- attributes of Visitor<E extends Throwable> -----

        private final de.peeeq.wurstscript.ast.ClassMemberPos.Switch<Object, E> variantVisit$ClassMemberPos = new de.peeeq.wurstscript.ast.ClassMemberPos.Switch<Object, E>() { public final Object CaseGlobalVarDefPos(de.peeeq.wurstscript.ast.GlobalVarDefPos term) throws E { visit(term); return null; } public final Object CaseFuncDefPos(de.peeeq.wurstscript.ast.FuncDefPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.ClassSlotPos.Switch<Object, E> variantVisit$ClassSlotPos = new de.peeeq.wurstscript.ast.ClassSlotPos.Switch<Object, E>() { public final Object CaseConstructorDefPos(de.peeeq.wurstscript.ast.ConstructorDefPos term) throws E { visit(term); return null; } public final Object CaseOnDestroyDefPos(de.peeeq.wurstscript.ast.OnDestroyDefPos term) throws E { visit(term); return null; } public final Object CaseGlobalVarDefPos(de.peeeq.wurstscript.ast.GlobalVarDefPos term) throws E { visit(term); return null; } public final Object CaseFuncDefPos(de.peeeq.wurstscript.ast.FuncDefPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.ExprAssignablePos.Switch<Object, E> variantVisit$ExprAssignablePos = new de.peeeq.wurstscript.ast.ExprAssignablePos.Switch<Object, E>() { public final Object CaseExprMemberVarPos(de.peeeq.wurstscript.ast.ExprMemberVarPos term) throws E { visit(term); return null; } public final Object CaseExprMemberArrayVarPos(de.peeeq.wurstscript.ast.ExprMemberArrayVarPos term) throws E { visit(term); return null; } public final Object CaseExprVarAccessPos(de.peeeq.wurstscript.ast.ExprVarAccessPos term) throws E { visit(term); return null; } public final Object CaseExprVarArrayAccessPos(de.peeeq.wurstscript.ast.ExprVarArrayAccessPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.ExprAtomicPos.Switch<Object, E> variantVisit$ExprAtomicPos = new de.peeeq.wurstscript.ast.ExprAtomicPos.Switch<Object, E>() { public final Object CaseExprIntValPos(de.peeeq.wurstscript.ast.ExprIntValPos term) throws E { visit(term); return null; } public final Object CaseExprRealValPos(de.peeeq.wurstscript.ast.ExprRealValPos term) throws E { visit(term); return null; } public final Object CaseExprStringValPos(de.peeeq.wurstscript.ast.ExprStringValPos term) throws E { visit(term); return null; } public final Object CaseExprBoolValPos(de.peeeq.wurstscript.ast.ExprBoolValPos term) throws E { visit(term); return null; } public final Object CaseExprFuncRefPos(de.peeeq.wurstscript.ast.ExprFuncRefPos term) throws E { visit(term); return null; } public final Object CaseExprVarAccessPos(de.peeeq.wurstscript.ast.ExprVarAccessPos term) throws E { visit(term); return null; } public final Object CaseExprVarArrayAccessPos(de.peeeq.wurstscript.ast.ExprVarArrayAccessPos term) throws E { visit(term); return null; } public final Object CaseExprThisPos(de.peeeq.wurstscript.ast.ExprThisPos term) throws E { visit(term); return null; } public final Object CaseExprNullPos(de.peeeq.wurstscript.ast.ExprNullPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.ExprPos.Switch<Object, E> variantVisit$ExprPos = new de.peeeq.wurstscript.ast.ExprPos.Switch<Object, E>() { public final Object CaseExprBinaryPos(de.peeeq.wurstscript.ast.ExprBinaryPos term) throws E { visit(term); return null; } public final Object CaseExprUnaryPos(de.peeeq.wurstscript.ast.ExprUnaryPos term) throws E { visit(term); return null; } public final Object CaseExprMemberVarPos(de.peeeq.wurstscript.ast.ExprMemberVarPos term) throws E { visit(term); return null; } public final Object CaseExprMemberArrayVarPos(de.peeeq.wurstscript.ast.ExprMemberArrayVarPos term) throws E { visit(term); return null; } public final Object CaseExprMemberMethodPos(de.peeeq.wurstscript.ast.ExprMemberMethodPos term) throws E { visit(term); return null; } public final Object CaseExprFunctionCallPos(de.peeeq.wurstscript.ast.ExprFunctionCallPos term) throws E { visit(term); return null; } public final Object CaseExprNewObjectPos(de.peeeq.wurstscript.ast.ExprNewObjectPos term) throws E { visit(term); return null; } public final Object CaseExprCastPos(de.peeeq.wurstscript.ast.ExprCastPos term) throws E { visit(term); return null; } public final Object CaseExprVarAccessPos(de.peeeq.wurstscript.ast.ExprVarAccessPos term) throws E { visit(term); return null; } public final Object CaseExprVarArrayAccessPos(de.peeeq.wurstscript.ast.ExprVarArrayAccessPos term) throws E { visit(term); return null; } public final Object CaseExprIntValPos(de.peeeq.wurstscript.ast.ExprIntValPos term) throws E { visit(term); return null; } public final Object CaseExprRealValPos(de.peeeq.wurstscript.ast.ExprRealValPos term) throws E { visit(term); return null; } public final Object CaseExprStringValPos(de.peeeq.wurstscript.ast.ExprStringValPos term) throws E { visit(term); return null; } public final Object CaseExprBoolValPos(de.peeeq.wurstscript.ast.ExprBoolValPos term) throws E { visit(term); return null; } public final Object CaseExprFuncRefPos(de.peeeq.wurstscript.ast.ExprFuncRefPos term) throws E { visit(term); return null; } public final Object CaseExprThisPos(de.peeeq.wurstscript.ast.ExprThisPos term) throws E { visit(term); return null; } public final Object CaseExprNullPos(de.peeeq.wurstscript.ast.ExprNullPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.FunctionDefinitionPos.Switch<Object, E> variantVisit$FunctionDefinitionPos = new de.peeeq.wurstscript.ast.FunctionDefinitionPos.Switch<Object, E>() { public final Object CaseFuncDefPos(de.peeeq.wurstscript.ast.FuncDefPos term) throws E { visit(term); return null; } public final Object CaseNativeFuncPos(de.peeeq.wurstscript.ast.NativeFuncPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.JassToplevelDeclarationPos.Switch<Object, E> variantVisit$JassToplevelDeclarationPos = new de.peeeq.wurstscript.ast.JassToplevelDeclarationPos.Switch<Object, E>() { public final Object CaseJassGlobalBlockPos(de.peeeq.wurstscript.ast.JassGlobalBlockPos term) throws E { visit(term); return null; } public final Object CaseNativeTypePos(de.peeeq.wurstscript.ast.NativeTypePos term) throws E { visit(term); return null; } public final Object CaseFuncDefPos(de.peeeq.wurstscript.ast.FuncDefPos term) throws E { visit(term); return null; } public final Object CaseNativeFuncPos(de.peeeq.wurstscript.ast.NativeFuncPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.OpAssignmentPos.Switch<Object, E> variantVisit$OpAssignmentPos = new de.peeeq.wurstscript.ast.OpAssignmentPos.Switch<Object, E>() { public final Object CaseOpAssignPos(de.peeeq.wurstscript.ast.OpAssignPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.OpBinaryPos.Switch<Object, E> variantVisit$OpBinaryPos = new de.peeeq.wurstscript.ast.OpBinaryPos.Switch<Object, E>() { public final Object CaseOpOrPos(de.peeeq.wurstscript.ast.OpOrPos term) throws E { visit(term); return null; } public final Object CaseOpAndPos(de.peeeq.wurstscript.ast.OpAndPos term) throws E { visit(term); return null; } public final Object CaseOpEqualsPos(de.peeeq.wurstscript.ast.OpEqualsPos term) throws E { visit(term); return null; } public final Object CaseOpUnequalsPos(de.peeeq.wurstscript.ast.OpUnequalsPos term) throws E { visit(term); return null; } public final Object CaseOpLessEqPos(de.peeeq.wurstscript.ast.OpLessEqPos term) throws E { visit(term); return null; } public final Object CaseOpLessPos(de.peeeq.wurstscript.ast.OpLessPos term) throws E { visit(term); return null; } public final Object CaseOpGreaterEqPos(de.peeeq.wurstscript.ast.OpGreaterEqPos term) throws E { visit(term); return null; } public final Object CaseOpGreaterPos(de.peeeq.wurstscript.ast.OpGreaterPos term) throws E { visit(term); return null; } public final Object CaseOpPlusPos(de.peeeq.wurstscript.ast.OpPlusPos term) throws E { visit(term); return null; } public final Object CaseOpMinusPos(de.peeeq.wurstscript.ast.OpMinusPos term) throws E { visit(term); return null; } public final Object CaseOpMultPos(de.peeeq.wurstscript.ast.OpMultPos term) throws E { visit(term); return null; } public final Object CaseOpDivRealPos(de.peeeq.wurstscript.ast.OpDivRealPos term) throws E { visit(term); return null; } public final Object CaseOpModRealPos(de.peeeq.wurstscript.ast.OpModRealPos term) throws E { visit(term); return null; } public final Object CaseOpModIntPos(de.peeeq.wurstscript.ast.OpModIntPos term) throws E { visit(term); return null; } public final Object CaseOpDivIntPos(de.peeeq.wurstscript.ast.OpDivIntPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.OpUnaryPos.Switch<Object, E> variantVisit$OpUnaryPos = new de.peeeq.wurstscript.ast.OpUnaryPos.Switch<Object, E>() { public final Object CaseOpNotPos(de.peeeq.wurstscript.ast.OpNotPos term) throws E { visit(term); return null; } public final Object CaseOpMinusPos(de.peeeq.wurstscript.ast.OpMinusPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.OptExprPos.Switch<Object, E> variantVisit$OptExprPos = new de.peeeq.wurstscript.ast.OptExprPos.Switch<Object, E>() { public final Object CaseNoExprPos(de.peeeq.wurstscript.ast.NoExprPos term) throws E { visit(term); return null; } public final Object CaseExprBinaryPos(de.peeeq.wurstscript.ast.ExprBinaryPos term) throws E { visit(term); return null; } public final Object CaseExprUnaryPos(de.peeeq.wurstscript.ast.ExprUnaryPos term) throws E { visit(term); return null; } public final Object CaseExprMemberVarPos(de.peeeq.wurstscript.ast.ExprMemberVarPos term) throws E { visit(term); return null; } public final Object CaseExprMemberArrayVarPos(de.peeeq.wurstscript.ast.ExprMemberArrayVarPos term) throws E { visit(term); return null; } public final Object CaseExprMemberMethodPos(de.peeeq.wurstscript.ast.ExprMemberMethodPos term) throws E { visit(term); return null; } public final Object CaseExprFunctionCallPos(de.peeeq.wurstscript.ast.ExprFunctionCallPos term) throws E { visit(term); return null; } public final Object CaseExprNewObjectPos(de.peeeq.wurstscript.ast.ExprNewObjectPos term) throws E { visit(term); return null; } public final Object CaseExprCastPos(de.peeeq.wurstscript.ast.ExprCastPos term) throws E { visit(term); return null; } public final Object CaseExprVarAccessPos(de.peeeq.wurstscript.ast.ExprVarAccessPos term) throws E { visit(term); return null; } public final Object CaseExprVarArrayAccessPos(de.peeeq.wurstscript.ast.ExprVarArrayAccessPos term) throws E { visit(term); return null; } public final Object CaseExprIntValPos(de.peeeq.wurstscript.ast.ExprIntValPos term) throws E { visit(term); return null; } public final Object CaseExprRealValPos(de.peeeq.wurstscript.ast.ExprRealValPos term) throws E { visit(term); return null; } public final Object CaseExprStringValPos(de.peeeq.wurstscript.ast.ExprStringValPos term) throws E { visit(term); return null; } public final Object CaseExprBoolValPos(de.peeeq.wurstscript.ast.ExprBoolValPos term) throws E { visit(term); return null; } public final Object CaseExprFuncRefPos(de.peeeq.wurstscript.ast.ExprFuncRefPos term) throws E { visit(term); return null; } public final Object CaseExprThisPos(de.peeeq.wurstscript.ast.ExprThisPos term) throws E { visit(term); return null; } public final Object CaseExprNullPos(de.peeeq.wurstscript.ast.ExprNullPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.OptTypeExprPos.Switch<Object, E> variantVisit$OptTypeExprPos = new de.peeeq.wurstscript.ast.OptTypeExprPos.Switch<Object, E>() { public final Object CaseNoTypeExprPos(de.peeeq.wurstscript.ast.NoTypeExprPos term) throws E { visit(term); return null; } public final Object CaseTypeExprPos(de.peeeq.wurstscript.ast.TypeExprPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.PackageOrGlobalPos.Switch<Object, E> variantVisit$PackageOrGlobalPos = new de.peeeq.wurstscript.ast.PackageOrGlobalPos.Switch<Object, E>() { public final Object CaseWPackagePos(de.peeeq.wurstscript.ast.WPackagePos term) throws E { visit(term); return null; } public final Object CaseCompilationUnitPos(de.peeeq.wurstscript.ast.CompilationUnitPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.StmtCallPos.Switch<Object, E> variantVisit$StmtCallPos = new de.peeeq.wurstscript.ast.StmtCallPos.Switch<Object, E>() { public final Object CaseExprMemberMethodPos(de.peeeq.wurstscript.ast.ExprMemberMethodPos term) throws E { visit(term); return null; } public final Object CaseExprFunctionCallPos(de.peeeq.wurstscript.ast.ExprFunctionCallPos term) throws E { visit(term); return null; } public final Object CaseExprNewObjectPos(de.peeeq.wurstscript.ast.ExprNewObjectPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.TopLevelDeclarationPos.Switch<Object, E> variantVisit$TopLevelDeclarationPos = new de.peeeq.wurstscript.ast.TopLevelDeclarationPos.Switch<Object, E>() { public final Object CaseWPackagePos(de.peeeq.wurstscript.ast.WPackagePos term) throws E { visit(term); return null; } public final Object CaseJassGlobalBlockPos(de.peeeq.wurstscript.ast.JassGlobalBlockPos term) throws E { visit(term); return null; } public final Object CaseNativeTypePos(de.peeeq.wurstscript.ast.NativeTypePos term) throws E { visit(term); return null; } public final Object CaseFuncDefPos(de.peeeq.wurstscript.ast.FuncDefPos term) throws E { visit(term); return null; } public final Object CaseNativeFuncPos(de.peeeq.wurstscript.ast.NativeFuncPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.TypeDefPos.Switch<Object, E> variantVisit$TypeDefPos = new de.peeeq.wurstscript.ast.TypeDefPos.Switch<Object, E>() { public final Object CaseNativeTypePos(de.peeeq.wurstscript.ast.NativeTypePos term) throws E { visit(term); return null; } public final Object CaseClassDefPos(de.peeeq.wurstscript.ast.ClassDefPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.VisibilityModifierPos.Switch<Object, E> variantVisit$VisibilityModifierPos = new de.peeeq.wurstscript.ast.VisibilityModifierPos.Switch<Object, E>() { public final Object CaseVisibilityPublicPos(de.peeeq.wurstscript.ast.VisibilityPublicPos term) throws E { visit(term); return null; } public final Object CaseVisibilityPrivatePos(de.peeeq.wurstscript.ast.VisibilityPrivatePos term) throws E { visit(term); return null; } public final Object CaseVisibilityPublicreadPos(de.peeeq.wurstscript.ast.VisibilityPublicreadPos term) throws E { visit(term); return null; } public final Object CaseVisibilityProtectedPos(de.peeeq.wurstscript.ast.VisibilityProtectedPos term) throws E { visit(term); return null; } public final Object CaseVisibilityDefaultPos(de.peeeq.wurstscript.ast.VisibilityDefaultPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.WEntityPos.Switch<Object, E> variantVisit$WEntityPos = new de.peeeq.wurstscript.ast.WEntityPos.Switch<Object, E>() { public final Object CaseFuncDefPos(de.peeeq.wurstscript.ast.FuncDefPos term) throws E { visit(term); return null; } public final Object CaseGlobalVarDefPos(de.peeeq.wurstscript.ast.GlobalVarDefPos term) throws E { visit(term); return null; } public final Object CaseInitBlockPos(de.peeeq.wurstscript.ast.InitBlockPos term) throws E { visit(term); return null; } public final Object CaseNativeFuncPos(de.peeeq.wurstscript.ast.NativeFuncPos term) throws E { visit(term); return null; } public final Object CaseNativeTypePos(de.peeeq.wurstscript.ast.NativeTypePos term) throws E { visit(term); return null; } public final Object CaseClassDefPos(de.peeeq.wurstscript.ast.ClassDefPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.WScopePos.Switch<Object, E> variantVisit$WScopePos = new de.peeeq.wurstscript.ast.WScopePos.Switch<Object, E>() { public final Object CaseClassDefPos(de.peeeq.wurstscript.ast.ClassDefPos term) throws E { visit(term); return null; } public final Object CaseFuncDefPos(de.peeeq.wurstscript.ast.FuncDefPos term) throws E { visit(term); return null; } public final Object CaseConstructorDefPos(de.peeeq.wurstscript.ast.ConstructorDefPos term) throws E { visit(term); return null; } public final Object CaseOnDestroyDefPos(de.peeeq.wurstscript.ast.OnDestroyDefPos term) throws E { visit(term); return null; } public final Object CaseInitBlockPos(de.peeeq.wurstscript.ast.InitBlockPos term) throws E { visit(term); return null; } public final Object CaseWPackagePos(de.peeeq.wurstscript.ast.WPackagePos term) throws E { visit(term); return null; } public final Object CaseCompilationUnitPos(de.peeeq.wurstscript.ast.CompilationUnitPos term) throws E { visit(term); return null; } };
        private final de.peeeq.wurstscript.ast.WStatementPos.Switch<Object, E> variantVisit$WStatementPos = new de.peeeq.wurstscript.ast.WStatementPos.Switch<Object, E>() { public final Object CaseStmtIfPos(de.peeeq.wurstscript.ast.StmtIfPos term) throws E { visit(term); return null; } public final Object CaseStmtWhilePos(de.peeeq.wurstscript.ast.StmtWhilePos term) throws E { visit(term); return null; } public final Object CaseStmtLoopPos(de.peeeq.wurstscript.ast.StmtLoopPos term) throws E { visit(term); return null; } public final Object CaseLocalVarDefPos(de.peeeq.wurstscript.ast.LocalVarDefPos term) throws E { visit(term); return null; } public final Object CaseStmtSetPos(de.peeeq.wurstscript.ast.StmtSetPos term) throws E { visit(term); return null; } public final Object CaseStmtReturnPos(de.peeeq.wurstscript.ast.StmtReturnPos term) throws E { visit(term); return null; } public final Object CaseStmtDestroyPos(de.peeeq.wurstscript.ast.StmtDestroyPos term) throws E { visit(term); return null; } public final Object CaseStmtIncRefCountPos(de.peeeq.wurstscript.ast.StmtIncRefCountPos term) throws E { visit(term); return null; } public final Object CaseStmtDecRefCountPos(de.peeeq.wurstscript.ast.StmtDecRefCountPos term) throws E { visit(term); return null; } public final Object CaseStmtErrPos(de.peeeq.wurstscript.ast.StmtErrPos term) throws E { visit(term); return null; } public final Object CaseStmtExitwhenPos(de.peeeq.wurstscript.ast.StmtExitwhenPos term) throws E { visit(term); return null; } public final Object CaseExprMemberMethodPos(de.peeeq.wurstscript.ast.ExprMemberMethodPos term) throws E { visit(term); return null; } public final Object CaseExprFunctionCallPos(de.peeeq.wurstscript.ast.ExprFunctionCallPos term) throws E { visit(term); return null; } public final Object CaseExprNewObjectPos(de.peeeq.wurstscript.ast.ExprNewObjectPos term) throws E { visit(term); return null; } };

        //----- methods of Visitor<E extends Throwable> -----

        public final void visit(de.peeeq.wurstscript.ast.ClassMemberPos term) throws E {
            term.Switch(variantVisit$ClassMemberPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.ClassSlotPos term) throws E {
            term.Switch(variantVisit$ClassSlotPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.ExprAssignablePos term) throws E {
            term.Switch(variantVisit$ExprAssignablePos);
        }

        public final void visit(de.peeeq.wurstscript.ast.ExprAtomicPos term) throws E {
            term.Switch(variantVisit$ExprAtomicPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.ExprPos term) throws E {
            term.Switch(variantVisit$ExprPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.FunctionDefinitionPos term) throws E {
            term.Switch(variantVisit$FunctionDefinitionPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.JassToplevelDeclarationPos term) throws E {
            term.Switch(variantVisit$JassToplevelDeclarationPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.OpAssignmentPos term) throws E {
            term.Switch(variantVisit$OpAssignmentPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.OpBinaryPos term) throws E {
            term.Switch(variantVisit$OpBinaryPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.OpUnaryPos term) throws E {
            term.Switch(variantVisit$OpUnaryPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.OptExprPos term) throws E {
            term.Switch(variantVisit$OptExprPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.OptTypeExprPos term) throws E {
            term.Switch(variantVisit$OptTypeExprPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.PackageOrGlobalPos term) throws E {
            term.Switch(variantVisit$PackageOrGlobalPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.StmtCallPos term) throws E {
            term.Switch(variantVisit$StmtCallPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.TopLevelDeclarationPos term) throws E {
            term.Switch(variantVisit$TopLevelDeclarationPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.TypeDefPos term) throws E {
            term.Switch(variantVisit$TypeDefPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.VisibilityModifierPos term) throws E {
            term.Switch(variantVisit$VisibilityModifierPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.WEntityPos term) throws E {
            term.Switch(variantVisit$WEntityPos);
        }

        public final void visit(de.peeeq.wurstscript.ast.WScopePos term) throws E {
            term.Switch(variantVisit$WScopePos);
        }

        public final void visit(de.peeeq.wurstscript.ast.WStatementPos term) throws E {
            term.Switch(variantVisit$WStatementPos);
        }
    }
}
