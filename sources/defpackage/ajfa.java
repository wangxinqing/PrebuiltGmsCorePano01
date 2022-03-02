package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.android.location.quake.ShakeEvent;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: ajfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajfa extends ajgs {
    private static final long a = TimeUnit.SECONDS.toNanos(ayel.a.a().quakeApiSessionCooldownS());
    private static final long b = TimeUnit.SECONDS.toNanos(ayel.a.a().quakeApiSessionAccelMaxS());
    private static final long c = TimeUnit.MILLISECONDS.toNanos(ayel.a.a().quakeApiAccelHeadMs());
    private static final long d = TimeUnit.MILLISECONDS.toNanos(ayel.a.a().quakeApiAccelTriggeringMs());
    private static final long e = TimeUnit.MILLISECONDS.toNanos(ayel.a.a().quakeApiAccelTailMs());
    private final boolean i;
    private final ajfq j;
    private final amri k;
    private final ajed l;
    private final amsv m;
    private final amsv n;
    private final amsv o;
    private boolean p;
    private ajgx q;
    private ajdj r;
    private ShakeEvent s;
    private long t;
    private long u;

    public ajfa(boolean z, ajfq ajfq, amri amri, ajed ajed, amsv amsv, amsv amsv2, amsv amsv3) {
        super("RTRep");
        this.i = z;
        this.j = ajfq;
        this.k = amri;
        this.l = ajed;
        this.m = amsv;
        this.n = amsv2;
        this.o = amsv3;
    }

    private final void b(long j2) {
        String.valueOf((j2 - this.s.a) / 1000000);
    }

    public final void c() {
        long j2 = this.s.a - c;
        this.u = j2;
        a(j2);
    }

    public final void d() {
        jjg jjg = ajfj.a;
        this.r.a(this.j.h().d, (amri) this.n.a());
    }

    private final void a(long j2) {
        long j3;
        arur arur;
        long j4;
        int i2;
        double d2;
        jjg jjg = ajfj.a;
        ajec b2 = this.l.b(this.l.a(this.s.a));
        arus arus = (arus) this.m.a();
        if (arus != null) {
            if (!arus.a.a()) {
                long j5 = j2 - arus.i;
                int a2 = arus.a.a(j5);
                ahyb ahyb = arus.a;
                int i3 = ahyb.c - 1;
                if (a2 == -1) {
                    j4 = ahyb.a(0);
                    a2 = 0;
                } else {
                    j4 = j5;
                }
                aucd o2 = aruv.f.o();
                int i4 = arus.e;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aruv aruv = (aruv) o2.b;
                aruv.a = i4;
                aruv.b = arus.f;
                long j6 = 1000000000 / ((long) arus.e);
                int i5 = a2;
                long j7 = j4;
                while (i5 <= i3) {
                    int i6 = i5 != i3 ? i5 + 1 : i5;
                    long a3 = arus.a.a(i5);
                    long a4 = arus.a.a(i6);
                    long j8 = j7;
                    while (j8 >= a3 && j8 <= a4) {
                        if (a4 != a3) {
                            double d3 = (double) (j8 - a3);
                            i2 = i3;
                            double d4 = (double) (a4 - a3);
                            Double.isNaN(d3);
                            Double.isNaN(d4);
                            d2 = d3 / d4;
                        } else {
                            i2 = i3;
                            d2 = 0.0d;
                        }
                        int i7 = i6;
                        aucd aucd = o2;
                        int i8 = i5;
                        int a5 = arus.a(i5, i6, 0, d2);
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aruv aruv2 = (aruv) aucd.b;
                        if (!aruv2.c.a()) {
                            aruv2.c = aucj.a(aruv2.c);
                        }
                        aruv2.c.d(a5);
                        int a6 = arus.a(i8, i7, 1, d2);
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aruv aruv3 = (aruv) aucd.b;
                        if (!aruv3.d.a()) {
                            aruv3.d = aucj.a(aruv3.d);
                        }
                        aruv3.d.d(a6);
                        int a7 = arus.a(i8, i7, 2, d2);
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aruv aruv4 = (aruv) aucd.b;
                        if (!aruv4.e.a()) {
                            aruv4.e = aucj.a(aruv4.e);
                        }
                        aruv4.e.d(a7);
                        j8 += j6;
                        o2 = aucd;
                        i5 = i8;
                        i3 = i2;
                        i6 = i7;
                    }
                    i5++;
                    o2 = o2;
                    j7 = j8;
                    i3 = i3;
                }
                long j9 = arus.i;
                arur = new arur((aruv) o2.i(), j4 + j9, j7 + j9);
            } else {
                arur = null;
            }
            if (arur != null) {
                ajqm.a(this.s.a / 1000000);
                b(j2);
                b(arur.b);
                b(arur.c);
                arur.a.c.size();
                ajed ajed = this.l;
                this.r.a(ajed.b(ajed.a(arur.b)), arur.a, b2, (amri) this.n.a());
                j3 = arur.c;
            } else {
                j3 = Long.MAX_VALUE;
            }
        } else {
            j3 = Long.MAX_VALUE;
        }
        this.t = j3;
        long j10 = j3 - this.u;
        long j11 = j3 - this.s.a;
        long j12 = e;
        if (j11 < j12) {
            long j13 = d;
            if (j11 >= j13) {
                long j14 = j12 - j11;
                if (j10 + j14 <= b) {
                    this.h.b.a(12, (Bundle) null, j14 / 1000000);
                }
            } else if (j10 + j13 <= b) {
                this.h.b.a(12, (Bundle) null, d / 1000000);
            }
        }
    }

    public final void b() {
        jjg jjg = ajfj.a;
        if (this.r != null) {
            if (this.k.a() && !((ajct) this.k.b()).d()) {
                this.r.a((amri) this.n.a());
            }
            this.r.a();
            this.r = null;
        }
    }

    public final void a() {
        jjg jjg = ajfj.a;
        this.r = (ajdj) this.o.a();
        boolean quakeApiUsePersistentThrottler = ayel.a.a().quakeApiUsePersistentThrottler();
        this.p = quakeApiUsePersistentThrottler;
        if (quakeApiUsePersistentThrottler && this.q == null) {
            this.q = ajgn.a("ea_qrt_s", (jiq) new ajee(this.l), ayel.a.a().quakeApiSessionThrottlerConfig(), (Executor) new jls((Handler) this.h.b));
        }
        this.h.c();
    }

    public final boolean a(Message message) {
        if (this.r == null) {
            return false;
        }
        int i2 = message.what;
        if (i2 == 6) {
            jjg jjg = ajfj.a;
            if (this.i) {
                d();
            }
        } else if (i2 == 7) {
            jjg jjg2 = ajfj.a;
            ShakeEvent shakeEvent = (ShakeEvent) ajgt.b(message);
            this.s = shakeEvent;
            if (this.p) {
                if (!this.q.a(new ajez(this))) {
                    this.q.a();
                }
            } else if ((this.t + a) - shakeEvent.a <= 0) {
                c();
            }
        } else if (i2 == 12) {
            jjg jjg3 = ajfj.a;
            a(this.t);
            return true;
        }
        return false;
    }
}
