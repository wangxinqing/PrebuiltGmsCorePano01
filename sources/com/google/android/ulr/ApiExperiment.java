package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiExperiment extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("group", FastJsonResponse$Field.f("group"));
        a.put("id", FastJsonResponse$Field.a("id"));
        a.put("subgroup", FastJsonResponse$Field.a("subgroup"));
        a.put("type", FastJsonResponse$Field.f("type"));
    }

    public ApiExperiment() {
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("group");
    }

    public final Integer c() {
        return (Integer) this.b.get("id");
    }

    public final Integer d() {
        return (Integer) this.b.get("subgroup");
    }

    public final String e() {
        return (String) this.b.get("type");
    }

    public ApiExperiment(String str, Integer num, Integer num2) {
        if (str != null) {
            a("group", str);
        }
        a("id", num.intValue());
        if (num2 != null) {
            a("subgroup", num2.intValue());
        }
    }
}
