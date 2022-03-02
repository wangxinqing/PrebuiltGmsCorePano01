package defpackage;

import android.accounts.Account;

/* renamed from: fnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fnm implements aoqb {
    private final Account a;
    private final boolean b;
    private final fge c;

    public fnm(fge fge, Account account, boolean z) {
        this.c = fge;
        this.a = account;
        this.b = z;
    }

    public final aorr a(Object obj) {
        fge fge = this.c;
        Account account = this.a;
        boolean z = this.b;
        fjh a2 = fjh.a(fge.a);
        qbk qbk = qbk.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_AUTO_SIGNIN_ENABLED;
        aorr a3 = qay.a(a2.a.a(fcg.a(account), fko.a("credentials_enable_autosignin", z)), (Object) Boolean.valueOf(z));
        ((fde) obj).a(qbk, a3);
        return a3;
    }
}
