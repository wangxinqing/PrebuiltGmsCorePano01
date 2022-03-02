package defpackage;

import android.accounts.Account;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: ogj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ogj implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ HelpChimeraActivity a;
    final /* synthetic */ Spinner b;

    public ogj(HelpChimeraActivity helpChimeraActivity, Spinner spinner) {
        this.a = helpChimeraActivity;
        this.b = spinner;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        HelpChimeraActivity helpChimeraActivity = this.a;
        String str = (String) this.b.getItemAtPosition(i);
        if (helpChimeraActivity.a(str)) {
            for (Account account : nzs.a(helpChimeraActivity)) {
                if (str.equals(account.name)) {
                    okg.a((nzu) helpChimeraActivity, account);
                }
            }
            helpChimeraActivity.e();
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
