package defpackage;

import android.content.Context;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: elx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class elx extends emb {
    public elx(Context context) {
        super(context);
        a("service", "ac2dm");
        a("add_account", true);
        a("get_accountid", true);
    }

    public final void a(AccountCredentials accountCredentials) {
        super.b(accountCredentials);
    }

    public final void b(String str) {
        super.g(str);
    }

    public final void c(String str) {
        super.f(str);
    }

    public final void a(CaptchaSolution captchaSolution) {
        super.b(captchaSolution);
    }

    public final void a(String str) {
        super.e(str);
    }
}
