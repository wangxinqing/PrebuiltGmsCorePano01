package defpackage;

import android.os.Build;
import android.os.Trace;

/* renamed from: ppo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ppo implements Runnable {
    public final ppr a;
    final /* synthetic */ ppp b;

    protected ppo(ppp ppp, ppr ppr) {
        this.b = ppp;
        this.a = ppr;
    }

    public final void run() {
        oso.d("AsyncScheduler running task %s", (Object) this.a);
        this.b.g.set(Integer.valueOf(this.a.h));
        ppp ppp = this.b;
        ppr ppr = this.a;
        synchronized (ppp.a) {
            if (ppr.i == 4) {
                ppp.b(ppr);
            }
            ppp.h.a(ppr.d(), axry.b());
            ppp.h.c(String.valueOf(ppr.d()).concat("-pending"));
        }
        try {
            ppr ppr2 = this.a;
            boolean z = true;
            ppr2.a(1, 2);
            try {
                if (pba.k()) {
                    int i = Build.VERSION.SDK_INT;
                    Trace.beginSection(ppr2.d());
                }
                if (ppr2.g()) {
                    psc psc = ppr2.k;
                    if (psj.a.get() != null) {
                        z = false;
                    }
                    iva.a(z);
                    psj.a.set(psc);
                }
                ppz.a(ppr2);
                ppr2.m = ppr2.a();
                ppr2.b(ppr2.m);
            } catch (RuntimeException e) {
                ppr2.a(e);
            } catch (Throwable th) {
                ppr2.a(2, 3);
                if (pba.k()) {
                    int i2 = Build.VERSION.SDK_INT;
                    Trace.endSection();
                }
                if (ppr2.g()) {
                    psj.a(ppr2.k);
                    ppr2.k.a(ppr2.d(), ppr2.f());
                }
                ppz.b(ppr2);
                throw th;
            }
            ppr2.l.open();
            ppr2.a(2, 3);
            if (pba.k()) {
                int i3 = Build.VERSION.SDK_INT;
                Trace.endSection();
            }
            if (ppr2.g()) {
                psj.a(ppr2.k);
                ppr2.k.a(ppr2.d(), ppr2.f());
            }
            ppz.b(ppr2);
        } finally {
            this.a.e();
            this.b.a(this.a);
            this.b.g.set((Object) null);
        }
    }

    public final String toString() {
        return this.a.d();
    }
}
