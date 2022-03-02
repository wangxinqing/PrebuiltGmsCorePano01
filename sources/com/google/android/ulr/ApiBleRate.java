package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiBleRate extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("activeTimeMs", FastJsonResponse$Field.b("activeTimeMs"));
        a.put("bluetoothEnabled", FastJsonResponse$Field.e("bluetoothEnabled"));
        a.put("maxDelayMs", FastJsonResponse$Field.b("maxDelayMs"));
        a.put("minDelayMs", FastJsonResponse$Field.b("minDelayMs"));
        a.put("strategy", FastJsonResponse$Field.f("strategy"));
    }

    public ApiBleRate() {
    }

    public final Map a() {
        return a;
    }

    public final Long b() {
        return (Long) this.b.get("activeTimeMs");
    }

    public final Boolean c() {
        return (Boolean) this.b.get("bluetoothEnabled");
    }

    public final Long d() {
        return (Long) this.b.get("maxDelayMs");
    }

    public final Long e() {
        return (Long) this.b.get("minDelayMs");
    }

    public final String f() {
        return (String) this.b.get("strategy");
    }

    public ApiBleRate(Long l, Boolean bool, Long l2, Long l3, String str) {
        a("activeTimeMs", l.longValue());
        a("bluetoothEnabled", bool.booleanValue());
        a("maxDelayMs", l2.longValue());
        a("minDelayMs", l3.longValue());
        if (str != null) {
            a("strategy", str);
        }
    }
}
