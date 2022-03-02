package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.login.LoginChimeraActivity;

/* renamed from: ggj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ggj extends ggx {
    final /* synthetic */ LoginChimeraActivity a;
    private final int b = 1002;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ggj(LoginChimeraActivity loginChimeraActivity, TokenRequest tokenRequest, String str, String str2, boolean z, boolean z2) {
        super(loginChimeraActivity, tokenRequest, str, str2, false, z, z2);
        this.a = loginChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        Bundle bundle = (Bundle) obj;
        this.a.p = null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bundle bundle = (Bundle) obj;
        super.onPostExecute(bundle);
        TokenResponse tokenResponse = (TokenResponse) bundle.getParcelable("token_response");
        tokenResponse.b();
        Intent intent = new Intent();
        intent.putExtra("token_response", tokenResponse);
        this.a.onActivityResult(this.b, -1, intent);
        this.a.p = null;
    }
}
