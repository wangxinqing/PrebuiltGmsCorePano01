package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class VisibleNetworkCell extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("cellId", FastJsonResponse$Field.a("cellId"));
        a.put("locationAreaCode", FastJsonResponse$Field.a("locationAreaCode"));
        a.put("mobileCountryCode", FastJsonResponse$Field.a("mobileCountryCode"));
        a.put("mobileNetworkCode", FastJsonResponse$Field.a("mobileNetworkCode"));
        a.put("physicalCellId", FastJsonResponse$Field.a("physicalCellId"));
        a.put("primaryScramblingCode", FastJsonResponse$Field.a("primaryScramblingCode"));
        a.put("trackingAreaCode", FastJsonResponse$Field.a("trackingAreaCode"));
        a.put("type", FastJsonResponse$Field.f("type"));
    }

    public final Map a() {
        return a;
    }

    public final Integer b() {
        return (Integer) this.b.get("cellId");
    }

    public final Integer c() {
        return (Integer) this.b.get("locationAreaCode");
    }

    public final Integer d() {
        return (Integer) this.b.get("mobileCountryCode");
    }

    public final Integer e() {
        return (Integer) this.b.get("mobileNetworkCode");
    }

    public final Integer f() {
        return (Integer) this.b.get("physicalCellId");
    }

    public final Integer g() {
        return (Integer) this.b.get("primaryScramblingCode");
    }

    public final Integer h() {
        return (Integer) this.b.get("trackingAreaCode");
    }

    public final String i() {
        return (String) this.b.get("type");
    }
}
