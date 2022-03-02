package defpackage;

/* renamed from: artt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class artt extends artv {
    public artt(int i, int i2, int i3, int i4) {
        super(a(i, i2, i3, i4));
    }

    public static int a(long j) {
        return artv.a(j, 4, 1023, 0, 999);
    }

    public static int b(long j) {
        return artv.a(j, 14, 2047, 0, 1099);
    }

    public static int c(long j) {
        return artv.a(j, 25, 65535, 0, 65535);
    }

    public static int d(long j) {
        return artv.a(j, 41, 65535, 0, 65535);
    }

    public final String toString() {
        return "[type: GSM, MCC: " + a() + ", MNC: " + b() + ", LAC: " + c() + ", CID: " + d() + "]";
    }

    public static long a(int i, int i2, int i3, int i4) {
        return artv.c(i2, 1099, 14) | artv.c(i, 999, 4) | 1 | artv.c(i3, 65535, 25) | artv.c(i4, 65535, 41);
    }

    public final int b() {
        return b(this.a);
    }

    public final int c() {
        return c(this.a);
    }

    public final int d() {
        return d(this.a);
    }

    public final int a() {
        return a(this.a);
    }
}
