package defpackage;

import android.os.SystemClock;

/* renamed from: jkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jkk implements Comparable {
    public int a = 0;
    public long b;
    public int c = 0;
    public long[] d;
    public long e = Long.MAX_VALUE;
    public long f = 0;
    private long g = 0;
    private final Object h;
    private double i = 0.0d;

    public jkk(Object obj) {
        this.h = obj;
        this.d = new long[3];
    }

    private static final double a(double d2) {
        return Math.max(1000.0d, d2);
    }

    private static final double b(double d2) {
        return 1.0d / a(d2);
    }

    private final long d() {
        double a2 = (double) a();
        double a3 = a((double) b());
        Double.isNaN(a2);
        return (long) (a2 / a3);
    }

    public final void c() {
        if (this.a > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.i = a(elapsedRealtime);
            long j = this.b;
            this.b = elapsedRealtime;
            this.g += elapsedRealtime - j;
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        jkk jkk = (jkk) obj;
        if (d() >= jkk.d()) {
            return d() > jkk.d() ? -1 : 0;
        }
        return 1;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("Interval effective/min/max ");
        long j = this.e / 1000;
        long j2 = this.f / 1000;
        double b2 = (double) b();
        Double.isNaN(b2);
        sb.append(Math.min(Math.max(Math.round(b2 / 1000.0d), j), j2));
        sb.append('/');
        sb.append(j);
        sb.append('/');
        sb.append(j2);
        sb.append("[s] Duration: ");
        sb.append(a() / 60000);
        sb.append("[minutes] ");
        sb.append(this.h);
        sb.append(" Num requests: ");
        sb.append(this.c);
        sb.append(" Active: ");
        if (this.a > 0) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        return sb.toString();
    }

    private final double a(long j) {
        if (this.a <= 0) {
            return this.i;
        }
        long j2 = j - this.b;
        long j3 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < this.a; i2++) {
            long j4 = this.d[i2];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        if (this.g == 0) {
            return (double) j3;
        }
        double b2 = b(this.i);
        double d2 = (double) this.g;
        Double.isNaN(d2);
        double d3 = b2 * d2;
        double b3 = b((double) j3);
        double d4 = (double) j2;
        Double.isNaN(d4);
        double d5 = d3 + (b3 * d4);
        double d6 = (double) (this.g + j2);
        Double.isNaN(d6);
        return 1.0d / (d5 / d6);
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        return Math.round(a(SystemClock.elapsedRealtime()));
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        long j = this.g;
        return this.a > 0 ? j + (SystemClock.elapsedRealtime() - this.b) : j;
    }
}
