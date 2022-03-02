package defpackage;

import java.nio.ByteBuffer;

/* renamed from: boy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class boy extends apxg {
    public static int a(apxe apxe, int i, int i2, long j, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        apxe apxe2 = apxe;
        apxe.d(16);
        apxe.a(2, j, 0);
        apxe.c(15, i15);
        apxe.c(14, i14);
        apxe.c(13, i13);
        apxe.c(12, i12);
        apxe.b(11, i11, 0);
        apxe.b(10, i10, 0);
        apxe.b(9, i9, 0);
        apxe.c(8, i8);
        apxe.b(7, i7, 0);
        int i16 = i6;
        apxe.b(6, i6, 0);
        int i17 = i5;
        apxe.c(5, i5);
        int i18 = i4;
        apxe.c(4, i4);
        int i19 = i3;
        apxe.c(3, i3);
        int i20 = i2;
        apxe.c(1, i2);
        int i21 = i;
        apxe.b(0, i, 0);
        int e = apxe.e();
        apxe.b(e, 6);
        apxe.b(e, 10);
        apxe.b(e, 12);
        return e;
    }

    public final String b() {
        int d = d(6);
        if (d != 0) {
            return f(d + this.c);
        }
        return null;
    }

    public final ByteBuffer c() {
        return i(6);
    }

    public final long d() {
        int d = d(8);
        if (d != 0) {
            return this.d.getLong(d + this.c);
        }
        return 0;
    }

    public final String e() {
        int d = d(10);
        if (d != 0) {
            return f(d + this.c);
        }
        return null;
    }

    public final String f() {
        int d = d(12);
        if (d != 0) {
            return f(d + this.c);
        }
        return null;
    }

    public final String g() {
        int d = d(14);
        if (d != 0) {
            return f(d + this.c);
        }
        return null;
    }

    public final int h() {
        int d = d(16);
        if (d != 0) {
            return this.d.getInt(d + this.c);
        }
        return 0;
    }

    public final int i() {
        int d = d(18);
        if (d != 0) {
            return this.d.getInt(d + this.c);
        }
        return 0;
    }

    public final int j() {
        int d = d(20);
        if (d != 0) {
            return g(d);
        }
        return 0;
    }

    public final int k() {
        int d = d(22);
        if (d != 0) {
            return this.d.getInt(d + this.c);
        }
        return 0;
    }

    public final int l() {
        int d = d(24);
        if (d != 0) {
            return this.d.getInt(d + this.c);
        }
        return 0;
    }

    public final int m() {
        int d = d(26);
        if (d != 0) {
            return this.d.getInt(d + this.c);
        }
        return 0;
    }

    public final String n() {
        int d = d(28);
        if (d != 0) {
            return f(d + this.c);
        }
        return null;
    }

    public final String o() {
        int d = d(30);
        if (d != 0) {
            return f(d + this.c);
        }
        return null;
    }

    public final String p() {
        int d = d(32);
        if (d != 0) {
            return f(d + this.c);
        }
        return null;
    }

    public final String q() {
        int d = d(34);
        if (d != 0) {
            return f(d + this.c);
        }
        return null;
    }

    public final apxg r() {
        return a(new apxg(), 0);
    }

    public static int a(apxe apxe, int[] iArr) {
        int length = iArr.length;
        apxe.a(4, length, 4);
        while (true) {
            length--;
            if (length < 0) {
                return apxe.b();
            }
            apxe.c(iArr[length]);
        }
    }

    public final int a() {
        int d = d(4);
        if (d != 0) {
            return this.d.getInt(d + this.c);
        }
        return 0;
    }

    public final apxg a(apxg apxg, int i) {
        int d = d(20);
        if (d == 0) {
            return null;
        }
        apxg.b(e(h(d) + (i * 4)), this.d);
        return apxg;
    }
}
