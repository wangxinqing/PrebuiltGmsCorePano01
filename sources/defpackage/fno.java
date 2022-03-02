package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;

/* renamed from: fno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fno implements aoqb {
    private final Account a;
    private final String b;
    private final boolean c;
    private final fge d;

    public fno(fge fge, Account account, String str, boolean z) {
        this.d = fge;
        this.a = account;
        this.b = str;
        this.c = z;
    }

    public final aorr a(Object obj) {
        aorr aorr;
        fge fge = this.d;
        Account account = this.a;
        String str = this.b;
        boolean z = this.c;
        fde fde = (fde) obj;
        fjh a2 = fjh.a(fge.a);
        qbk qbk = qbk.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_NEVER_SAVE_APP;
        pyv a3 = fcg.a(account);
        if (!z) {
            aorr = aopr.a(a2.a.b(a3, fkn.a(str)), (amqy) new fjc(), (Executor) aoqm.a);
        } else {
            aorr = aopr.a(a2.a.a(a3, fkn.a(str)), (amqy) new fjb(), (Executor) aoqm.a);
        }
        fde.a(qbk, aorr);
        return aorr;
    }
}
