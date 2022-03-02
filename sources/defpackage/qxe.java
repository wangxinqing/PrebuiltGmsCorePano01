package defpackage;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: qxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum qxe {
    EVERY_3_HOURS(TimeUnit.HOURS.toSeconds(3)),
    EVERY_4_HOURS(TimeUnit.HOURS.toSeconds(4)),
    EVERY_6_HOURS(TimeUnit.HOURS.toSeconds(6)),
    EVERY_9_HOURS(TimeUnit.HOURS.toSeconds(9)),
    EVERY_12_HOURS(TimeUnit.HOURS.toSeconds(12)),
    EVERY_15_HOURS(TimeUnit.HOURS.toSeconds(15)),
    EVERY_20_HOURS(TimeUnit.HOURS.toSeconds(20)),
    EVERY_DAY(TimeUnit.DAYS.toSeconds(1)),
    EVERY_36_HOURS(TimeUnit.HOURS.toSeconds(36)),
    EVERY_2_DAYS(TimeUnit.DAYS.toSeconds(2)),
    EVERY_3_DAYS(TimeUnit.DAYS.toSeconds(3)),
    EVERY_7_DAYS(TimeUnit.DAYS.toSeconds(7)),
    EVERY_14_DAYS(TimeUnit.DAYS.toSeconds(14)),
    EVERY_25_DAYS(TimeUnit.DAYS.toSeconds(25)),
    EVERY_30_DAYS(TimeUnit.DAYS.toSeconds(30)),
    EVERY_100_DAYS(TimeUnit.DAYS.toSeconds(100)),
    EVERY_YEAR(TimeUnit.DAYS.toSeconds(365));
    
    private static final TreeMap s = null;
    public final long r;

    static {
        int i;
        s = new TreeMap();
        for (qxe qxe : values()) {
            s.put(Long.valueOf(qxe.r), qxe);
        }
    }

    private qxe(long j) {
        this.r = j;
    }

    public static qxe a(long j) {
        Map.Entry ceilingEntry = s.ceilingEntry(Long.valueOf(j));
        return ceilingEntry != null ? (qxe) ceilingEntry.getValue() : EVERY_YEAR;
    }
}
