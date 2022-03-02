package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.auth.account.visibility.RequestAccountsAccessChimeraActivity;
import com.google.android.gms.auth.account.visibility.WhitelistApplicationForGoogleAccountsIntentOperation;

/* renamed from: esh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class esh implements View.OnClickListener {
    private final RequestAccountsAccessChimeraActivity a;

    public esh(RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity) {
        this.a = requestAccountsAccessChimeraActivity;
    }

    public void onClick(View view) {
        RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity = this.a;
        requestAccountsAccessChimeraActivity.setResult(-1);
        Intent a2 = WhitelistApplicationForGoogleAccountsIntentOperation.a(requestAccountsAccessChimeraActivity, requestAccountsAccessChimeraActivity.b);
        if (a2 != null) {
            requestAccountsAccessChimeraActivity.startService(a2);
        } else {
            RequestAccountsAccessChimeraActivity.a.d("IntentOperation null", new Object[0]);
        }
        requestAccountsAccessChimeraActivity.finish();
    }
}
