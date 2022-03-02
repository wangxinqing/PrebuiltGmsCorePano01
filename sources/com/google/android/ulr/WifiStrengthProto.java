package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class WifiStrengthProto extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("collectionPoint", FastJsonResponse$Field.f("collectionPoint"));
        a.put("frequencyMhz", FastJsonResponse$Field.a("frequencyMhz"));
        a.put("isConnected", FastJsonResponse$Field.e("isConnected"));
        a.put("mac", FastJsonResponse$Field.b("mac"));
        a.put("rttRanging", FastJsonResponse$Field.a("rttRanging", RttRangingProto.class));
        a.put("ssid", FastJsonResponse$Field.f("ssid"));
        a.put("strength", FastJsonResponse$Field.a("strength"));
        a.put("wifiAuthType", FastJsonResponse$Field.f("wifiAuthType"));
    }

    public WifiStrengthProto() {
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("collectionPoint");
    }

    public final Integer c() {
        return (Integer) this.b.get("frequencyMhz");
    }

    public final Boolean d() {
        return (Boolean) this.b.get("isConnected");
    }

    public final Long e() {
        return (Long) this.b.get("mac");
    }

    public final String f() {
        return (String) this.b.get("ssid");
    }

    public final Integer g() {
        return (Integer) this.b.get("strength");
    }

    public RttRangingProto getRttRanging() {
        return (RttRangingProto) this.c.get("rttRanging");
    }

    public final String h() {
        return (String) this.b.get("wifiAuthType");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }

    public WifiStrengthProto(Integer num, Boolean bool, Long l, RttRangingProto rttRangingProto, String str, Integer num2, String str2) {
        a("frequencyMhz", num.intValue());
        if (bool != null) {
            a("isConnected", bool.booleanValue());
        }
        a("mac", l.longValue());
        if (rttRangingProto != null) {
            a("rttRanging", (jag) rttRangingProto);
        }
        if (str != null) {
            a("ssid", str);
        }
        a("strength", num2.intValue());
        if (str2 != null) {
            a("wifiAuthType", str2);
        }
    }
}
