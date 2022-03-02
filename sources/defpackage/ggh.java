package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.login.LoginActivityChimeraTask;

/* renamed from: ggh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ggh extends ggx {
    final /* synthetic */ LoginActivityChimeraTask a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ggh(LoginActivityChimeraTask loginActivityChimeraTask, Context context, TokenRequest tokenRequest, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(context, tokenRequest, str, str2, z, z2, z3);
        this.a = loginActivityChimeraTask;
    }

    /* access modifiers changed from: protected */
    public final Bundle a(Object... objArr) {
        Bundle a2 = super.doInBackground(objArr);
        if (fyo.a.c == ((TokenResponse) a2.getParcelable("token_response")).b()) {
            LoginActivityChimeraTask loginActivityChimeraTask = this.a;
            int i = LoginActivityChimeraTask.n;
            if (loginActivityChimeraTask.m) {
                Log.i("GLSActivity", "Fetching market offers");
                a2.putAll(new ghe(this.a).a(this.a.a.c));
            }
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return doInBackground(objArr);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bundle bundle = (Bundle) obj;
        super.onPostExecute(bundle);
        TokenResponse tokenResponse = (TokenResponse) bundle.getParcelable("token_response");
        Intent intent = new Intent();
        if (tokenResponse == null) {
            Log.w("GLSActivity", String.valueOf(this.a.b).concat(" #onPostExecute(Intent) - No TokenResponse!"));
        } else if (tokenResponse.b() == null) {
            Log.w("GLSActivity", String.valueOf(this.a.b).concat(" #onPostExecute(Intent) - status is null!"));
        } else {
            intent.putExtra("token_response", tokenResponse);
        }
        ghe.a(bundle, intent);
        this.a.setResult(-1, intent);
        this.a.finish();
    }
}
