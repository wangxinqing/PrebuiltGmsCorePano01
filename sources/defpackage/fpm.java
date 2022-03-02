package defpackage;

/* renamed from: fpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fpm implements aoqb {
    private final fqe a;
    private final fde b;

    public fpm(fqe fqe, fde fde) {
        this.a = fqe;
        this.b = fde;
    }

    public final aorr a(Object obj) {
        fqe fqe = this.a;
        fde fde = this.b;
        amzy amzy = (amzy) obj;
        if (!amzy.isEmpty()) {
            return qay.a(amzy.a(anbs.a((Iterable) amzy, (amqy) new fpw(fqe, fde))), fpx.a);
        }
        throw qbf.a(28434);
    }
}
