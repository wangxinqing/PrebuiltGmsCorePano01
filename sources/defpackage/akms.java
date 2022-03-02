package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: akms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akms {
    public static float a(akoh akoh, List list, long j) {
        if (!(akoh == null || list == null || list.isEmpty() || akoh.a() == 0)) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < akoh.a(); i++) {
                akog a = akoh.a(i);
                int i2 = a.d;
                if (i2 >= -120) {
                    Long valueOf = Long.valueOf(a.b & j);
                    if (hashMap.containsKey(valueOf)) {
                        i2 = Math.max(((Integer) hashMap.get(valueOf)).intValue(), i2);
                    }
                    hashMap.put(valueOf, Integer.valueOf(i2));
                }
            }
            int size = list.size();
            float f = 0.0f;
            for (int i3 = 0; i3 < size; i3++) {
                asud asud = (asud) list.get(i3);
                Integer num = (Integer) hashMap.get(Long.valueOf(asud.b));
                float a2 = a(asud);
                if (num != null && a2 > 0.0f) {
                    f += a2 * ((float) (num.intValue() + 120));
                }
            }
            float f2 = 0.0f;
            for (Integer intValue : hashMap.values()) {
                float intValue2 = (float) (intValue.intValue() + 120);
                f2 += intValue2 * intValue2;
            }
            float sqrt = (float) Math.sqrt((double) f2);
            int size2 = list.size();
            float f3 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                float a3 = a((asud) list.get(i4));
                if (a3 > 0.0f) {
                    f3 += a3 * a3;
                }
            }
            float sqrt2 = (float) Math.sqrt((double) f3);
            if (f != 0.0f) {
                return f / (sqrt * sqrt2);
            }
        }
        return 0.0f;
    }

    private static float a(asud asud) {
        float f = (float) asud.c;
        return (asud.a & 4) != 0 ? f * (((float) asud.d) / 100.0f) : f;
    }

    public static List a(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new aklu());
        }
        return arrayList;
    }
}
