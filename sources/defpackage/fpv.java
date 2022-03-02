package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: fpv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fpv implements aoqb {
    private final fqe a;
    private final fde b;
    private final aorr c;

    public fpv(fqe fqe, fde fde, aorr aorr) {
        this.a = fqe;
        this.b = fde;
        this.c = aorr;
    }

    public final aorr a(Object obj) {
        fqe fqe = this.a;
        fde fde = this.b;
        aorr aorr = this.c;
        if (!((Boolean) obj).booleanValue()) {
            amzy amzy = (amzy) aorl.a((Future) aorr);
            return aopr.a(qay.a(amzy.a(anbs.a((Iterable) amzy, (amqy) new fpy(fqe, fde))), (amqy) new fpz(fcb.a(fqe.e))), (aoqb) new fqa(fqe, fde, amzy), (Executor) aoqm.a);
        }
        throw qbf.a(28435);
    }
}
