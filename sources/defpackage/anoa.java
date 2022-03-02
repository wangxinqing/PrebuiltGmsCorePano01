package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* renamed from: anoa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anoa extends aopn {
    public static final ansv a = new ansv(Logger.getLogger(anoa.class.getCanonicalName()));
    public static final Object b = new Object();
    static final annq i = new annq();
    public final amsv c;
    public final annp d;
    public final amrm e;
    public final amsn f;
    public final aorv g;
    public volatile int h = 0;
    private final Executor l;
    private final AtomicReference m = new AtomicReference(aorl.a(new Object()));

    public anoa(amsv amsv, annp annp, amrm amrm, Executor executor, ScheduledExecutorService scheduledExecutorService, amtd amtd) {
        amrl.a((Object) amsv);
        this.c = amsv;
        amrl.a((Object) annp);
        this.d = annp;
        amrl.a((Object) amrm);
        this.e = amrm;
        amrl.a((Object) executor);
        this.l = new anns(this, executor);
        this.g = aosd.a(scheduledExecutorService);
        this.f = amsn.b(amtd);
        a(0, TimeUnit.MILLISECONDS);
        a((Runnable) new annr(), this.l);
    }

    public final void a(long j, TimeUnit timeUnit) {
        aosh f2 = aosh.f();
        aorr aorr = (aorr) this.m.getAndSet(f2);
        if (j != 0) {
            aorr = aopr.a(aorr, (aoqb) new annu(this, j, timeUnit), (Executor) aoqm.a);
        }
        aorr a2 = aopr.a(aorr, (aoqb) new annv(this), this.l);
        f2.b(aooz.a(a2, Exception.class, (aoqb) new annw(this, a2), this.l));
        f2.a((Runnable) new annx(this, f2), (Executor) aoqm.a);
    }

    /* access modifiers changed from: protected */
    public final String aK() {
        String str;
        aorr aorr = (aorr) this.m.get();
        String obj = aorr.toString();
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.d);
        int i2 = this.h;
        if (!aorr.isDone()) {
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 14);
            sb.append(", activeTry=[");
            sb.append(obj);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "";
        }
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb2 = new StringBuilder(length + 70 + length2 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
        sb2.append("futureSupplier=[");
        sb2.append(valueOf);
        sb2.append("], shouldContinue=[");
        sb2.append(valueOf2);
        sb2.append("], strategy=[");
        sb2.append(valueOf3);
        sb2.append("], tries=[");
        sb2.append(i2);
        sb2.append("]");
        sb2.append(str);
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final void b() {
        aorr aorr = (aorr) this.m.getAndSet(aorl.a());
        if (aorr != null) {
            boolean z = true;
            if (isCancelled() && !d()) {
                z = false;
            }
            aorr.cancel(z);
        }
    }
}
