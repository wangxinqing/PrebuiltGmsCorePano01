package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: ahlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahlk {
    private final Map a;

    public ahlk() {
        EnumMap enumMap = new EnumMap(ahlj.class);
        enumMap.put(ahlj.SCAN_OVERLAP_MIN_RADIUS_0_2, Double.valueOf(142.156d));
        enumMap.put(ahlj.WIFI_LOC_DISTANCE_0_1, Double.valueOf(100.453d));
        enumMap.put(ahlj.WIFI_LOC_DISTANCE_0_2, Double.valueOf(175.247d));
        enumMap.put(ahlj.WIFI_LOC_DISTANCE_1_2, Double.valueOf(109.315d));
        enumMap.put(ahlj.CELL_LOC_DISTANCE_0_2, Double.valueOf(265.911d));
        this.a = Collections.unmodifiableMap(enumMap);
    }

    public final double a(Map map, ahlj ahlj) {
        Double d = (Double) map.get(ahlj);
        if (d == null) {
            d = (Double) this.a.get(ahlj);
        }
        return d.doubleValue();
    }
}
