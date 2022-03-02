package defpackage;

/* renamed from: avyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avyd {
    public static int a(avyb avyb, boolean z) {
        int i = !z ? avyb.b : avyb.c;
        int i2 = !z ? avyb.c : avyb.b;
        byte[][] bArr = avyb.a;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b2 = !z ? bArr[i6][i4] : bArr[i4][i6];
                if (b2 == b) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += i5 - 2;
                    }
                    b = b2;
                    i5 = 1;
                }
            }
            if (i5 >= 5) {
                i3 += i5 - 2;
            }
        }
        return i3;
    }
}
