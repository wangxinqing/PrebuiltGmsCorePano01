package defpackage;

import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ahil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ahil {
    private static final Map d;
    public final long a;
    protected final ahmn b;
    protected boolean c = true;

    static {
        EnumMap enumMap = new EnumMap(ahmn.class);
        d = enumMap;
        enumMap.put(ahmn.IN_VEHICLE, 0);
        d.put(ahmn.IN_ROAD_VEHICLE, 16);
        d.put(ahmn.IN_RAIL_VEHICLE, 17);
        d.put(ahmn.IN_CAR, 0);
        d.put(ahmn.ON_BICYCLE, 1);
        d.put(ahmn.ON_FOOT, 2);
        d.put(ahmn.WALKING, 7);
        d.put(ahmn.RUNNING, 8);
        d.put(ahmn.STILL, 3);
        d.put(ahmn.UNKNOWN, 4);
        d.put(ahmn.TILTING, 5);
        d.put(ahmn.INCONSISTENT, 4);
        d.put(ahmn.OFF_BODY, 9);
        d.put(ahmn.SLEEP, 15);
        d.put(ahmn.IN_TWO_WHEELER_VEHICLE, 18);
        d.put(ahmn.IN_FOUR_WHEELER_VEHICLE, 19);
        d.put(ahmn.IN_CAR, 20);
        d.put(ahmn.IN_BUS, 21);
    }

    public ahil(long j) {
        this.a = j;
        String l = axwx.l();
        ahmn ahmn = null;
        if (l != null && l.length() > 0) {
            try {
                ahmn = ahmn.a(l);
            } catch (IllegalArgumentException e) {
            }
        }
        this.b = ahmn;
    }

    public static int a(ahyq ahyq, int i, long j) {
        long a2 = ahyq.a(i) - j;
        while (i >= 0) {
            if (ahyq.a(i) <= a2) {
                return i;
            }
            i--;
        }
        double d2 = (double) j;
        Double.isNaN(d2);
        return ((double) (ahyq.a(0) - a2)) > d2 * 0.1d ? -1 : 0;
    }

    public abstract aibm a(long j, long j2, ahyq ahyq);

    public void a() {
        this.c = true;
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ahmo ahmo = (ahmo) it.next();
            arrayList.add(new DetectedActivity(((Integer) d.get(ahmo.a)).intValue(), ahmo.b));
        }
        return arrayList;
    }
}
