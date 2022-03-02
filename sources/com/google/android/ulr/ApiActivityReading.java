package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiActivityReading extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("activities", FastJsonResponse$Field.b("activities", ApiActivity.class));
        a.put("extras", FastJsonResponse$Field.b("extras", ApiActivityExtraRow.class));
        a.put("readingInfo", FastJsonResponse$Field.a("readingInfo", ApiReadingInfo.class));
        a.put("timestampMs", FastJsonResponse$Field.b("timestampMs"));
    }

    public ApiActivityReading() {
    }

    public final Map a() {
        return a;
    }

    public final Long b() {
        return (Long) this.b.get("timestampMs");
    }

    public ArrayList getActivities() {
        return (ArrayList) this.d.get("activities");
    }

    public ArrayList getExtras() {
        return (ArrayList) this.d.get("extras");
    }

    public ApiReadingInfo getReadingInfo() {
        return (ApiReadingInfo) this.c.get("readingInfo");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }

    public ApiActivityReading(ArrayList arrayList, ArrayList arrayList2, Long l) {
        if (arrayList != null) {
            a("activities", arrayList);
        }
        if (arrayList2 != null) {
            a("extras", arrayList2);
        }
        a("timestampMs", l.longValue());
    }

    public final void a(String str, ArrayList arrayList) {
        this.d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.d.containsKey(str);
    }
}
