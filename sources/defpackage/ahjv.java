package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.util.Arrays;
import java.util.Map;

/* renamed from: ahjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahjv {
    private static aibe a(ahll ahll, boolean z) {
        aiax aiax = ahll.b;
        if (aiax != null) {
            aiav aiav = !z ? aiax.b : aiax.c;
            if (aiav != null) {
                return aiav.c;
            }
        }
        return null;
    }

    public static final Double a(ahll ahll, ahll ahll2, boolean z) {
        int i;
        aibe a = a(ahll, z);
        aibe a2 = a(ahll2, z);
        if (a == null || a2 == null) {
            return null;
        }
        int a3 = aias.a(a, a2);
        if (!z) {
            i = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        } else {
            i = 5000;
        }
        return Double.valueOf((double) Math.min(a3, i));
    }

    public static final Double a(long[] jArr, long[] jArr2, long[] jArr3) {
        int length = jArr3.length;
        int length2 = (jArr.length + jArr2.length) - length;
        if (length2 == 0) {
            return null;
        }
        double d = (double) length;
        double d2 = (double) length2;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Double.valueOf(d / d2);
    }

    public static final void a(Map map, ahlj ahlj, Double d) {
        if (d != null) {
            map.put(ahlj, d);
        }
    }

    public static long[] a(aibw aibw) {
        int b = aibw.b();
        long[] jArr = new long[b];
        for (int i = 0; i < b; i++) {
            jArr[i] = aibw.a(i);
        }
        Arrays.sort(jArr);
        return jArr;
    }

    public static long[] a(long[] jArr, long[] jArr2) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < jArr.length && i2 < jArr2.length) {
            long j = jArr[i];
            long j2 = jArr2[i2];
            if (j < j2) {
                i++;
            } else {
                if (j <= j2) {
                    i3++;
                    i++;
                }
                i2++;
            }
        }
        long[] jArr3 = new long[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < jArr.length && i5 < jArr2.length) {
            long j3 = jArr[i4];
            long j4 = jArr2[i5];
            if (j3 < j4) {
                i4++;
            } else if (j3 <= j4) {
                jArr3[i6] = j3;
                i4++;
                i5++;
                i6++;
            } else {
                i5++;
            }
        }
        if (i6 == i3) {
            z = true;
        }
        ativ.a(z);
        return jArr3;
    }
}
