package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: evb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class evb extends iby {
    private static final ibq a = new ibq("Auth.CREDENTIALS_INTERNAL_API", l, b);
    private static final ibg b = new ibg();
    private static final ibn l = new eup();

    public evb(Context context, ffx ffx) {
        super(context, a, (ibm) ffx, ibx.a);
    }

    public final acwa a(Account account, String str, boolean z) {
        return b((ihb) new euo(account, str, z));
    }

    public final void a() {
        b((ihb) new euw());
    }

    public final void a(String str) {
        b((ihb) new eun(str));
    }
}
