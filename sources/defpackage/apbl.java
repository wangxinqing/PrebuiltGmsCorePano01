package defpackage;

/* renamed from: apbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apbl {
    static void a(long[] jArr, long[] jArr2, int i) {
        int i2 = -i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (int) jArr[i3];
            jArr[i3] = (long) (((((int) jArr2[i3]) ^ i4) & i2) ^ i4);
        }
    }
}
