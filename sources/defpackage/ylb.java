package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.util.Log;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;

/* renamed from: ylb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ylb extends yld {
    final /* synthetic */ AccountSignUpChimeraActivity a;

    public ylb(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        this.a = accountSignUpChimeraActivity;
    }

    public final boolean c() {
        return this.a.f == null;
    }

    public final void d() {
        try {
            AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.a;
            accountSignUpChimeraActivity.startIntentSenderForResult(accountSignUpChimeraActivity.f.getIntentSender(), 3, (Intent) null, 0, 0, 0);
            AccountSignUpChimeraActivity accountSignUpChimeraActivity2 = this.a;
            izr.a(accountSignUpChimeraActivity2, accountSignUpChimeraActivity2.a, ibb.b, ibb.d, this.a.g);
        } catch (IntentSender.SendIntentException e) {
            Log.e("AccountSignUpActivity", "Exception showing GMS Auth Activity.", e);
        }
    }
}
