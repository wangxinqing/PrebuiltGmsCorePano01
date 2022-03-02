package defpackage;

import android.app.Application;
import android.content.IntentFilter;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agge implements agfv {
    public static final anhq a = anhq.a("agge");
    static final AtomicInteger b = new AtomicInteger();
    public final Application c;
    public final bapu d;
    public final bapu e;
    public final aghs f;
    public final CountDownLatch g;
    private final bapu h;
    private final bapu i;
    private final bapu j;
    private final bapu k;
    private final AtomicReference l = new AtomicReference();

    public agge(Application application, bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4, bapu bapu5, aghs aghs, agfr agfr, bapu bapu6) {
        new AtomicBoolean();
        this.g = new CountDownLatch(1);
        int i2 = Build.VERSION.SDK_INT;
        amrl.b(true);
        this.c = application;
        this.d = bapu;
        this.e = bapu2;
        this.h = bapu3;
        this.i = bapu4;
        this.j = bapu5;
        this.f = aghs;
        this.k = bapu6;
        b.incrementAndGet();
        this.l.set(agfr);
    }

    static Runnable a(Runnable runnable) {
        return new agfy(new AtomicReference(runnable));
    }

    static void b() {
        int i2 = Build.VERSION.SDK_INT;
    }

    public final void c() {
        ((agfv) this.l.getAndSet(new agff())).c();
        try {
            Application application = this.c;
            synchronized (agcz.class) {
                if (agcz.a != null) {
                    agdb agdb = agcz.a.b;
                    application.unregisterActivityLifecycleCallbacks(agdb.b);
                    application.unregisterComponentCallbacks(agdb.b);
                    agcz.a = null;
                }
            }
        } catch (RuntimeException e2) {
            anhn anhn = (anhn) a.c();
            anhn.a((Throwable) e2);
            ((anhn) anhn.a("agge", "c", 341, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to shutdown app lifecycle monitor");
        }
    }

    public final void d() {
        a().d();
    }

    public final agif e() {
        return a().e();
    }

    public final void f() {
        a().f();
    }

    /* access modifiers changed from: package-private */
    public final agfv a() {
        return (agfv) this.l.get();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(aggc aggc, aggd aggd) {
        CountDownLatch countDownLatch;
        try {
            ((anhn) ((anhn) a.d()).a("agge", "b", 265, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("background initialization");
            a(aggc, aggd);
            countDownLatch = this.g;
        } catch (RuntimeException e2) {
            anhn anhn = (anhn) a.c();
            anhn.a((Throwable) e2);
            ((anhn) anhn.a("agge", "b", 268, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Primes failed to initialize in the background");
            c();
            countDownLatch = this.g;
        } catch (Throwable th) {
            this.g.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public final void a(agev agev) {
        a().a(agev);
    }

    public final void a(aggc aggc, aggd aggd) {
        amlv.a();
        agic agic = (agic) this.h.a();
        agic.a((agid) aggc);
        agic.a((agid) aggd);
        Application application = this.c;
        bapu bapu = this.i;
        bapu.getClass();
        new agga(bapu);
        bapu bapu2 = this.d;
        bapu2.getClass();
        aggb aggb = new aggb(bapu2);
        agjd agjd = new agjd(application);
        agic.a((amsv) agjd);
        if (!agic.b) {
            application.registerReceiver(new agjc(agic, agjd, aggb), new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
        }
        if (agic.b) {
            c();
            return;
        }
        this.i.a();
        this.j.a();
        if (agic.b) {
            c();
        } else if (this.l.get() != null) {
            agdl agdl = (agdl) this.k.a();
            if (agic.b) {
                c();
                return;
            }
            agfv agfv = (agfv) this.l.get();
            if (!(agfv instanceof agfr) || !this.l.compareAndSet(agfv, agdl)) {
                agdl.c();
            }
            ArrayList arrayList = new ArrayList();
            if (agdl.a.e().a() && ((aggq) agdl.a.e().b()).a()) {
                arrayList.add((agkv) agdl.c.a());
            }
            arrayList.addAll((Collection) agdl.f.a());
            if (agdl.a() && !((aghl) agdl.a.g().b()).b()) {
                arrayList.add((agkv) agdl.d.a());
            }
            if (agdl.b() && agmp.a.c > 0) {
                agdl.e.a();
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                agkv agkv = (agkv) arrayList.get(i2);
                agic.a((agid) agkv);
                agkv.a();
                if (agkv instanceof agho) {
                    agho agho = (agho) agkv;
                    synchronized (aggc) {
                        if (!aggc.b) {
                            aggc.a.add(agho);
                        } else {
                            agho.b();
                        }
                    }
                }
            }
            if (!agic.b) {
                agfr agfr = (agfr) agfv;
                agfr.a(agdl);
                synchronized (agfr.b) {
                    agfr.a = agdl;
                }
                agfr.a(agdl);
            }
            agfv.c();
        }
    }

    public final void a(agie agie, barw barw, barb barb) {
        a().a(agie, barw, (barb) null);
    }

    public final void a(agif agif, String str, boolean z) {
        a().a(agif, str, z);
    }

    public final void a(agir agir, String str, long j2, long j3, barb barb) {
        a().a(agir, str, j2, j3, barb);
    }

    public final void a(String str) {
        a().a(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ExecutorService executorService, Runnable runnable) {
        try {
            executorService.submit(runnable);
        } catch (RuntimeException e2) {
            anhn anhn = (anhn) a.c();
            anhn.a((Throwable) e2);
            ((anhn) anhn.a("agge", "a", 230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Primes failed to initialize");
            c();
        }
        if (this.f.a() == null) {
            executorService.shutdown();
        }
    }
}
