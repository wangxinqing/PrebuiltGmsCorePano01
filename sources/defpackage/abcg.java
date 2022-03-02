package defpackage;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: abcg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abcg implements amqy {
    private final SignInChimeraActivity a;

    public abcg(SignInChimeraActivity signInChimeraActivity) {
        this.a = signInChimeraActivity;
    }

    public final Object a(Object obj) {
        Intent intent;
        SignInChimeraActivity signInChimeraActivity = this.a;
        qal qal = (qal) obj;
        if (!signInChimeraActivity.getIntent().getBooleanExtra("complete_sign_in_process", false) || qal.a != -1 || (intent = qal.b) == null) {
            signInChimeraActivity.a(qal.a, signInChimeraActivity.e ? qal.b : null);
            return ampu.a;
        }
        String stringExtra = intent.getStringExtra("authAccount");
        amrl.a((Object) stringExtra);
        String stringExtra2 = qal.b.getStringExtra("accountType");
        amrl.a((Object) stringExtra2);
        signInChimeraActivity.f = new Account(stringExtra, stringExtra2);
        return amri.b(3);
    }
}
