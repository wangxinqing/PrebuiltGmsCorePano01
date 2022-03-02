package defpackage;

/* renamed from: artx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class artx extends artv {
    public artx(int i, int i2, int i3) {
        super(a(i, i2, i3));
    }

    public static int a(long j) {
        return artv.a(j, 4, 1023, 0, 999);
    }

    public static int b(long j) {
        return artv.a(j, 14, 2047, 0, 1099);
    }

    public static int c(long j) {
        return artv.a(j, 25, 268435455, 0, 268435455);
    }

    public final String toString() {
        return "[type: UMTS, MCC: " + a() + ", MNC: " + b() + ", LCID: " + c() + "]";
    }

    public static long a(int i, int i2, int i3) {
        return artv.c(i2, 1099, 14) | artv.c(i, 999, 4) | 2 | artv.c(i3, 268435455, 25);
    }

    public final int b() {
        return b(this.a);
    }

    public final int c() {
        return c(this.a);
    }

    public final int a() {
        return a(this.a);
    }
}
