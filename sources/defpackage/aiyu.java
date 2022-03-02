package defpackage;

import java.util.Map;

/* renamed from: aiyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiyu {
    public static final Map a = anaf.a(0, arji.ENTER, 1, arji.EXIT);
    private static final Map b;

    static {
        anab a2 = anaf.a(9);
        a2.a(0, ariu.IN_VEHICLE);
        a2.a(16, ariu.IN_ROAD_VEHICLE);
        a2.a(17, ariu.IN_RAIL_VEHICLE);
        a2.a(1, ariu.ON_BICYCLE);
        a2.a(7, ariu.WALKING);
        a2.a(8, ariu.RUNNING);
        a2.a(3, ariu.STILL);
        a2.a(4, ariu.INCONSISTENT);
        a2.a(5, ariu.TILTING);
        b = a2.a();
        anab a3 = anaf.a(8);
        a3.a(16, 0);
        a3.a(17, 1);
        a3.a(1, 2);
        a3.a(7, 3);
        a3.a(8, 4);
        a3.a(3, 5);
        a3.a(4, 6);
        a3.a(5, 7);
        a3.a();
    }

    public static ariu a(int i) {
        return (ariu) b.get(Integer.valueOf(i));
    }

    public static Integer a(ariu ariu) {
        for (Map.Entry entry : b.entrySet()) {
            if (entry.getValue() == ariu) {
                return (Integer) entry.getKey();
            }
        }
        return null;
    }
}
