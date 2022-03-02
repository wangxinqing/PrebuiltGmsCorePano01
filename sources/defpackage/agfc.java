package defpackage;

import android.app.Activity;
import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: agfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agfc implements agcv, agkv {
    public static final anhq a = anhq.a("agfc");
    public final agks b;
    public final Application c;
    public final bapu d;
    public final Object e = new Object();
    public final int f;
    public final agew g;
    public final List h;
    public final agnf i = agnf.a();
    public final AtomicInteger j = new AtomicInteger();

    public agfc(agkt agkt, Application application, bapu bapu, amri amri, agew agew) {
        this.b = agkt.a((Executor) aoqm.a, this.i);
        this.c = application;
        this.d = bapu;
        int b2 = ((aghj) amri.b()).b();
        this.f = b2;
        this.h = new ArrayList(b2);
        this.g = agew;
        agcz.a(application).a((agcy) this);
    }

    public final void a() {
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        agev[] agevArr;
        if (this.j.get() > 0) {
            ((aorv) this.d.a()).a((Runnable) new agfa(this), 1, TimeUnit.SECONDS);
            anhq anhq = aggw.a;
            return;
        }
        synchronized (this.e) {
            if (!this.h.isEmpty()) {
                List list = this.h;
                agevArr = (agev[]) list.toArray(new agev[list.size()]);
                this.h.clear();
            } else {
                agevArr = null;
            }
        }
        if (agevArr != null) {
            ((aorv) this.d.a()).a(new agfb(this, agevArr));
            anhq anhq2 = aggw.a;
        }
    }

    public final void c() {
        agcz.a(this.c).b(this);
        synchronized (this.e) {
            this.h.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(agev agev) {
        if (this.i.b()) {
            return;
        }
        if (agev.c > 0 || agev.d > 0 || agev.e > 0 || agev.q > 0) {
            this.j.incrementAndGet();
            ((aorv) this.d.a()).a(new agez(this, agev));
            return;
        }
        int i2 = agev.v;
        ((anhn) ((anhn) a.c()).a("agfc", "a", 67, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("skip logging NetworkEvent due to empty bandwidth/latency data");
    }

    public final void b(Activity activity) {
        b();
    }
}
