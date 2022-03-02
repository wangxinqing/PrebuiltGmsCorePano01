package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* renamed from: acmz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class acmz implements AdapterView.OnItemClickListener {
    private final acnj a;

    public acmz(acnj acnj) {
        this.a = acnj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ss ssVar;
        acnj acnj = this.a;
        Account account = (Account) acnj.e.get(i);
        if (azjh.b() && acnj.j == abov.AUTO && acnj.f.contains(account)) {
            acnj.l = true;
            String string = acnj.getResources().getString(R.string.smartdevice_auto_selectaccount_unsupported_account, new Object[]{account.name});
            Activity activity = acnj.getActivity();
            if (activity == null) {
                acnj.a.d("Activity was unexpectedly null", new Object[0]);
                ssVar = null;
            } else {
                sr a2 = aceg.a((Context) activity);
                a2.a(true);
                a2.a((CharSequence) string);
                a2.b((int) R.string.common_ok, acnd.a);
                ssVar = a2.b();
            }
            if (ssVar != null) {
                ssVar.show();
                return;
            }
        }
        if (acnj.c) {
            acnj.d.b(true);
        }
        acnj.k = true;
        acnj.b.a(acnj.a(account));
    }
}
