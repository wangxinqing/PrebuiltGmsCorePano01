package defpackage;

import android.accounts.Account;
import com.google.android.gms.R;

/* renamed from: xsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xsm implements ax {
    private final xst a;

    public xsm(xst xst) {
        this.a = xst;
    }

    public final void a(Object obj) {
        xst xst = this.a;
        agbl agbl = (agbl) obj;
        xst.a = xus.a(agbl.b());
        Account account = xst.a;
        if (account != null) {
            xst.b.b(account.name);
            xst.c.a((Object) agbl);
            xst.c.setContentDescription(xst.getString(R.string.common_account_spinner_a11y_description, xst.a.name));
            xst.a(true);
            xst.getView().findViewById(R.id.content).setVisibility(0);
        }
    }
}
