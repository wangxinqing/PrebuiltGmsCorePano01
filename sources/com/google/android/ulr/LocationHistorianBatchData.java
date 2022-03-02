package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LocationHistorianBatchData extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("data", FastJsonResponse$Field.f("data"));
        a.put("timeZone", FastJsonResponse$Field.f("timeZone"));
        a.put("version", FastJsonResponse$Field.a("version"));
    }

    public LocationHistorianBatchData() {
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("data");
    }

    public final String c() {
        return (String) this.b.get("timeZone");
    }

    public final Integer d() {
        return (Integer) this.b.get("version");
    }

    public LocationHistorianBatchData(String str, String str2, Integer num) {
        if (str != null) {
            a("data", str);
        }
        if (str2 != null) {
            a("timeZone", str2);
        }
        a("version", num.intValue());
    }
}
