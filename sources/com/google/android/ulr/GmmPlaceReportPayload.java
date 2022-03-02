package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GmmPlaceReportPayload extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("context", FastJsonResponse$Field.f("context"));
        a.put("eventId", FastJsonResponse$Field.f("eventId"));
        a.put("experimentInfo", FastJsonResponse$Field.f("experimentInfo"));
        a.put("notificationInfo", FastJsonResponse$Field.a("notificationInfo", GmmPlaceReportPayloadNotificationInfo.class));
        a.put("snapToPlaceRequest", FastJsonResponse$Field.a("snapToPlaceRequest", GmmPlaceReportPayloadSnapToPlaceRequest.class));
        a.put("snapToPlaceResults", FastJsonResponse$Field.b("snapToPlaceResults", GmmPlaceReportPayloadSnapToPlaceResult.class));
        a.put("userEvent", FastJsonResponse$Field.f("userEvent"));
        a.put("veType", FastJsonResponse$Field.a("veType"));
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("context");
    }

    public final String c() {
        return (String) this.b.get("eventId");
    }

    public final String d() {
        return (String) this.b.get("experimentInfo");
    }

    public final String e() {
        return (String) this.b.get("userEvent");
    }

    public final Integer f() {
        return (Integer) this.b.get("veType");
    }

    public GmmPlaceReportPayloadNotificationInfo getNotificationInfo() {
        return (GmmPlaceReportPayloadNotificationInfo) this.c.get("notificationInfo");
    }

    public GmmPlaceReportPayloadSnapToPlaceRequest getSnapToPlaceRequest() {
        return (GmmPlaceReportPayloadSnapToPlaceRequest) this.c.get("snapToPlaceRequest");
    }

    public ArrayList getSnapToPlaceResults() {
        return (ArrayList) this.d.get("snapToPlaceResults");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }

    public final void a(String str, ArrayList arrayList) {
        this.d.put(str, arrayList);
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str) {
        return this.d.containsKey(str);
    }
}
