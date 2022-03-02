package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: arus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arus {
    public final ahyb a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final double f;
    public long g = -1;
    public long h;
    public long i;

    public arus(long j, long j2, long j3, long j4, int i2, int i3, int i4, double d2) {
        this.b = j;
        this.c = j2;
        this.d = j4;
        this.h = -j4;
        this.e = i2;
        this.f = d2;
        this.a = new ahyb(3, (int) (((long) Math.max(50, i2)) * TimeUnit.NANOSECONDS.toSeconds(Math.max(j3, j))), i3, i4);
    }

    public final int a(int i2, int i3, int i4, double d2) {
        float a2 = this.a.a(i2, i4);
        double d3 = (double) a2;
        double a3 = (double) (this.a.a(i3, i4) - a2);
        Double.isNaN(a3);
        Double.isNaN(d3);
        return (int) ((d3 + (a3 * d2)) / this.f);
    }
}
