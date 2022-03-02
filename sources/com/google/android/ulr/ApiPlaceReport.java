package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiPlaceReport extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("appSpecificTag", FastJsonResponse$Field.f("appSpecificTag"));
        a.put("callingAppPackageName", FastJsonResponse$Field.f("callingAppPackageName"));
        a.put("payload", FastJsonResponse$Field.a("payload", ApiPlaceReportPayload.class));
        a.put("placeId", FastJsonResponse$Field.f("placeId"));
        a.put("source", FastJsonResponse$Field.f("source"));
        a.put("type", FastJsonResponse$Field.f("type"));
    }

    public ApiPlaceReport() {
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("appSpecificTag");
    }

    public final String c() {
        return (String) this.b.get("callingAppPackageName");
    }

    public final String d() {
        return (String) this.b.get("placeId");
    }

    public final String e() {
        return (String) this.b.get("source");
    }

    public final String f() {
        return (String) this.b.get("type");
    }

    public ApiPlaceReportPayload getPayload() {
        return (ApiPlaceReportPayload) this.c.get("payload");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }

    public ApiPlaceReport(String str, String str2, String str3, String str4) {
        if (str != null) {
            a("appSpecificTag", str);
        }
        a("callingAppPackageName", str2);
        if (str3 != null) {
            a("placeId", str3);
        }
        if (str4 != null) {
            a("source", str4);
        }
    }
}
