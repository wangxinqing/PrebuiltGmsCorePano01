package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fmj implements amqy {
    private final fmo a;
    private final fde b;

    public fmj(fmo fmo, fde fde) {
        this.a = fmo;
        this.b = fde;
    }

    public final Object a(Object obj) {
        fmo fmo = this.a;
        fde fde = this.b;
        pyv pyv = (pyv) obj;
        qbk qbk = qbk.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_SERVICE_ENABLED;
        aorr a2 = fmo.a.a(pyv);
        fde.a(qbk, a2);
        return aopr.a(a2, (amqy) new fmn(pyv), (Executor) aoqm.a);
    }
}
