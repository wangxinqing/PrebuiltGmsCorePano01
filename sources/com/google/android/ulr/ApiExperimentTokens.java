package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiExperimentTokens extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("additionalDirectExperimentTokens", FastJsonResponse$Field.g("additionalDirectExperimentTokens"));
        a.put("alwaysCrossExperimentTokens", FastJsonResponse$Field.g("alwaysCrossExperimentTokens"));
        a.put("directExperimentToken", FastJsonResponse$Field.f("directExperimentToken"));
        a.put("gaiaCrossExperimentTokens", FastJsonResponse$Field.g("gaiaCrossExperimentTokens"));
        a.put("otherCrossExperimentTokens", FastJsonResponse$Field.g("otherCrossExperimentTokens"));
        a.put("pseudonymousCrossExperimentTokens", FastJsonResponse$Field.g("pseudonymousCrossExperimentTokens"));
    }

    public ApiExperimentTokens() {
    }

    public final Map a() {
        return a;
    }

    public final ArrayList b() {
        return (ArrayList) this.b.get("additionalDirectExperimentTokens");
    }

    public final ArrayList c() {
        return (ArrayList) this.b.get("alwaysCrossExperimentTokens");
    }

    public final String d() {
        return (String) this.b.get("directExperimentToken");
    }

    public final ArrayList e() {
        return (ArrayList) this.b.get("gaiaCrossExperimentTokens");
    }

    public final ArrayList f() {
        return (ArrayList) this.b.get("otherCrossExperimentTokens");
    }

    public final ArrayList g() {
        return (ArrayList) this.b.get("pseudonymousCrossExperimentTokens");
    }

    public ApiExperimentTokens(ArrayList arrayList, ArrayList arrayList2, String str, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        if (arrayList != null) {
            i("additionalDirectExperimentTokens", arrayList);
        }
        if (arrayList2 != null) {
            i("alwaysCrossExperimentTokens", arrayList2);
        }
        if (str != null) {
            a("directExperimentToken", str);
        }
        if (arrayList3 != null) {
            i("gaiaCrossExperimentTokens", arrayList3);
        }
        if (arrayList4 != null) {
            i("otherCrossExperimentTokens", arrayList4);
        }
        if (arrayList5 != null) {
            i("pseudonymousCrossExperimentTokens", arrayList5);
        }
    }
}
