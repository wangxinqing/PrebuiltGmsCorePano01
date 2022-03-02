package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: nkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nkc {
    final qvs a;
    final Object b = new Object();
    volatile amko c;
    Future d;
    private final ScheduledExecutorService e;

    public nkc(qvs qvs) {
        this.a = qvs;
        this.e = jfm.a(1, 10);
    }

    public final amky a() {
        amko amko = this.c;
        if (amko == null) {
            synchronized (this.b) {
                amko amko2 = this.c;
                if (amko2 == null) {
                    amky b2 = this.a.b("session");
                    amko a2 = amlv.a(amlw.a);
                    this.c = a2;
                    this.d = ((jfv) this.e).schedule((Runnable) new nkb(this, a2), axda.a.a().G(), TimeUnit.SECONDS);
                    return b2;
                }
                amlv.a(amko2, amlw.a);
                return amko2;
            }
        }
        amlv.a(amko, amlw.a);
        return amko;
    }
}
