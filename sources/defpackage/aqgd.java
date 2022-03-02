package defpackage;

import java.util.HashMap;

/* renamed from: aqgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgd {
    private static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        Float valueOf = Float.valueOf(2.4f);
        hashMap.put("bullhead", valueOf);
        a.put("angler", valueOf);
        HashMap hashMap2 = a;
        Float valueOf2 = Float.valueOf(2.0f);
        hashMap2.put("sailfish", valueOf2);
        a.put("marlin", valueOf2);
    }

    public static float a(String str) {
        if (str == null || !a.containsKey(str)) {
            return 1.0f;
        }
        return ((Float) a.get(str)).floatValue();
    }

    static aqey a(aqey aqey, float f) {
        aqey aqey2;
        float f2;
        float f3 = 10000.0f;
        if (aqey.a()) {
            aqew j = aqey.j();
            j.a(aqey.b, aqey.c, (int) Math.max(((float) aqey.d) * f, 10000.0f));
            aqey2 = j.a();
        } else {
            aqey2 = aqey;
        }
        if (!aqey.b()) {
            return aqey2;
        }
        aqew j2 = aqey.j();
        int i = aqey.b;
        int i2 = aqey.c;
        float f4 = (float) aqey2.d;
        if (f4 >= 50000.0f) {
            f3 = f4;
        } else {
            if (f4 >= 26000.0f) {
                f4 = (f4 - 1.7249584E-4f) * 0.85f;
                f2 = 28000.0f;
            } else if (f4 >= 22000.0f) {
                f3 = ((f4 - 2.0229816E-4f) * 2.6f) + 22000.0f;
            } else if (f4 >= 15000.0f) {
                f2 = -4000.0f;
            }
            f3 = f2 + f4;
        }
        j2.a(i, i2, (int) f3);
        return j2.a();
    }
}
