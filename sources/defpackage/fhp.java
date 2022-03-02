package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: fhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fhp implements aoqb {
    private final fib a;
    private final fde b;

    public fhp(fib fib, fde fde) {
        this.a = fib;
        this.b = fde;
    }

    public final aorr a(Object obj) {
        fib fib = this.a;
        fde fde = this.b;
        fia fia = (fia) obj;
        fib.a.b("Cache miss! Fetching credentials...", new Object[0]);
        aorr a2 = new fmq(fib.b, fib.c).a(fde);
        aorr a3 = aopr.a(a2, (aoqb) new fhr(fib, fde), (Executor) aoqm.a);
        aorr a4 = aopr.a(a2, (aoqb) new fhv(fib, fde), (Executor) aoqm.a);
        return aopr.a(aopr.a(aorl.c(a3, a4).a((Callable) new fhs(a3, a4), (Executor) aoqm.a), (amqy) new fht(fib), (Executor) aoqm.a), fhu.a, (Executor) aoqm.a);
    }
}
