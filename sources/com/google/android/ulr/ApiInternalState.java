package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiInternalState extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("internalStateId", FastJsonResponse$Field.a("internalStateId"));
    }

    public ApiInternalState() {
    }

    public final Map a() {
        return a;
    }

    public final Integer b() {
        return (Integer) this.b.get("internalStateId");
    }

    public ApiInternalState(Integer num) {
        a("internalStateId", num.intValue());
    }
}
