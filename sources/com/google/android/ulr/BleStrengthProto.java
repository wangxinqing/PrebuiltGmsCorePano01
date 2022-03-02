package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BleStrengthProto extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("id", FastJsonResponse$Field.f("id"));
        a.put("mac", FastJsonResponse$Field.b("mac"));
        a.put("rssiDbm", FastJsonResponse$Field.a("rssiDbm"));
        a.put("txPowerDbm", FastJsonResponse$Field.a("txPowerDbm"));
        a.put("type", FastJsonResponse$Field.f("type"));
    }

    public BleStrengthProto() {
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("id");
    }

    public final Long c() {
        return (Long) this.b.get("mac");
    }

    public final Integer d() {
        return (Integer) this.b.get("rssiDbm");
    }

    public final Integer e() {
        return (Integer) this.b.get("txPowerDbm");
    }

    public final String f() {
        return (String) this.b.get("type");
    }

    public BleStrengthProto(String str, Long l, Integer num, Integer num2, String str2) {
        if (str != null) {
            a("id", str);
        }
        a("mac", l.longValue());
        if (num != null) {
            a("rssiDbm", num.intValue());
        }
        if (num2 != null) {
            a("txPowerDbm", num2.intValue());
        }
        a("type", str2);
    }
}
