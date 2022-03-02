package defpackage;

/* renamed from: uqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uqp implements arwb {
    public final int[] a(byte[] bArr) {
        int[] iArr = new int[5];
        long d = anln.b().a(bArr).d();
        int i = (int) d;
        int i2 = (int) (d >>> 32);
        for (int i3 = 1; i3 <= 5; i3++) {
            int i4 = (i3 * i2) + i;
            if (i4 < 0) {
                i4 ^= -1;
            }
            iArr[i3 - 1] = i4;
        }
        return iArr;
    }
}
