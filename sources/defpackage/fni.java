package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: fni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fni implements aoqb {
    private final Account a;
    private final String b;
    private final Credential c;
    private final boolean d;
    private final String e;
    private final String f;
    private final fge g;

    public fni(fge fge, Account account, String str, Credential credential, boolean z, String str2, String str3) {
        this.g = fge;
        this.a = account;
        this.b = str;
        this.c = credential;
        this.d = z;
        this.e = str2;
        this.f = str3;
    }

    public final aorr a(Object obj) {
        fge fge = this.g;
        Account account = this.a;
        String str = this.b;
        Credential credential = this.c;
        boolean z = this.d;
        String str2 = this.e;
        String str3 = this.f;
        fkm a2 = fkm.a(fge.a);
        qbk qbk = qbk.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_GET_FULL_CREDENTIAL;
        aorr a3 = a2.a(fcg.a(account), str, credential, z, str2, str3);
        ((fde) obj).a(qbk, a3);
        return qay.a(a3);
    }
}
