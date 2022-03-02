package defpackage;

import java.io.PrintWriter;

/* renamed from: aqgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgh implements aqgg {
    private final aqft a;
    private final aqfu b;
    private final qul c = new qul(2, 1);
    private final qul d = new qul(2, 2);
    private final qul e = qul.a(2);
    private long f;
    private final aqgj g;
    private long h = Long.MAX_VALUE;

    public aqgh(aqgj aqgj, int i) {
        aqft aqft = new aqft(new qul(2, 1), new qul(2, 2), new qul(2, 2), new qul(2, 2));
        this.a = aqft;
        this.b = new aqfu(aqft, i);
        this.d.a(0, 0, 0.16000000000000003d);
        this.d.a(1, 1, 0.16000000000000003d);
        this.g = aqgj;
    }

    public final int a(long j, int i) {
        return 31;
    }

    public final void a(long j, aqfq aqfq) {
    }

    public final void a(long j, aqgf aqgf) {
    }

    public final void a(long j, PrintWriter printWriter) {
    }

    public final long b() {
        return this.f;
    }

    public final void c() {
        this.b.c();
        this.h = Long.MAX_VALUE;
    }

    public final void d() {
        c();
    }

    public final aqey a() {
        return this.b.a();
    }

    public final void a(long j, float f2, float f3) {
        long j2 = j;
        float f4 = f2;
        if (this.b.a() != null && this.g.a(j2) <= 4.0f) {
            if (f4 != Float.MAX_VALUE) {
                double d2 = (double) f4;
                this.c.a(0, 0, Math.sin(d2) * 0.8d);
                this.c.a(1, 0, Math.cos(d2) * 0.8d);
                this.d.a();
                qul qul = this.d;
                double min = Math.min(0.5235987901687622d, 0.17453292519943295d);
                Double.isNaN(d2);
                double d3 = -1.5707963705062866d + d2;
                double d4 = 0.0d;
                double d5 = 0.0d;
                double d6 = 0.0d;
                double d7 = 0.0d;
                double d8 = 0.0d;
                double d9 = 0.0d;
                while (true) {
                    Double.isNaN(d2);
                    if (d3 < d2 + 1.5707963705062866d) {
                        double cos = Math.cos(d3);
                        double sin = Math.sin(d3);
                        Double.isNaN(d2);
                        double d10 = d3 - d2;
                        double exp = (Math.exp(((-d10) * d10) / 0.548311386132383d) / (Math.sqrt(6.283185307179586d) * 0.5235987901687622d)) * min;
                        d5 += exp;
                        d4 += cos * exp;
                        d6 += sin * exp;
                        d8 += cos * cos * exp;
                        d9 += sin * sin * exp;
                        d7 += cos * sin * exp;
                        d3 += min;
                    } else {
                        double d11 = d4 / d5;
                        double d12 = d6 / d5;
                        double d13 = d11 * 0.6400000000000001d;
                        double d14 = ((d7 / d5) * 0.8000000000000002d) - (d13 * d12);
                        qul.a(0, 0, ((d8 / d5) * 0.8000000000000002d) - (d13 * d11));
                        qul.a(1, 1, ((d9 / d5) * 0.8000000000000002d) - ((0.6400000000000001d * d12) * d12));
                        qul.a(0, 1, d14);
                        qul.a(1, 0, d14);
                        this.a.a(this.e, this.d, this.c);
                        this.f = j2;
                        this.h = j2;
                        return;
                    }
                }
            } else {
                long j3 = this.h;
                if (j3 != Long.MAX_VALUE) {
                    double d15 = (double) (j2 - j3);
                    Double.isNaN(d15);
                    double d16 = d15 / 1.0E9d;
                    this.b.a(d16 * d16 * 2.5d * 2.5d);
                }
                this.h = j2;
            }
        }
    }

    public final void a(long j, aqey aqey) {
        if (aqey.a() && aqey.d() && aqey.e > 4.0f) {
            this.b.c();
            this.b.a(j, aqey);
        } else {
            long j2 = this.h;
            if (j2 != Long.MAX_VALUE) {
                aqfu aqfu = this.b;
                double d2 = (double) (j - j2);
                Double.isNaN(d2);
                double d3 = d2 / 1.0E9d;
                double a2 = (double) this.g.a(j);
                Double.isNaN(a2);
                Double.isNaN(a2);
                aqfu.a(d3 * d3 * a2 * a2);
            }
            this.b.a(j, aqey);
        }
        this.h = j;
        this.f = j;
    }
}
