package defpackage;

/* renamed from: aelk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aelk {
    public static final int a(long j) {
        return (int) (j >> 32);
    }

    public static final long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final double b(long j) {
        return aell.b(a(j));
    }

    public static final double c(long j) {
        return aell.b((int) j);
    }

    public static final long a(double d, double d2) {
        return a(aell.a(Math.max(-1.5707963267948966d, Math.min(1.5707963267948966d, d))), aell.a(aell.c(d2)));
    }
}
