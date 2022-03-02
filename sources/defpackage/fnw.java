package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: fnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fnw implements aoqb {
    private final fof a;
    private final fde b;

    public fnw(fof fof, fde fde) {
        this.a = fof;
        this.b = fde;
    }

    public final aorr a(Object obj) {
        fof fof = this.a;
        fde fde = this.b;
        amzt j = amzy.j();
        anhk i = ((amzy) obj).listIterator();
        while (i.hasNext()) {
            pyv pyv = (pyv) i.next();
            anhk i2 = fof.b.listIterator();
            while (i2.hasNext()) {
                j.c(aooz.a(fde.a(qbk.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_HINTS_LIST_HINTS, ((fit) i2.next()).a(pyv, fof.c), ((Long) fdf.c.c()).longValue(), TimeUnit.MILLISECONDS), Exception.class, fob.a, (Executor) aoqm.a));
            }
        }
        return qay.a(j.a(), (amqy) new foc(fof));
    }
}
