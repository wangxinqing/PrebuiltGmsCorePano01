package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: fcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fcy {
    public static final qcc a = qcb.a(fcx.a);
    public final hol b = new hol(ihs.b(), "IDENTITY_GMSCORE", (String) null);
    private final ScheduledExecutorService c = jfm.a(1, 9);

    public final aorr a(fcu fcu, String str) {
        try {
            fde fde = new fde(this.c);
            qbk a2 = fcu.a();
            aorr a3 = fcu.a(fde);
            fde.a(a2, a3);
            Iterable a4 = anbs.a((Iterable) amzy.a((Collection) fde.a), fcv.a);
            aorl.b(a4).a((Callable) new fcw(this, a4, str), (Executor) aoqm.a);
            return a3;
        } catch (qbf e) {
            return aorl.a((Throwable) e);
        }
    }
}
