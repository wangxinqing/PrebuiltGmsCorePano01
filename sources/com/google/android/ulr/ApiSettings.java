package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiSettings extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("androidGcmRegistrationId", FastJsonResponse$Field.f("androidGcmRegistrationId"));
        a.put("concurrencyType", FastJsonResponse$Field.f("concurrencyType"));
        a.put("deleteOperations", FastJsonResponse$Field.b("deleteOperations", ApiDeleteHistoryOperation.class));
        a.put("historyEnabled", FastJsonResponse$Field.e("historyEnabled"));
        a.put("lastModifiedTimestampMs", FastJsonResponse$Field.b("lastModifiedTimestampMs"));
        a.put("legalCountryCode", FastJsonResponse$Field.f("legalCountryCode"));
        a.put("reportingEnabled", FastJsonResponse$Field.e("reportingEnabled"));
        a.put("source", FastJsonResponse$Field.f("source"));
        a.put("ulrRelatedGlobalSettings", FastJsonResponse$Field.a("ulrRelatedGlobalSettings", ApiDeviceSetting.class));
        a.put("userRestriction", FastJsonResponse$Field.f("userRestriction"));
    }

    public ApiSettings() {
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("userRestriction");
    }

    public ArrayList getDeleteOperations() {
        return (ArrayList) this.d.get("deleteOperations");
    }

    public ApiDeviceSetting getUlrRelatedGlobalSettings() {
        return (ApiDeviceSetting) this.c.get("ulrRelatedGlobalSettings");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }

    public ApiSettings(Boolean bool, Long l, Boolean bool2, ApiDeviceSetting apiDeviceSetting) {
        if (bool != null) {
            a("historyEnabled", bool.booleanValue());
        }
        if (l != null) {
            a("lastModifiedTimestampMs", l.longValue());
        }
        if (bool2 != null) {
            a("reportingEnabled", bool2.booleanValue());
        }
        a("ulrRelatedGlobalSettings", (jag) apiDeviceSetting);
    }

    public final void a(String str, ArrayList arrayList) {
        this.d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.d.containsKey(str);
    }
}
