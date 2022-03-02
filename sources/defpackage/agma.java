package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: agma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agma {
    public static final anhq a = anhq.a("agma");
    public final AtomicBoolean b = new AtomicBoolean(false);
    public ScheduledFuture c;
    public ScheduledFuture d;
    public final amsv e;
    public final agcz f;
    public final agcv g = new aglx(this);
    public final agcw h = new aglz(this);
    public final agmc i;

    public agma(agmc agmc, Application application, amsv amsv) {
        agcz a2 = agcz.a(application);
        this.i = agmc;
        this.e = amsv;
        this.f = a2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.b.getAndSet(true)) {
            ((anhn) ((anhn) a.c()).a("agma", "a", 112, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Memory Monitor has already started. This MemoryMetricMonitor.start() is ignored.");
            return;
        }
        this.f.a((agcy) this.g);
        this.f.a((agcy) this.h);
    }

    public final void b() {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.c = null;
        }
        ScheduledFuture scheduledFuture2 = this.d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.d = null;
        }
    }
}
