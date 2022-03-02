package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fid implements amqy {
    private final fik a;
    private final fde b;

    public fid(fik fik, fde fde) {
        this.a = fik;
        this.b = fde;
    }

    public final Object a(Object obj) {
        fik fik = this.a;
        fde fde = this.b;
        pyv pyv = (pyv) obj;
        qbk qbk = qbk.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_LIST_CREDENTIALS;
        aorr a2 = fik.b.a(pyv, fik.a);
        fde.a(qbk, a2);
        return aopr.a(a2, (amqy) new fif(fik, pyv), (Executor) aoqm.a);
    }
}
