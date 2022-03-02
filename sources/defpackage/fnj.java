package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: fnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fnj implements aoqb {
    private final Account a;
    private final String b;
    private final Credential c;
    private final fge d;

    public fnj(fge fge, Account account, String str, Credential credential) {
        this.d = fge;
        this.a = account;
        this.b = str;
        this.c = credential;
    }

    public final aorr a(Object obj) {
        fge fge = this.d;
        Account account = this.a;
        String str = this.b;
        Credential credential = this.c;
        fkm a2 = fkm.a(fge.a);
        qbk qbk = qbk.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_SAVE;
        aorr a3 = a2.a(fcg.a(account), str, credential);
        ((fde) obj).a(qbk, a3);
        return qay.a(a3);
    }
}
