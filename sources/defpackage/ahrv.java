package defpackage;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ahrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahrv {
    public final ahyb a;
    public final Map b;

    public ahrv(String str, int i, int i2) {
        this.a = new ahyb(i, i2, 300, 0);
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put(str, Integer.valueOf(i2));
    }

    public final void a() {
        int i = -1;
        for (Integer intValue : this.b.values()) {
            i = Math.max(i, intValue.intValue());
        }
        if (i > 0) {
            ahyb ahyb = this.a;
            if (ahyb.d.length != i) {
                long[] jArr = new long[i];
                int i2 = ahyb.a;
                int[] iArr = new int[2];
                iArr[1] = i;
                iArr[0] = i2;
                float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                int max = Math.max(0, ahyb.c - i);
                int i3 = 0;
                while (true) {
                    int i4 = ahyb.c;
                    if (max < i4) {
                        jArr[i3] = ahyb.a(max);
                        for (int i5 = 0; i5 < ahyb.a; i5++) {
                            fArr[i5][i3] = ahyb.a(max, i5);
                        }
                        max++;
                        i3++;
                    } else {
                        ahyb.d = jArr;
                        ahyb.e = fArr;
                        ahyb.b = 0;
                        ahyb.c = Math.min(i4, i);
                        return;
                    }
                }
            }
        }
    }
}
