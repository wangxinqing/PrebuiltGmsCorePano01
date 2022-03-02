package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiModelState extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("stateId", FastJsonResponse$Field.a("stateId"));
        a.put("version", FastJsonResponse$Field.a("version"));
    }

    public final Map a() {
        return a;
    }

    public final Integer b() {
        return (Integer) this.b.get("stateId");
    }

    public final Integer c() {
        return (Integer) this.b.get("version");
    }
}
