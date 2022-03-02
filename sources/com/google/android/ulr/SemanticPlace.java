package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SemanticPlace extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("confidence", FastJsonResponse$Field.f("confidence"));
        a.put("featureId", FastJsonResponse$Field.a("featureId", FeatureIdProto.class));
        a.put("gconceptInstances", FastJsonResponse$Field.b("gconceptInstances", SemanticPlaceGConceptInstanceProto.class));
        a.put("score", FastJsonResponse$Field.c("score"));
        a.put("source", FastJsonResponse$Field.f("source"));
    }

    public final Map a() {
        return a;
    }

    public final String b() {
        return (String) this.b.get("confidence");
    }

    public final Float c() {
        return (Float) this.b.get("score");
    }

    public final String d() {
        return (String) this.b.get("source");
    }

    public FeatureIdProto getFeatureId() {
        return (FeatureIdProto) this.c.get("featureId");
    }

    public ArrayList getGconceptInstances() {
        return (ArrayList) this.d.get("gconceptInstances");
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
