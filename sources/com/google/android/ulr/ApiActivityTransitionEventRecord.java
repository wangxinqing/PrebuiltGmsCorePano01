package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiActivityTransitionEventRecord extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("activityType", FastJsonResponse$Field.f("activityType"));
        a.put("timestampMs", FastJsonResponse$Field.b("timestampMs"));
        a.put("type", FastJsonResponse$Field.f("type"));
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("activityType");
    }

    public final Long c() {
        return (Long) this.b.get("timestampMs");
    }

    public final String d() {
        return (String) this.b.get("type");
    }
}
