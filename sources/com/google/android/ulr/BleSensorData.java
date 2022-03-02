package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BleSensorData extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("data", FastJsonResponse$Field.f("data"));
        a.put("mac", FastJsonResponse$Field.b("mac"));
        a.put("type", FastJsonResponse$Field.f("type"));
    }

    public BleSensorData() {
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("data");
    }

    public final Long c() {
        return (Long) this.b.get("mac");
    }

    public final String d() {
        return (String) this.b.get("type");
    }

    public BleSensorData(String str, Long l, String str2) {
        if (str != null) {
            a("data", str);
        }
        a("mac", l.longValue());
        a("type", str2);
    }
}
