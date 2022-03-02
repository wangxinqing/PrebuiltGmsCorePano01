package defpackage;

import android.view.View;
import com.google.android.gms.auth.account.visibility.RequestAccountsAccessChimeraActivity;

/* renamed from: esg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class esg implements View.OnClickListener {
    private final RequestAccountsAccessChimeraActivity a;

    public esg(RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity) {
        this.a = requestAccountsAccessChimeraActivity;
    }

    public void onClick(View view) {
        RequestAccountsAccessChimeraActivity requestAccountsAccessChimeraActivity = this.a;
        requestAccountsAccessChimeraActivity.setResult(0);
        requestAccountsAccessChimeraActivity.finish();
    }
}
