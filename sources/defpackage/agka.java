package defpackage;

import android.app.Activity;
import android.app.Application;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: agka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agka extends agjx implements agho, agcw, agcv, agkv {
    private static final anhq f = anhq.a("agka");
    public final bapu a;
    final AtomicBoolean b = new AtomicBoolean();
    public final agkn c;
    public final agjv d;
    public final agks e;
    private final Application g;
    private final AtomicBoolean h = new AtomicBoolean();
    private final agnf i = agnf.a();

    public agka(agkt agkt, Application application, bapu bapu, agkn agkn, agjv agjv) {
        new ConcurrentHashMap();
        this.e = agkt.a((Executor) aoqm.a, this.i);
        this.g = application;
        this.a = bapu;
        this.c = agkn;
        this.d = agjv;
    }

    private final aorr a(baql baql) {
        agks agks = this.e;
        agjy agjy = new agjy(this, baql);
        if (agks.b.b) {
            return aorl.a();
        }
        try {
            return agjy.a();
        } catch (Exception e2) {
            return aorl.a((Throwable) e2);
        }
    }

    public final void a() {
    }

    public final void b() {
        a((Activity) null);
        if (!this.h.getAndSet(true)) {
            agcz.a(this.g).a((agcy) this);
        }
    }

    public final void c() {
        if (this.h.getAndSet(false)) {
            agcz.a(this.g).b(this);
        }
        synchronized (this.c) {
            this.c.a.b.edit().remove("primes.battery.snapshot").commit();
        }
    }

    /* access modifiers changed from: package-private */
    public final aorr d() {
        if (!this.b.getAndSet(true)) {
            return a(baql.BACKGROUND_TO_FOREGROUND);
        }
        ((anhn) ((anhn) f.c()).a("agka", "d", 107, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("App is already in the foreground.");
        return aorl.a();
    }

    public final void b(Activity activity) {
        aorr aorr;
        try {
            amrl.b(this.b.getAndSet(false));
            aorr = a(baql.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e2) {
            aorr = aorl.a((Throwable) e2);
        }
        aggw.a(aorr);
    }

    public final void a(Activity activity) {
        aorr aorr;
        if (!this.b.get()) {
            if (this.b.getAndSet(true)) {
                ((anhn) ((anhn) f.c()).a("agka", "d", 107, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("App is already in the foreground.");
                aorr = aorl.a();
            } else {
                aorr = a(baql.BACKGROUND_TO_FOREGROUND);
            }
            aggw.a(aorr);
        }
    }
}
