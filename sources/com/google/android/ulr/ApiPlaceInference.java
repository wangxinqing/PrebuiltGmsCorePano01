package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiPlaceInference extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("likelihoodE4", FastJsonResponse$Field.a("likelihoodE4"));
        a.put("placeId", FastJsonResponse$Field.f("placeId"));
    }

    public ApiPlaceInference() {
    }

    public final Map a() {
        return a;
    }

    public final Integer b() {
        return (Integer) this.b.get("likelihoodE4");
    }

    public final String c() {
        return (String) this.b.get("placeId");
    }

    public ApiPlaceInference(Integer num, String str) {
        a("likelihoodE4", num.intValue());
        if (str != null) {
            a("placeId", str);
        }
    }
}
