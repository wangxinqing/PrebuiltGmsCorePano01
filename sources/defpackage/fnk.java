package defpackage;

import android.accounts.Account;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: fnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fnk implements aoqb {
    private final Account a;
    private final fge b;

    public fnk(fge fge, Account account) {
        this.b = fge;
        this.a = account;
    }

    public final aorr a(Object obj) {
        fge fge = this.b;
        Account account = this.a;
        fjh a2 = fjh.a(fge.a);
        qbk qbk = qbk.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_GET_ALL_SETTINGS;
        pyv a3 = fcg.a(account);
        aorr a4 = aopr.a(qbc.a(((hip) hip.a.b()).b.a(a3.a()).a((ihb) new hia())), fiz.a, (Executor) aoqm.a);
        aorr a5 = a2.a.a(a3, (Set) fko.a);
        aorr a6 = aopr.a(a2.a.b(a3), fjd.a, (Executor) aoqm.a);
        aorr a7 = aorl.c(a4, a5, a6).a((Callable) new fje(a5, a6, a4), (Executor) aoqm.a);
        ((fde) obj).a(qbk, a7);
        return qay.a(a7);
    }
}
