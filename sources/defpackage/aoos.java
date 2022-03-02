package defpackage;

import java.math.BigInteger;

/* renamed from: aoos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aoos {
    static final long[] a = new long[37];
    static final int[] b = new int[37];
    static final int[] c = new int[37];

    static {
        long j;
        int i;
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i2 = 2; i2 <= 36; i2++) {
            long j2 = (long) i2;
            long[] jArr = a;
            long j3 = -1;
            if (j2 >= 0) {
                long j4 = Long.MAX_VALUE / j2;
                long j5 = j4 + j4;
                if (aoot.a(-1 - (j5 * j2), j2) >= 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                j = j5 + ((long) i);
            } else {
                j = aoot.a(-1, j2) < 0 ? 0 : 1;
            }
            jArr[i2] = j;
            int[] iArr = b;
            if (j2 >= 0) {
                long j6 = Long.MAX_VALUE / j2;
                long j7 = -1 - ((j6 + j6) * j2);
                if (aoot.a(j7, j2) < 0) {
                    j2 = 0;
                }
                j3 = j7 - j2;
            } else if (aoot.a(-1, j2) >= 0) {
                j3 = -1 - j2;
            }
            iArr[i2] = (int) j3;
            c[i2] = bigInteger.toString(i2).length() - 1;
        }
    }

    static boolean a(long j, int i) {
        if (j < 0) {
            return true;
        }
        long[] jArr = a;
        if (j >= jArr[16]) {
            return j > jArr[16] || i > b[16];
        }
        return false;
    }
}
