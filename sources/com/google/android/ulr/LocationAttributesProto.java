package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LocationAttributesProto extends jah {
    private static final TreeMap a;
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("activityRecords", FastJsonResponse$Field.b("activityRecords", ActivityRecord.class));
        a.put("adsConfidence", FastJsonResponse$Field.c("adsConfidence"));
        a.put("altitudeMetersFromGround", FastJsonResponse$Field.d("altitudeMetersFromGround"));
        a.put("bearingAccuracyDegrees", FastJsonResponse$Field.a("bearingAccuracyDegrees"));
        a.put("bearingDegrees", FastJsonResponse$Field.a("bearingDegrees"));
        a.put("boardedTransitVehicleToken", FastJsonResponse$Field.f("boardedTransitVehicleToken"));
        a.put("carrierIpType", FastJsonResponse$Field.f("carrierIpType"));
        a.put("deviceLocationRatio", FastJsonResponse$Field.c("deviceLocationRatio"));
        a.put("fieldOfView", FastJsonResponse$Field.a("fieldOfView", FieldOfView.class));
        a.put("headingDegrees", FastJsonResponse$Field.a("headingDegrees"));
        a.put("inference", FastJsonResponse$Field.f("inference"));
        a.put("ipRangeConfidence", FastJsonResponse$Field.c("ipRangeConfidence"));
        a.put("manualEntry", FastJsonResponse$Field.f("manualEntry"));
        a.put("plmSourceLocationCount", FastJsonResponse$Field.a("plmSourceLocationCount"));
        a.put("plmType", FastJsonResponse$Field.f("plmType"));
        a.put("rollDegrees", FastJsonResponse$Field.a("rollDegrees"));
        a.put("speedAccuracyKph", FastJsonResponse$Field.a("speedAccuracyKph"));
        a.put("speedKph", FastJsonResponse$Field.a("speedKph"));
        a.put("tiltDegrees", FastJsonResponse$Field.a("tiltDegrees"));
        a.put("viewportSearchOptions", FastJsonResponse$Field.f("viewportSearchOptions"));
        a.put("weekSecondConfidence", FastJsonResponse$Field.c("weekSecondConfidence"));
    }

    public final Map a() {
        return a;
    }

    public final Float b() {
        return (Float) this.b.get("adsConfidence");
    }

    public final Double c() {
        return (Double) this.b.get("altitudeMetersFromGround");
    }

    public final Integer d() {
        return (Integer) this.b.get("bearingAccuracyDegrees");
    }

    public final Integer e() {
        return (Integer) this.b.get("bearingDegrees");
    }

    public final String f() {
        return (String) this.b.get("boardedTransitVehicleToken");
    }

    public final String g() {
        return (String) this.b.get("carrierIpType");
    }

    public ArrayList getActivityRecords() {
        return (ArrayList) this.d.get("activityRecords");
    }

    public FieldOfView getFieldOfView() {
        return (FieldOfView) this.c.get("fieldOfView");
    }

    public final Float h() {
        return (Float) this.b.get("deviceLocationRatio");
    }

    public final Integer i() {
        return (Integer) this.b.get("headingDegrees");
    }

    public final String j() {
        return (String) this.b.get("inference");
    }

    public final Float k() {
        return (Float) this.b.get("ipRangeConfidence");
    }

    public final String l() {
        return (String) this.b.get("manualEntry");
    }

    public final Integer m() {
        return (Integer) this.b.get("plmSourceLocationCount");
    }

    public final String n() {
        return (String) this.b.get("plmType");
    }

    public final Integer o() {
        return (Integer) this.b.get("rollDegrees");
    }

    public final Integer p() {
        return (Integer) this.b.get("speedAccuracyKph");
    }

    public final Integer q() {
        return (Integer) this.b.get("speedKph");
    }

    public final Integer r() {
        return (Integer) this.b.get("tiltDegrees");
    }

    public final String s() {
        return (String) this.b.get("viewportSearchOptions");
    }

    public final Float t() {
        return (Float) this.b.get("weekSecondConfidence");
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
