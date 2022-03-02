package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;

/* renamed from: fnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fnl implements aoqb {
    private final Account a;
    private final boolean b;
    private final fge c;

    public fnl(fge fge, Account account, boolean z) {
        this.c = fge;
        this.a = account;
        this.b = z;
    }

    public final aorr a(Object obj) {
        fge fge = this.c;
        Account account = this.a;
        boolean z = this.b;
        fjh a2 = fjh.a(fge.a);
        qbk qbk = qbk.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_SERVICE_ENABLED;
        pyv a3 = fcg.a(account);
        aorr a4 = aopr.a(a2.a.a(a3, fko.a("credentials_enable_service", z)), (aoqb) new fiu(a2, a3, z), (Executor) aoqm.a);
        ((fde) obj).a(qbk, a4);
        return a4;
    }
}
