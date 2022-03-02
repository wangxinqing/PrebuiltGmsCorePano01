package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;

/* renamed from: ylg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ylg implements Runnable {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ ylh b;

    public ylg(ylh ylh, ConnectionResult connectionResult) {
        this.b = ylh;
        this.a = connectionResult;
    }

    public final void run() {
        ykv ykv = this.b.b;
        ConnectionResult connectionResult = this.a;
        ykv.b.e = null;
        if (connectionResult.b()) {
            ykv.b.a();
        } else if (!connectionResult.a()) {
            int i = connectionResult.c;
            if (i == 5) {
                AccountSignUpChimeraActivity accountSignUpChimeraActivity = ykv.b;
                accountSignUpChimeraActivity.a(accountSignUpChimeraActivity.getString(R.string.plus_invalid_account));
            } else if (i == 7) {
                AccountSignUpChimeraActivity accountSignUpChimeraActivity2 = ykv.b;
                accountSignUpChimeraActivity2.a(accountSignUpChimeraActivity2.getString(R.string.plus_network_unreliable));
            } else {
                AccountSignUpChimeraActivity accountSignUpChimeraActivity3 = ykv.b;
                accountSignUpChimeraActivity3.a(accountSignUpChimeraActivity3.getString(R.string.plus_internal_error));
            }
        } else {
            AccountSignUpChimeraActivity accountSignUpChimeraActivity4 = ykv.b;
            accountSignUpChimeraActivity4.f = connectionResult.d;
            accountSignUpChimeraActivity4.a();
        }
    }
}
