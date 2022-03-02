package defpackage;

/* renamed from: artw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class artw extends artv {
    public artw(int i, int i2, long j) {
        super(a(i, i2, j));
    }

    public static int a(long j) {
        return artv.a(j, 4, 1023, 0, 999);
    }

    public static int b(long j) {
        return artv.a(j, 14, 2047, 0, 1099);
    }

    public static long c(long j) {
        long j2 = (j >> 25) & 68719476735L;
        artv.e(j2);
        return j2;
    }

    public final String toString() {
        return "[type: NR, MCC: " + a() + ", MNC: " + b() + ", NCI: " + c() + "]";
    }

    public static long a(int i, int i2, long j) {
        long c = artv.c(i, 999, 4);
        long c2 = artv.c(i2, 1099, 14);
        artv.e(j);
        return c2 | c | 5 | (j << 25);
    }

    public final int b() {
        return b(this.a);
    }

    public final long c() {
        return c(this.a);
    }

    public final int a() {
        return a(this.a);
    }
}
