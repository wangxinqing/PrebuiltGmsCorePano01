package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: aqfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aqfg extends aqfd {
    private static final long b = TimeUnit.SECONDS.toNanos(1);
    private static final long c = TimeUnit.MINUTES.toNanos(4);
    private static final long d = TimeUnit.SECONDS.toNanos(8);
    private static final long e = TimeUnit.MINUTES.toNanos(30);
    private final aqgg f;
    private final aqgg g;
    private aqey h = null;
    private long i = 0;
    private aqgf j = aqgf.UNKNOWN;
    private double k = Double.MAX_VALUE;

    public aqfg(aqgg aqgg, aqgg aqgg2) {
        this.f = aqgg;
        this.g = aqgg2;
        this.a = new aqgg[]{aqgg, aqgg2};
    }

    private final double a(long j2) {
        double d2 = 13.0d;
        if (this.j != null && j2 < this.i + c) {
            aqgf aqgf = aqgf.UNKNOWN;
            int ordinal = this.j.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                d2 = 1.5d;
            } else if (ordinal == 3) {
                d2 = 6.0d;
            } else if (ordinal != 4) {
                d2 = 44.7d;
            }
        }
        long b2 = this.f.b();
        if (b2 < j2) {
            return a(j2 - b2, d2);
        }
        return 0.0d;
    }

    private static double a(long j2, double d2) {
        double d3 = (double) j2;
        double d4 = (double) b;
        Double.isNaN(d3);
        Double.isNaN(d4);
        double d5 = d3 / d4;
        if (j2 > e) {
            d2 = 300.0d;
        }
        return d2 * d5;
    }

    private final boolean e() {
        long b2 = this.g.b();
        double a = a(b2);
        aqey a2 = this.f.a();
        if (a2 == null) {
            return false;
        }
        aqey a3 = this.g.a();
        if (a3 != null) {
            long b3 = this.f.b();
            double a4 = a2.a(a3);
            if (b3 >= b2) {
                this.k = Double.MAX_VALUE;
            }
            double d2 = this.k;
            if (a4 < d2) {
                this.k = a4;
                d2 = a4;
            }
            if (d2 <= a) {
                long j2 = b2 - b3;
                if (j2 < Math.max(d, 0) || a(j2, 44.7d) <= a4) {
                    return true;
                }
                return false;
            } else if (d2 <= 20000.0d || b2 < b3 || !a2.b()) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public final long b() {
        return Math.max(this.f.b(), this.g.b());
    }

    public final void c() {
        super.c();
        this.h = null;
        this.i = 0;
        this.j = aqgf.UNKNOWN;
        this.k = Double.MAX_VALUE;
    }

    public int a(long j2, int i2) {
        int a = this.f.a(j2, i2);
        if (j2 - this.f.b() >= Math.max(d, 0) || (a & i2 & 7) == 0 || this.f.a() == null) {
            return this.g.a(j2, i2) | a;
        }
        return a;
    }

    public final aqey a() {
        if (!e()) {
            return this.g.a();
        }
        aqey a = this.f.a();
        if (a == null) {
            return null;
        }
        long b2 = this.g.b();
        if (b2 <= this.f.b()) {
            return a;
        }
        int a2 = a.d + ((int) (a(b2) * 1000.0d));
        aqey aqey = this.h;
        if (!(aqey != null && aqey.b == a.b && aqey.c == a.c && aqey.d == a2)) {
            aqew j2 = a.j();
            j2.a(a.b, a.c, a2);
            j2.g = -1.0f;
            int i2 = j2.n & -9;
            j2.n = i2;
            j2.e = 0.0f;
            j2.n = i2 & -5;
            this.h = j2.a();
        }
        return this.h;
    }

    public final void a(long j2, aqgf aqgf) {
        super.a(j2, aqgf);
        this.i = j2;
        this.j = aqgf;
    }

    public final void a(long j2, PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("FailOverFusion:");
        long j3 = this.i;
        if (j3 != 0) {
            String valueOf = String.valueOf(this.j);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 50);
            sb2.append("activity{time(ns)=");
            sb2.append(j3);
            sb2.append(", activity=");
            sb2.append(valueOf);
            sb2.append("}");
            sb.append(sb2.toString());
        }
        long b2 = this.f.b();
        long b3 = this.g.b();
        StringBuilder sb3 = new StringBuilder(71);
        sb3.append(" time(ns): {primary=");
        sb3.append(b2);
        sb3.append(",failover=");
        sb3.append(b3);
        sb3.append("}");
        sb.append(sb3.toString());
        double d2 = this.k;
        if (d2 != Double.MAX_VALUE) {
            StringBuilder sb4 = new StringBuilder(42);
            sb4.append(" failOverDistance:");
            sb4.append(d2);
            sb.append(sb4.toString());
        }
        printWriter.println(sb);
        if (e()) {
            this.f.a(j2, printWriter);
        } else {
            this.g.a(j2, printWriter);
        }
    }
}
