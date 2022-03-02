package defpackage;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.ui.SignInChimeraActivity;
import com.google.android.gms.common.api.Status;

/* renamed from: fxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fxh implements aora {
    final /* synthetic */ SignInChimeraActivity a;

    public fxh(SignInChimeraActivity signInChimeraActivity) {
        this.a = signInChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        SignInChimeraActivity signInChimeraActivity = this.a;
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) ((amri) obj).c();
        signInChimeraActivity.d = new Intent();
        if (googleSignInAccount != null) {
            iva.a((Object) googleSignInAccount);
            signInChimeraActivity.d.putExtra("signInAccount", new SignInAccount("<<default account>>", googleSignInAccount, "<<default user id>>"));
        }
        signInChimeraActivity.a(-1, signInChimeraActivity.d);
        signInChimeraActivity.a(0);
    }

    public final void a(Throwable th) {
        SignInChimeraActivity signInChimeraActivity = this.a;
        Status b = fxi.b(fxi.a(th));
        signInChimeraActivity.d = new Intent();
        signInChimeraActivity.d.putExtra("errorCode", b.i);
        signInChimeraActivity.a(0, signInChimeraActivity.d);
        signInChimeraActivity.a(b.i);
    }
}
