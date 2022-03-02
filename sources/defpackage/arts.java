package defpackage;

/* renamed from: arts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arts extends artv {
    public arts(int i, int i2, int i3) {
        super(a(i, i2, i3));
    }

    public static int a(long j) {
        return artv.a(j, 4, 65535, 0, 65535);
    }

    public static int b(long j) {
        return artv.a(j, 20, 65535, 0, 65535);
    }

    public static int c(long j) {
        return artv.a(j, 36, 65535, 0, 65535);
    }

    public final String toString() {
        return "[type: CDMA, SID: " + a() + ", NID: " + b() + ", BID: " + c() + "]";
    }

    public static long a(int i, int i2, int i3) {
        return artv.c(i2, 65535, 20) | artv.c(i, 65535, 4) | 3 | artv.c(i3, 65535, 36);
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
