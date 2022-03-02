package defpackage;

import android.app.Application;
import java.lang.Thread;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: agdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agdx implements agho, agkv {
    private static final anhq f = anhq.a("agdx");
    volatile agfe a;
    public final bapu b;
    public final AtomicBoolean c;
    public volatile bash d;
    volatile agdv e;
    private final boolean g;
    private final int h;
    private final AtomicBoolean i = new AtomicBoolean();
    private final agcz j;
    private final agks k;
    private final agnf l = agnf.a();

    public agdx(agkt agkt, Application application, bapu bapu, amri amri) {
        boolean z;
        this.k = agkt.a((Executor) aoqm.a, this.l);
        this.b = bapu;
        float b2 = ((aggq) amri.b()).b();
        boolean z2 = true;
        if (b2 <= 0.0f || b2 > 100.0f) {
            z = false;
        } else {
            z = true;
        }
        amrl.a(z, (Object) "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        this.j = agcz.a(application);
        this.g = agng.a(b2 / 100.0f).a();
        this.h = (int) (100.0f / b2);
        ((aggq) amri.b()).e();
        amrl.a((Object) ((aggq) amri.b()).c());
        this.c = new AtomicBoolean((!((aggq) amri.b()).d() || !agjs.d(application)) ? false : z2);
    }

    private final void b(basq basq) {
        if (this.l.b() || !this.g) {
            ((anhn) ((anhn) f.d()).a("agdx", "b", 316, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Startup metric for '%s' dropped.", (Object) basq);
        } else if (agzj.a()) {
            ((aorv) this.b.a()).a(new agdt(this, basq));
        } else {
            a(basq);
        }
    }

    public final void a() {
        if (this.c.get()) {
            this.d = null;
        } else if (!this.l.b() && this.g) {
            a(basq.PRIMES_CRASH_MONITORING_INITIALIZED);
        } else {
            ((anhn) ((anhn) f.d()).a("agdx", "a", 255, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Startup metric for 'PRIMES_CRASH_MONITORING_INITIALIZED' dropped.");
        }
    }

    public final void c() {
        if (this.e != null) {
            this.j.b(this.e);
            this.e = null;
        }
        if (this.i.get() && (Thread.getDefaultUncaughtExceptionHandler() instanceof agdw)) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = ((agdw) Thread.getDefaultUncaughtExceptionHandler()).a;
            Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(basq basq) {
        aucd o = basu.s.o();
        aucd o2 = basr.d.o();
        int i2 = this.h;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        basr basr = (basr) o2.b;
        int i3 = basr.a | 2;
        basr.a = i3;
        basr.c = i2;
        basr.b = basq.f;
        basr.a = i3 | 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        basu basu = (basu) o.b;
        basr basr2 = (basr) o2.i();
        basr2.getClass();
        basu.h = basr2;
        basu.a |= 128;
        this.k.a((basu) o.i());
    }

    public final void b() {
        if (!this.c.get()) {
            basq basq = basq.PRIMES_FIRST_ACTIVITY_LAUNCHED;
            if (this.l.b() || !this.g) {
                ((anhn) ((anhn) f.d()).a("agdx", "b", 316, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Startup metric for '%s' dropped.", (Object) basq);
            } else if (agzj.a()) {
                ((aorv) this.b.a()).a(new agdt(this, basq));
                anhq anhq = aggw.a;
            } else {
                a(basq);
            }
        }
        this.e = new agdv(this);
        this.j.a((agcy) this.e);
    }
}
