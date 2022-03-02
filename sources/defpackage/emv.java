package defpackage;

import android.content.Context;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* renamed from: emv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class emv extends emb {
    public emv(Context context) {
        super(context);
        a("service", "ac2dm");
        a("has_permission", true);
    }

    public final void a(AccountCredentials accountCredentials) {
        super.b(accountCredentials);
    }

    public final void a(CaptchaSolution captchaSolution) {
        super.b(captchaSolution);
    }
}
