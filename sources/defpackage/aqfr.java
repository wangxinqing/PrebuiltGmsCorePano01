package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: aqfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqfr implements aqgg {
    static final long a = TimeUnit.SECONDS.toNanos(10);
    private final double b;
    private long c;
    private aqey d;
    private long e;
    private aqey f;

    public aqfr(int i, int i2) {
        this.b = Math.sqrt((double) (((float) i2) / ((float) i)));
        c();
    }

    private final boolean e() {
        long j = this.c;
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j2 = this.e;
        return (j2 == Long.MIN_VALUE || this.d == null || this.f == null || Math.abs(j - j2) >= a || this.d.a(this.f) >= 1000.0d || ((float) this.f.d) == 0.0f || ((float) this.d.d) == 0.0f) ? false : true;
    }

    public final int a(long j, int i) {
        return 38;
    }

    public final void a(long j, float f2, float f3) {
    }

    public final void a(long j, aqfq aqfq) {
    }

    public final void a(long j, aqgf aqgf) {
    }

    public final long b() {
        return Math.max(this.c, this.e);
    }

    public final void c() {
        this.c = Long.MIN_VALUE;
        this.d = null;
        this.e = Long.MIN_VALUE;
        this.f = null;
    }

    public final void d() {
        c();
    }

    public final aqey a() {
        long j;
        aqew aqew;
        if (!e()) {
            return null;
        }
        aqey aqey = this.f;
        int i = aqey.d;
        aqey aqey2 = this.d;
        int i2 = aqey2.d;
        if (((float) i) / ((float) i2) > 2.0f) {
            return aqey2;
        }
        double d2 = (double) i2;
        double d3 = this.b;
        Double.isNaN(d2);
        double d4 = d3 * d2;
        double d5 = (double) i;
        Double.isNaN(d5);
        Double.isNaN(d5);
        double d6 = 1.0d / ((((d5 * d5) / d4) / d4) + 1.0d);
        if (aqey2 == null || aqey == null) {
            return null;
        }
        Double.isNaN(d5);
        Double.isNaN(d5);
        Double.isNaN(d2);
        Double.isNaN(d2);
        int round = (int) Math.round(Math.sqrt((d6 * d5 * d5) + ((1.0d - d6) * d2 * d2)));
        aqex aqex = d6 <= 0.5d ? aqex.GPS : aqex.WIFI;
        double a2 = aell.a(aqey2.b, aqey2.c, aqey.b, aqey.c);
        double b2 = aell.b(aqey2.b, aqey2.c, aqey.b, aqey.c);
        int i3 = aqey2.b;
        int i4 = aqey2.c;
        int max = Math.max(-900000000, Math.min(900000000, i3));
        if (i4 < -1800000000) {
            i4 -= 694967296;
        } else if (i4 >= 1800000000) {
            i4 += 694967296;
        }
        long a3 = aelk.a(max, i4);
        double d7 = a2 * d6;
        double a4 = aell.a(aelk.a(a3));
        double a5 = aell.a((int) a3);
        double d8 = d7 / 6367000.0d;
        double sin = Math.sin(b2);
        double cos = Math.cos(b2);
        if (d7 < (1.5707963267948966d - Math.abs(a4)) * 140.0d) {
            double d9 = (cos * d8) + a4;
            j = aelk.a(d9, a5 + ((sin * d8) / Math.cos((a4 + d9) / 2.0d)));
        } else {
            double sin2 = Math.sin(a4);
            double cos2 = Math.cos(a4);
            double sin3 = Math.sin(d8);
            double cos3 = Math.cos(d8);
            double d10 = cos2 * sin3;
            double asin = Math.asin((sin2 * cos3) + (cos * d10));
            j = aelk.a(asin, a5 + Math.atan2(d10 * sin, cos3 - (sin2 * Math.sin(asin))));
        }
        if (aqex.equals(aqex.WIFI)) {
            aqew = aqey.j();
            aqew.a(aelk.b(j), aelk.c(j), round);
            if (aqey2.h()) {
                aqew.b(aqey2.l);
            }
            if (aqey2.d()) {
                aqew.d(aqey2.e);
            }
        } else {
            aqew j2 = aqey2.j();
            j2.a(aelk.b(j), aelk.c(j), round);
            if (aqey.f() && aqey.g()) {
                j2.a(aqey.g);
                j2.b(aqey.h);
            }
            aqew = j2;
        }
        return aqew.a();
    }

    public final void a(long j, aqey aqey) {
        if ((aqey.n & 1) == 0) {
            return;
        }
        if (aqey.a()) {
            this.d = aqey;
            this.c = j;
        } else if (aqey.b()) {
            this.f = aqey;
            this.e = j;
        }
    }

    public final void a(long j, PrintWriter printWriter) {
        aqey aqey;
        aqey aqey2;
        StringBuilder sb = new StringBuilder();
        sb.append("GpsWifiFusion:");
        long j2 = this.c;
        if (!(j2 == Long.MIN_VALUE || (aqey2 = this.d) == null)) {
            int i = aqey2.d;
            StringBuilder sb2 = new StringBuilder(68);
            sb2.append(" GpsAccuray{time(ns)=");
            sb2.append(j2);
            sb2.append(", accuracy(mm)=");
            sb2.append(i);
            sb2.append("}");
            sb.append(sb2.toString());
        }
        long j3 = this.e;
        if (!(j3 == Long.MIN_VALUE || (aqey = this.f) == null)) {
            int i2 = aqey.d;
            StringBuilder sb3 = new StringBuilder(70);
            sb3.append(" WifiAccuracy{time(ns)=");
            sb3.append(j3);
            sb3.append(", accuracy(mm)=");
            sb3.append(i2);
            sb3.append("}");
            sb.append(sb3.toString());
        }
        boolean e2 = e();
        StringBuilder sb4 = new StringBuilder(20);
        sb4.append(" Fusion active=");
        sb4.append(e2);
        sb.append(sb4.toString());
        printWriter.println(sb);
    }
}
