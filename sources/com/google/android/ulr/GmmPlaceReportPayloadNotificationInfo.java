package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GmmPlaceReportPayloadNotificationInfo extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("location", FastJsonResponse$Field.a("location", LocationDescriptor.class));
        a.put("notificationDetails", FastJsonResponse$Field.b("notificationDetails", GmmPlaceReportPayloadNotificationDetails.class));
    }

    public final Map a() {
        return a;
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }

    public LocationDescriptor getLocation() {
        return (LocationDescriptor) this.c.get("location");
    }

    public ArrayList getNotificationDetails() {
        return (ArrayList) this.d.get("notificationDetails");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    public final void a(String str, ArrayList arrayList) {
        this.d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.d.containsKey(str);
    }
}
