package com.google.android.ulr;

import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class RttRangingProto extends jah {
    private static final TreeMap a;

    static {
        TreeMap treeMap = new TreeMap();
        a = treeMap;
        treeMap.put("rttAttemptedMeasurementsNumber", FastJsonResponse$Field.a("rttAttemptedMeasurementsNumber"));
        a.put("rttChannelBandwidth", FastJsonResponse$Field.a("rttChannelBandwidth"));
        a.put("rttDistanceStdDevMm", FastJsonResponse$Field.a("rttDistanceStdDevMm"));
        a.put("rttEstimatedDistanceMm", FastJsonResponse$Field.a("rttEstimatedDistanceMm"));
        a.put("successfulRttMeasurements", FastJsonResponse$Field.a("successfulRttMeasurements"));
    }

    public RttRangingProto() {
    }

    public final Map a() {
        return a;
    }

    public final Integer b() {
        return (Integer) this.b.get("rttAttemptedMeasurementsNumber");
    }

    public final Integer c() {
        return (Integer) this.b.get("rttChannelBandwidth");
    }

    public final Integer d() {
        return (Integer) this.b.get("rttDistanceStdDevMm");
    }

    public final Integer e() {
        return (Integer) this.b.get("rttEstimatedDistanceMm");
    }

    public final Integer f() {
        return (Integer) this.b.get("successfulRttMeasurements");
    }

    public RttRangingProto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        a("rttAttemptedMeasurementsNumber", num.intValue());
        a("rttChannelBandwidth", num2.intValue());
        a("rttDistanceStdDevMm", num3.intValue());
        a("rttEstimatedDistanceMm", num4.intValue());
        a("successfulRttMeasurements", num5.intValue());
    }
}
