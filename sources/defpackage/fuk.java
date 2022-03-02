package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;

/* renamed from: fuk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fuk implements igp {
    private final SaveAccountLinkingTokenRequest a;
    private final String b;
    private final Account c;
    private final String d;

    public fuk(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, Account account, String str2) {
        this.a = saveAccountLinkingTokenRequest;
        this.b = str;
        this.c = account;
        this.d = str2;
    }

    public final void a(Object obj, Object obj2) {
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = this.a;
        String str = this.b;
        Account account = this.c;
        String str2 = this.d;
        ((fto) ((ftz) obj).x()).a(new ful((acwd) obj2), saveAccountLinkingTokenRequest, str, account, str2);
    }
}
