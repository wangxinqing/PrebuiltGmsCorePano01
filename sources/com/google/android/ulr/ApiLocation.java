package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ApiLocation extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("altitudeMetersAboveSeaLevel", FastJsonResponse$Field.a("altitudeMetersAboveSeaLevel"));
        a.put("approximatelyStationary", FastJsonResponse$Field.e("approximatelyStationary"));
        a.put("confidence", FastJsonResponse$Field.a("confidence"));
        a.put("headingDegreesEastOfTrueNorth", FastJsonResponse$Field.a("headingDegreesEastOfTrueNorth"));
        a.put("horizontalAccuracyMeters", FastJsonResponse$Field.a("horizontalAccuracyMeters"));
        a.put("indoorLevelE3", FastJsonResponse$Field.a("indoorLevelE3"));
        a.put("indoorLevelFeatureId", FastJsonResponse$Field.f("indoorLevelFeatureId"));
        a.put("latitudeE7", FastJsonResponse$Field.a("latitudeE7"));
        a.put("longitudeE7", FastJsonResponse$Field.a("longitudeE7"));
        a.put("speedMetersPerSecond", FastJsonResponse$Field.a("speedMetersPerSecond"));
        a.put("verticalAccuracyMeters", FastJsonResponse$Field.a("verticalAccuracyMeters"));
    }

    public ApiLocation() {
    }

    public final Map a() {
        return a;
    }

    public final Integer b() {
        return (Integer) this.b.get("altitudeMetersAboveSeaLevel");
    }

    public final Boolean c() {
        return (Boolean) this.b.get("approximatelyStationary");
    }

    public final Integer d() {
        return (Integer) this.b.get("confidence");
    }

    public final Integer e() {
        return (Integer) this.b.get("headingDegreesEastOfTrueNorth");
    }

    public final Integer f() {
        return (Integer) this.b.get("horizontalAccuracyMeters");
    }

    public final Integer g() {
        return (Integer) this.b.get("indoorLevelE3");
    }

    public final String h() {
        return (String) this.b.get("indoorLevelFeatureId");
    }

    public final Integer i() {
        return (Integer) this.b.get("latitudeE7");
    }

    public final Integer j() {
        return (Integer) this.b.get("longitudeE7");
    }

    public final Integer k() {
        return (Integer) this.b.get("speedMetersPerSecond");
    }

    public final Integer l() {
        return (Integer) this.b.get("verticalAccuracyMeters");
    }

    public ApiLocation(Integer num, Boolean bool, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Integer num8) {
        if (num != null) {
            a("altitudeMetersAboveSeaLevel", num.intValue());
        }
        if (bool != null) {
            a("approximatelyStationary", bool.booleanValue());
        }
        if (num2 != null) {
            a("headingDegreesEastOfTrueNorth", num2.intValue());
        }
        if (num3 != null) {
            a("horizontalAccuracyMeters", num3.intValue());
        }
        if (num4 != null) {
            a("indoorLevelE3", num4.intValue());
        }
        if (str != null) {
            a("indoorLevelFeatureId", str);
        }
        if (num5 != null) {
            a("latitudeE7", num5.intValue());
        }
        if (num6 != null) {
            a("longitudeE7", num6.intValue());
        }
        if (num7 != null) {
            a("speedMetersPerSecond", num7.intValue());
        }
        if (num8 != null) {
            a("verticalAccuracyMeters", num8.intValue());
        }
    }
}
