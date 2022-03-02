package defpackage;

import android.accounts.Account;
import com.google.android.gms.R;

/* renamed from: xtx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xtx implements ax {
    private final xue a;

    public xtx(xue xue) {
        this.a = xue;
    }

    public final void a(Object obj) {
        xue xue = this.a;
        agbl agbl = (agbl) obj;
        xue.a = xus.a(agbl.b());
        Account account = xue.a;
        if (account != null) {
            xue.b.b(account.name);
            xue.c.a((Object) agbl);
            xue.c.setContentDescription(xue.getString(R.string.common_account_spinner_a11y_description, xue.a.name));
        }
    }
}
