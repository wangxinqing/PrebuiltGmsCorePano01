package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GmmPlaceReportPayloadSnapToPlaceResult extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("confidence", FastJsonResponse$Field.a("confidence"));
        a.put("featureId", FastJsonResponse$Field.a("featureId", FeatureIdProto.class));
    }

    public final Map a() {
        return a;
    }

    public final Integer b() {
        return (Integer) this.b.get("confidence");
    }

    public FeatureIdProto getFeatureId() {
        return (FeatureIdProto) this.c.get("featureId");
    }

    public final void a(String str, jag jag) {
        this.c.put(str, jag);
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        return this.c.containsKey(str);
    }
}
