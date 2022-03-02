package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: nsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsa {
    public final hph a;
    private final hol b;
    private final qwq c;
    private nqv d;

    public nsa(hol hol, hph hph, qwq qwq) {
        this.b = hol;
        this.a = hph;
        this.c = qwq;
        hol.a(avsd.a(2));
        hph.a((ScheduledExecutorService) jfm.a(1, 10), aoog.a(TimeUnit.HOURS.toMillis(1)));
        hph.a();
        if (axlc.d() > 0) {
            qxi qxi = new qxi();
            qxi.k = "LogPhenotypeExperimentIds";
            qxi.i = "com.google.android.gms.gcm.HeartbeatAlarm$ConnectionInfoPersistService";
            qxi.a = axlc.d();
            qxi.b = TimeUnit.HOURS.toSeconds(1);
            qxi.n = true;
            qxi.b(false);
            this.c.a((qxx) qxi.b());
        }
    }

    public final nqv a() {
        hol hol;
        if (this.d == null) {
            ScheduledExecutorService c2 = qvj.b.c(1);
            if (!axlc.a.a().at()) {
                hol = new hol(ihs.b(), "STREAMZ_GCM", (String) null);
            } else {
                hol = hol.a((Context) ihs.b(), "STREAMZ_GCM");
            }
            this.d = new nqv(c2, new ahgr(hol, "STREAMZ_GCM"), "gmscore_gcm");
        }
        return this.d;
    }

    public final void a(nyb nyb) {
        this.b.a(nyb.k()).b();
    }
}
