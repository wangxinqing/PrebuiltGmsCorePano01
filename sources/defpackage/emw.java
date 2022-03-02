package defpackage;

import android.content.Context;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;

/* renamed from: emw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class emw extends emb {
    public emw(Context context) {
        super(context);
        a("service", "ac2dm");
        a("has_permission", true);
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

    public final void a(String str) {
        super.e(str);
    }
}
