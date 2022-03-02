package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ardv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ardv {
    public static final Map a;
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 7};
    public static final int c = b.length;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(0, "IN_VEHICLE");
        a.put(1, "STILL_IN_VEHICLE");
        a.put(2, "ON_BICYCLE");
        a.put(3, "STILL_ON_BICYCLE");
        a.put(4, "WALKING");
        a.put(5, "RUNNING");
        a.put(6, "STILL");
        a.put(7, "UNKNOWN");
    }

    public static boolean a(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }
}
