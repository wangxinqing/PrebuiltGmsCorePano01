package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiLocationReading extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("batchDeliveryTimestampMs", FastJsonResponse$Field.b("batchDeliveryTimestampMs"));
        a.put("experiments", FastJsonResponse$Field.b("experiments", ApiExperiment.class));
        a.put("isOversampled", FastJsonResponse$Field.e("isOversampled"));
        a.put("location", FastJsonResponse$Field.a("location", ApiLocation.class));
        a.put("readingInfo", FastJsonResponse$Field.a("readingInfo", ApiReadingInfo.class));
        a.put("rebootSequence", FastJsonResponse$Field.a("rebootSequence"));
        a.put("sequence", FastJsonResponse$Field.a("sequence"));
        a.put("timestampMs", FastJsonResponse$Field.b("timestampMs"));
    }

    public ApiLocationReading() {
    }

    public final Map a() {
        return a;
    }

    public final Long b() {
        return (Long) this.b.get("batchDeliveryTimestampMs");
    }

    public final Boolean c() {
        return (Boolean) this.b.get("isOversampled");
    }

    public final Integer d() {
        return (Integer) this.b.get("rebootSequence");
    }

    public final Integer e() {
        return (Integer) this.b.get("sequence");
    }

    public final Long f() {
        return (Long) this.b.get("timestampMs");
    }

    public ArrayList getExperiments() {
        return (ArrayList) this.d.get("experiments");
    }

    public ApiLocation getLocation() {
        return (ApiLocation) this.c.get("location");
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

    public ApiLocationReading(Long l, ArrayList arrayList, Boolean bool, ApiLocation apiLocation, ApiReadingInfo apiReadingInfo, Integer num, Integer num2, Long l2) {
        if (l != null) {
            a("batchDeliveryTimestampMs", l.longValue());
        }
        if (arrayList != null) {
            a("experiments", arrayList);
        }
        if (bool != null) {
            a("isOversampled", bool.booleanValue());
        }
        a("location", (jag) apiLocation);
        a("readingInfo", (jag) apiReadingInfo);
        a("rebootSequence", num.intValue());
        a("sequence", num2.intValue());
        if (l2 != null) {
            a("timestampMs", l2.longValue());
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
