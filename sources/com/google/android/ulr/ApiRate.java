package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiRate extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("bleRate", FastJsonResponse$Field.a("bleRate", ApiBleRate.class));
        a.put("description", FastJsonResponse$Field.f("description"));
        a.put("newRequest", FastJsonResponse$Field.e("newRequest"));
        a.put("samplePeriodMs", FastJsonResponse$Field.b("samplePeriodMs"));
        a.put("sampleReason", FastJsonResponse$Field.f("sampleReason"));
        a.put("sampleSource", FastJsonResponse$Field.f("sampleSource"));
        a.put("timestampMs", FastJsonResponse$Field.b("timestampMs"));
        a.put("uploadPeriodMs", FastJsonResponse$Field.b("uploadPeriodMs"));
        a.put("uploadReason", FastJsonResponse$Field.f("uploadReason"));
        a.put("uploadSource", FastJsonResponse$Field.f("uploadSource"));
    }

    public ApiRate() {
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("description");
    }

    public final Boolean c() {
        return (Boolean) this.b.get("newRequest");
    }

    public final Long d() {
        return (Long) this.b.get("samplePeriodMs");
    }

    public final String e() {
        return (String) this.b.get("sampleReason");
    }

    public final String f() {
        return (String) this.b.get("sampleSource");
    }

    public final Long g() {
        return (Long) this.b.get("timestampMs");
    }

    public ApiBleRate getBleRate() {
        return (ApiBleRate) this.c.get("bleRate");
    }

    public final Long h() {
        return (Long) this.b.get("uploadPeriodMs");
    }

    public final String i() {
        return (String) this.b.get("uploadReason");
    }

    public final String j() {
        return (String) this.b.get("uploadSource");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }

    public ApiRate(ApiBleRate apiBleRate, String str, Boolean bool, Long l, String str2, String str3, Long l2, Long l3, String str4, String str5) {
        if (apiBleRate != null) {
            a("bleRate", (jag) apiBleRate);
        }
        if (str != null) {
            a("description", str);
        }
        if (bool != null) {
            a("newRequest", bool.booleanValue());
        }
        if (l != null) {
            a("samplePeriodMs", l.longValue());
        }
        if (str2 != null) {
            a("sampleReason", str2);
        }
        if (str3 != null) {
            a("sampleSource", str3);
        }
        if (l2 != null) {
            a("timestampMs", l2.longValue());
        }
        if (l3 != null) {
            a("uploadPeriodMs", l3.longValue());
        }
        if (str4 != null) {
            a("uploadReason", str4);
        }
        if (str5 != null) {
            a("uploadSource", str5);
        }
    }
}
