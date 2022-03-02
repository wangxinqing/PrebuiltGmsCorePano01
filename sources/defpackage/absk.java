package defpackage;

import java.util.concurrent.Executor;

/* renamed from: absk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class absk implements Runnable {
    final /* synthetic */ absq a;

    public absk(absq absq) {
        this.a = absq;
    }

    public final void run() {
        absq absq = this.a;
        absq.j.c(acpd.a(absq.i).a("com.google").length);
        acwa acwa = absq.v;
        if (acwa != null) {
            jls jls = new jls(absq.f);
            acwa.a((Executor) jls, (acvs) new absg(absq));
            acwa.a((Executor) jls, (acvv) new absh(absq));
        }
        acwa acwa2 = absq.w;
        if (acwa2 != null) {
            acwa2.a((Executor) new jls(absq.f), (acvv) new absi(absq));
        }
        if (acpf.a(absq.p)) {
            absq.h.a("Starting account transfer (3p mfm)", new Object[0]);
            absq.u = absq.m.a(absq.i, absq.j, absq.x, absq.q.booleanValue(), absq.p.i);
            absq.u.a();
            return;
        }
        absq.h.a("Starting account transfer", new Object[0]);
        absq.t = absq.m.a(absq.i, absq.j, absq.x, absq.r, absq.q.booleanValue(), absq.l.h);
        absq.t.a();
    }
}
