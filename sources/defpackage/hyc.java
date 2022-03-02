package defpackage;

import java.util.Arrays;

/* renamed from: hyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hyc {
    final short[] a;
    public final long[] b;
    private final int c;

    public hyc(long[] jArr) {
        boolean z;
        boolean z2;
        int length = jArr.length;
        if ((length & 3) == 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        if (length < 32767) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2, "too many digests");
        this.b = jArr;
        int max = Math.max(4, 29 - Integer.numberOfLeadingZeros(length));
        this.c = max;
        short[] sArr = new short[(1 << max)];
        this.a = sArr;
        Arrays.fill(sArr, Short.MAX_VALUE);
        int i = length - 4;
        while (i >= 0) {
            iva.b(i == 0 || jArr[i] > jArr[i + -4], "Must be sorted");
            this.a[a(jArr[i])] = (short) i;
            i -= 4;
        }
    }

    public final int a(long j) {
        return (int) (j >>> (64 - this.c));
    }
}
