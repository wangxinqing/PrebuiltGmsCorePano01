package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fmd implements amqy {
    private final fmi a;
    private final fde b;
    private final String c;

    public fmd(fmi fmi, fde fde, String str) {
        this.a = fmi;
        this.b = fde;
        this.c = str;
    }

    public final Object a(Object obj) {
        fmi fmi = this.a;
        fde fde = this.b;
        String str = this.c;
        pyv pyv = (pyv) obj;
        qbk qbk = qbk.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_NEVER_SAVE_APP;
        aorr a2 = fmi.b.a(pyv, str);
        fde.a(qbk, a2);
        return aopr.a(a2, (amqy) new fmh(pyv), (Executor) aoqm.a);
    }
}
