package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: fde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fde {
    public final List a = new ArrayList();
    private final ScheduledExecutorService b;

    public fde(ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
    }

    public final aorr a(qbk qbk, aorr aorr, long j, TimeUnit timeUnit) {
        fdd fdd = new fdd(qbk, aorr);
        this.a.add(fdd);
        aorl.a(aorr, fdd, aoqm.a);
        return aorl.a(aorr, j, timeUnit, this.b);
    }

    public final void a(qbk qbk, aorr aorr) {
        fdd fdd = new fdd(qbk, aorr);
        this.a.add(fdd);
        aorl.a(aorr, fdd, aoqm.a);
    }
}
