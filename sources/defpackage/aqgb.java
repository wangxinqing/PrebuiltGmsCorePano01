package defpackage;

import com.google.location.bluemoon.inertialanchor.InertialAnchorBase;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

/* renamed from: aqgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgb extends aqfd {
    private static final long f = TimeUnit.SECONDS.toNanos(12);
    final Deque b;
    final aqge c;
    public final InertialAnchorBase d;
    long e = Long.MIN_VALUE;
    private final long g;
    private final aqig h;
    private final aqgk i;
    private final aqgg j;
    private final aqfb k;
    private final aqgg l;
    private final aqgj m;
    private final float n;
    private long o = Long.MIN_VALUE;
    private final aqfv p;
    private final aqfa q;
    private final aqhm r;

    public aqgb(float f2, aqig aqig, int i2, int i3, int i4, aqgs aqgs, InertialAnchorBase inertialAnchorBase, aqhm aqhm) {
        aqfa aqfa;
        aqge aqge;
        ArrayDeque arrayDeque;
        aqig aqig2 = aqig;
        aqgs aqgs2 = aqgs;
        this.h = aqig2;
        aqhs aqhs = (aqhs) aqig2;
        aqfb aqfb = null;
        this.p = aqhs.l ? new aqfw(aqhs.t) : null;
        if (aqhs.o) {
            aqfa = new aqfa(aqhs.p);
        } else {
            aqfa = null;
        }
        this.q = aqfa;
        this.d = inertialAnchorBase;
        this.r = aqhm;
        if (aqgs2 != null) {
            aqge = new aqge(aqgs2, f);
        } else {
            aqge = null;
        }
        this.c = aqge;
        this.i = new aqgk();
        this.m = new aqgj();
        this.n = f2;
        this.g = aqjs.a(aqhs.c);
        if (aqhs.b) {
            arrayDeque = new ArrayDeque(aqhs.d);
        } else {
            arrayDeque = null;
        }
        this.b = arrayDeque;
        aqfx aqfx = new aqfx(new aqfe());
        aqfh aqfh = new aqfh(new aqfy(), 3);
        this.j = new aqfz(new aqfe());
        this.l = new aqfg(new aqgc(new aqfr(i2, i3), new aqga(this.j, aqfx), true, i4), aqfh);
        aqfb = aqhs.f ? new aqfb(aqjs.a(aqhs.g), aqjs.a(aqhs.h), aqjs.a(aqhs.i)) : aqfb;
        this.k = aqfb;
        if (aqfb != null) {
            this.a = new aqgg[]{this.l, this.m, aqfb};
        } else {
            this.a = new aqgg[]{this.l, this.m};
        }
    }

    public final int a(long j2, int i2) {
        int a = this.l.a(j2, i2);
        if (!e()) {
            if (!this.m.b(j2)) {
                a |= 16;
            }
            if (!c(j2)) {
                return a;
            }
            aqge aqge = this.c;
            if (aqge != null) {
                return aqge.a(j2, i2) | a;
            }
        }
        return a;
    }

    public final long b() {
        boolean z;
        if (((aqhs) this.h).b) {
            z = b(this.e);
        } else {
            z = a(this.e);
        }
        if (!z || this.c.a() == null) {
            return this.l.b();
        }
        return this.c.b();
    }

    public final void c() {
        super.c();
        aqge aqge = this.c;
        if (aqge != null) {
            aqge.c();
        }
        aqfv aqfv = this.p;
        if (aqfv != null) {
            aqfv.a();
        }
        aqfa aqfa = this.q;
        if (aqfa != null) {
            aqfa.a();
        }
        this.i.a();
    }

    public final void d() {
        super.d();
        aqge aqge = this.c;
        if (aqge != null) {
            aqge.d();
        }
        aqfv aqfv = this.p;
        if (aqfv != null) {
            aqfv.a();
        }
        aqfa aqfa = this.q;
        if (aqfa != null) {
            aqfa.a();
        }
        this.i.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        aqey a = this.l.a();
        return a != null && a.c();
    }

    /* access modifiers changed from: package-private */
    public final boolean e(long j2) {
        aqhm aqhm;
        aqge aqge;
        boolean z = false;
        if (((aqhs) this.h).j && (aqhm = this.r) != null) {
            if (aqhm.a() + ((aqhs) this.h).k > j2) {
                z = true;
            }
            if (z && (aqge = this.c) != null) {
                if (j2 > aqge.b) {
                    aqge.b = j2;
                }
                return true;
            }
        }
        return z;
    }

    public final aqey a() {
        boolean z;
        aqey aqey;
        int i2;
        aqfv aqfv;
        if (((aqhs) this.h).b) {
            z = b(this.e);
        } else {
            z = a(this.e);
        }
        if (z) {
            aqey = this.c.a();
        } else {
            aqey = null;
        }
        if (!z || aqey == null) {
            aqey = this.l.a();
        }
        if (aqey == null) {
            return aqey;
        }
        for (aqjv aqjv : aqju.a) {
        }
        aqfb aqfb = this.k;
        if (aqfb != null) {
            long j2 = this.e;
            aqey aqey2 = aqfb.c;
            if (aqey2 == null || j2 - aqfb.d >= aqfb.a) {
                aqey aqey3 = aqfb.e;
                if (aqey3 != null && j2 - aqfb.f < aqfb.b) {
                    aqey = aqfb.a(aqey, aqey3);
                }
            } else {
                aqey = aqfb.a(aqey, aqey2);
            }
            long j3 = aqfb.g;
            if (j3 > 0 && aqey.k == null && aqfb.h != null && j2 - aqfb.j < j3) {
                aqew j4 = aqey.j();
                j4.a(aqfb.h);
                j4.k = aqfb.i;
                aqey = j4.a();
            }
        }
        int i3 = aqey.d;
        aqhs aqhs = (aqhs) this.h;
        if (aqhs.l && (aqfv = this.p) != null) {
            if (aqhs.q) {
                aqey = aqfv.a(aqey, this.e);
            } else {
                aqey = aqfv.a(aqey, b());
            }
        }
        aqhs aqhs2 = (aqhs) this.h;
        if (!aqhs2.o) {
            return aqey;
        }
        if (aqhs2.q) {
            i2 = this.q.a(i3, this.e);
        } else {
            i2 = this.q.a(i3, b());
        }
        double d2 = ((aqhs) this.h).n;
        aqew j5 = aqey.j();
        int i4 = aqey.b;
        int i5 = aqey.c;
        double d3 = (double) i2;
        Double.isNaN(d3);
        j5.a(i4, i5, (int) (d3 * d2));
        return j5.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean b(long j2) {
        boolean z;
        if (!((aqhs) this.h).s || this.i.a != aqgf.IN_VEHICLE) {
            z = false;
        } else {
            z = true;
        }
        return (a(j2) && d(j2) && !z) || e(j2);
    }

    /* access modifiers changed from: package-private */
    public final boolean c(long j2) {
        double a = (double) this.m.a(j2);
        for (aqjv aqjv : aqju.a) {
        }
        return a < ((aqhs) this.h).a;
    }

    /* access modifiers changed from: package-private */
    public final boolean d(long j2) {
        while (!this.b.isEmpty() && ((Long) this.b.peekFirst()).longValue() < j2 - this.g) {
            this.b.removeFirst();
        }
        return this.b.size() == ((aqhs) this.h).d;
    }

    public final void a(long j2, float f2, float f3) {
        for (aqjv aqjv : aqju.a) {
        }
        super.a(j2, f2, f3);
        this.o = j2;
        aqhs aqhs = (aqhs) this.h;
        if (aqhs.b) {
            if (aqhs.d == this.b.size()) {
                this.b.removeFirst();
            }
            while (!this.b.isEmpty() && ((Long) this.b.peekFirst()).longValue() <= j2 - this.g) {
                this.b.removeFirst();
            }
            if (this.b.isEmpty() || ((Long) this.b.peekLast()).longValue() != j2) {
                this.b.add(Long.valueOf(j2));
            }
        }
        this.e = j2;
        if (a(j2)) {
            this.c.a(j2, f2, f3);
        }
    }

    public final void a(long j2, aqey aqey) {
        aqhm aqhm;
        for (aqjv aqjv : aqju.a) {
        }
        if (((aqhs) this.h).r) {
            aqey a = aqgd.a(aqey, this.n);
            this.i.a(a);
            super.a(j2, a);
        } else {
            this.i.a(aqey);
            super.a(j2, aqey);
        }
        this.j.a(j2, aqey);
        this.e = j2;
        if (a(j2)) {
            this.c.a(j2, aqey);
        } else if (((aqhs) this.h).j && (aqhm = this.r) != null) {
            aqhm.d(2);
        }
    }

    public final void a(long j2, aqfq aqfq) {
        super.a(j2, aqfq);
        this.e = j2;
    }

    public final void a(long j2, aqgf aqgf) {
        String.valueOf(aqgf);
        for (aqjv aqjv : aqju.a) {
        }
        this.i.a(aqgf);
        super.a(j2, this.i.a);
        if (((aqhs) this.h).m) {
            aqfv aqfv = this.p;
            if (aqfv instanceof aqfw) {
                aqgf aqgf2 = aqgf.UNKNOWN;
                int ordinal = aqgf.ordinal();
                if (ordinal == 0) {
                    aqfw aqfw = (aqfw) aqfv;
                    aqfw.b = aqfw.a.a();
                    aqfw.c = aqfw.a.b();
                } else if (ordinal == 1) {
                    ((aqfw) aqfv).b();
                } else if (ordinal == 2) {
                    aqfw aqfw2 = (aqfw) aqfv;
                    aqfw2.b = aqfw2.a.c();
                    aqfw2.c = aqfw2.a.d();
                } else if (ordinal == 3) {
                    ((aqfw) aqfv).b();
                } else if (ordinal == 4) {
                    ((aqfw) aqfv).b();
                }
            }
        }
        this.e = j2;
    }

    public final void a(long j2, PrintWriter printWriter) {
        printWriter.printf("ParticleFilterFusion: should run: %b\n", new Object[]{Boolean.valueOf(a(this.e))});
        if (this.c == null) {
            printWriter.println("  Particle filter implementation not instantiated.");
        }
        aqge aqge = this.c;
        if (aqge != null) {
            aqge.a(j2, printWriter);
        }
        InertialAnchorBase inertialAnchorBase = this.d;
        if (inertialAnchorBase != null) {
            inertialAnchorBase.a(printWriter);
        }
        super.a(j2, printWriter);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(long j2) {
        boolean z;
        boolean z2 = false;
        if (this.c == null) {
            return false;
        }
        boolean c2 = c(j2);
        aqhs aqhs = (aqhs) this.h;
        if (aqhs.b && !aqhs.e) {
            z = d(j2);
        } else {
            long j3 = this.o;
            if (j3 != Long.MIN_VALUE) {
                z = j2 - j3 < this.g;
            } else {
                z = false;
            }
        }
        boolean e2 = e();
        boolean e3 = e(j2);
        if (c2 && z && !e2) {
            z2 = true;
        } else if (e3) {
            z2 = true;
        }
        for (aqjv aqjv : aqju.a) {
        }
        return z2;
    }
}
