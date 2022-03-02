package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LocationDescriptor extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("attributes", FastJsonResponse$Field.a("attributes", LocationAttributesProto.class));
        a.put("confidence", FastJsonResponse$Field.a("confidence"));
        a.put("diagnosticInfo", FastJsonResponse$Field.f("diagnosticInfo"));
        a.put("featureId", FastJsonResponse$Field.a("featureId", FeatureIdProto.class));
        a.put("historicalProducer", FastJsonResponse$Field.f("historicalProducer"));
        a.put("historicalProminence", FastJsonResponse$Field.a("historicalProminence"));
        a.put("historicalRole", FastJsonResponse$Field.f("historicalRole"));
        a.put("language", FastJsonResponse$Field.f("language"));
        a.put("latlng", FastJsonResponse$Field.a("latlng", LatLng.class));
        a.put("latlngSpan", FastJsonResponse$Field.a("latlngSpan", LatLng.class));
        a.put("levelFeatureId", FastJsonResponse$Field.a("levelFeatureId", FeatureIdProto.class));
        a.put("levelNumber", FastJsonResponse$Field.c("levelNumber"));
        a.put("loc", FastJsonResponse$Field.f("loc"));
        a.put("mid", FastJsonResponse$Field.f("mid"));
        a.put("presenceIntervals", FastJsonResponse$Field.b("presenceIntervals", PresenceInterval.class));
        a.put("producer", FastJsonResponse$Field.f("producer"));
        a.put("provenance", FastJsonResponse$Field.f("provenance"));
        a.put("radius", FastJsonResponse$Field.c("radius"));
        a.put("rect", FastJsonResponse$Field.a("rect", LatLngRect.class));
        a.put("role", FastJsonResponse$Field.f("role"));
        a.put("semanticPlaces", FastJsonResponse$Field.b("semanticPlaces", SemanticPlace.class));
        a.put("semantics", FastJsonResponse$Field.g("semantics"));
        a.put("timestamp", FastJsonResponse$Field.b("timestamp"));
        a.put("visibleNetworks", FastJsonResponse$Field.b("visibleNetworks", VisibleNetwork.class));
    }

    public final Map a() {
        return a;
    }

    public final Integer b() {
        return (Integer) this.b.get("confidence");
    }

    public final String c() {
        return (String) this.b.get("diagnosticInfo");
    }

    public final String d() {
        return (String) this.b.get("historicalProducer");
    }

    public final Integer e() {
        return (Integer) this.b.get("historicalProminence");
    }

    public final String f() {
        return (String) this.b.get("historicalRole");
    }

    public final String g() {
        return (String) this.b.get("language");
    }

    public LocationAttributesProto getAttributes() {
        return (LocationAttributesProto) this.c.get("attributes");
    }

    public FeatureIdProto getFeatureId() {
        return (FeatureIdProto) this.c.get("featureId");
    }

    public LatLng getLatlng() {
        return (LatLng) this.c.get("latlng");
    }

    public LatLng getLatlngSpan() {
        return (LatLng) this.c.get("latlngSpan");
    }

    public FeatureIdProto getLevelFeatureId() {
        return (FeatureIdProto) this.c.get("levelFeatureId");
    }

    public ArrayList getPresenceIntervals() {
        return (ArrayList) this.d.get("presenceIntervals");
    }

    public LatLngRect getRect() {
        return (LatLngRect) this.c.get("rect");
    }

    public ArrayList getSemanticPlaces() {
        return (ArrayList) this.d.get("semanticPlaces");
    }

    public ArrayList getVisibleNetworks() {
        return (ArrayList) this.d.get("visibleNetworks");
    }

    public final Float h() {
        return (Float) this.b.get("levelNumber");
    }

    public final String i() {
        return (String) this.b.get("loc");
    }

    public final String j() {
        return (String) this.b.get("mid");
    }

    public final String k() {
        return (String) this.b.get("producer");
    }

    public final String l() {
        return (String) this.b.get("provenance");
    }

    public final Float m() {
        return (Float) this.b.get("radius");
    }

    public final String n() {
        return (String) this.b.get("role");
    }

    public final ArrayList o() {
        return (ArrayList) this.b.get("semantics");
    }

    public final Long p() {
        return (Long) this.b.get("timestamp");
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
