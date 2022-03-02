package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LatLng extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("latitudeE7", FastJsonResponse$Field.a("latitudeE7"));
        a.put("longitudeE7", FastJsonResponse$Field.a("longitudeE7"));
    }

    public final Map a() {
        return a;
    }

    public final Integer b() {
        return (Integer) this.b.get("latitudeE7");
    }

    public final Integer c() {
        return (Integer) this.b.get("longitudeE7");
    }
}
