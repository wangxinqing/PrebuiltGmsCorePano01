package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiReadingInfo extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("batteryCharging", FastJsonResponse$Field.e("batteryCharging"));
        a.put("batteryCondition", FastJsonResponse$Field.a("batteryCondition", ApiBatteryCondition.class));
        a.put("batteryLevel", FastJsonResponse$Field.a("batteryLevel"));
        a.put("source", FastJsonResponse$Field.f("source"));
        a.put("wifiScans", FastJsonResponse$Field.b("wifiScans", WifiStrengthProto.class));
    }

    public ApiReadingInfo() {
    }

    public final Map a() {
        return a;
    }

    public final Boolean b() {
        return (Boolean) this.b.get("batteryCharging");
    }

    public final Integer c() {
        return (Integer) this.b.get("batteryLevel");
    }

    public final String d() {
        return (String) this.b.get("source");
    }

    public ApiBatteryCondition getBatteryCondition() {
        return (ApiBatteryCondition) this.c.get("batteryCondition");
    }

    public ArrayList getWifiScans() {
        return (ArrayList) this.d.get("wifiScans");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }

    public ApiReadingInfo(Boolean bool, ApiBatteryCondition apiBatteryCondition, String str, ArrayList arrayList) {
        if (bool != null) {
            a("batteryCharging", bool.booleanValue());
        }
        if (apiBatteryCondition != null) {
            a("batteryCondition", (jag) apiBatteryCondition);
        }
        if (str != null) {
            a("source", str);
        }
        if (arrayList != null) {
            a("wifiScans", arrayList);
        }
    }

    public final void a(String str, ArrayList arrayList) {
        this.d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.d.containsKey(str);
    }
}
