package defpackage;

import android.accounts.Account;
import android.view.View;

/* renamed from: acmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class acmy implements View.OnClickListener {
    private final acnj a;

    public acmy(acnj acnj) {
        this.a = acnj;
    }

    public void onClick(View view) {
        acnj acnj = this.a;
        acnj.d.b(true);
        acnj.k = true;
        acnj.b.a(acnj.a((Account) acnj.e.get(0)));
    }
}
