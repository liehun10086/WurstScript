package de.peeeq.wurstscript.attributes;

import de.peeeq.wurstscript.ast.*;
import de.peeeq.wurstscript.attributes.names.NameLink;
import org.eclipse.jdt.annotation.Nullable;

import java.util.Collection;

public class CofigActualDef {

    public static NameDef calculate(NameDef d) {
        // default is to be not configurable
        return d;
    }


    public static NameDef calculate(GlobalVarDef g) {
        WPackage p = getConfigPackage(g);
        if (p != null) {
            NameDef v = p.getElements().lookupVarNoConfig(g.getName(), false);
            if (v != null && hasConfigAnnotation(v)) {
                return v;
            }
        }
        // not configured
        return g;
    }

    public static NameDef calculate(FuncDef f) {
        WPackage p = getConfigPackage(f);
        if (p != null) {
            Collection<NameLink> links = p.getElements().lookupFuncsNoConfig(f.getName(), false);
            for (NameLink link : links) {
                if (hasConfigAnnotation(link.getNameDef())) {
                    return link.getNameDef();
                }
            }
        }
        // not configured
        return f;
    }


    private static boolean hasConfigAnnotation(NameDef v) {
        return v.hasAnnotation("@config");
    }


    private static @Nullable WPackage getConfigPackage(Element e) {
        PackageOrGlobal p = e.attrNearestPackage();
        return p.getModel().attrConfigOverridePackages().get(p);
    }


}
