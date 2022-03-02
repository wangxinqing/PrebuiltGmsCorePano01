package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fqa implements aoqb {
    private final fqe a;
    private final fde b;
    private final amzy c;

    public fqa(fqe fqe, fde fde, amzy amzy) {
        this.a = fqe;
        this.b = fde;
        this.c = amzy;
    }

    public final aorr a(Object obj) {
        fqe fqe = this.a;
        fde fde = this.b;
        amzy amzy = this.c;
        amzy amzy2 = (amzy) obj;
        if (!amzy2.isEmpty()) {
            return fqe.a(fde, anbs.a((Iterable) angm.a(anbs.a((Iterable) amzy2, fpr.a)), (amqy) new fps(fqe)));
        }
        if (!amrk.a(fqe.e.f)) {
            amri a2 = fqe.a(fqe.e);
            if (a2.a()) {
                fgj fgj = new fgj(fqe.e);
                fgj.a = ((pyv) a2.b()).a();
                return fqe.a(fde, amzy.a((Object) fgj.a()));
            }
        }
        if (!amrk.a(fqe.e.f) || ((fha) fha.a.a()).b(fqe.d)) {
            return aopr.a(qay.a(amzy.a(anbs.a((Iterable) amzy, (amqy) new fqb(fqe))), fqc.a), (amqy) new fqd(fqe, amzy), (Executor) aoqm.a);
        }
        throw qbf.a(28431);
    }
}
