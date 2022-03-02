package defpackage;

/* renamed from: fic  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fic implements aoqb {
    private final fik a;
    private final fde b;

    public fic(fik fik, fde fde) {
        this.a = fik;
        this.b = fde;
    }

    public final aorr a(Object obj) {
        fik fik = this.a;
        fde fde = this.b;
        amzy amzy = (amzy) obj;
        if (!amzy.isEmpty()) {
            return qay.a(anbs.a((Iterable) amzy, (amqy) new fid(fik, fde)), (amqy) new fie(amzy));
        }
        throw qbf.a(28434);
    }
}
