package defpackage;

/* renamed from: fou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fou implements aoqb {
    private final foy a;
    private final fde b;
    private final pyv c;

    public fou(foy foy, fde fde, pyv pyv) {
        this.a = foy;
        this.b = fde;
        this.c = pyv;
    }

    public final aorr a(Object obj) {
        foy foy = this.a;
        fde fde = this.b;
        pyv pyv = this.c;
        if (!((Boolean) obj).booleanValue()) {
            return aorl.a((Object) amzy.h());
        }
        qbk qbk = qbk.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_LIST_CREDENTIALS;
        aorr a2 = foy.a.a(pyv, foy.b);
        fde.a(qbk, a2);
        return a2;
    }
}
