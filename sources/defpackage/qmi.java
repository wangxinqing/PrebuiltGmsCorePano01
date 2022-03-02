package defpackage;

import android.accounts.Account;
import android.view.View;
import java.util.ArrayList;

/* renamed from: qmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qmi implements View.OnClickListener {
    final /* synthetic */ qmp a;

    public qmi(qmp qmp) {
        this.a = qmp;
    }

    public void onClick(View view) {
        Account account;
        this.a.f.a("OptInFragment.accountPickerClicked");
        qmp qmp = this.a;
        ArrayList arrayList = qmp.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                account = null;
                break;
            }
            account = (Account) arrayList.get(i);
            i++;
            if (account.name.equals(qmp.a)) {
                break;
            }
        }
        this.a.startActivityForResult(qub.a(account, this.a.b, new String[]{"com.google"}), 0);
    }
}
