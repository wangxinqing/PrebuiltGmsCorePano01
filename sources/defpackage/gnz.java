package defpackage;

import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.uiflows.gettoken.GetTokenChimeraActivity;

/* renamed from: gnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gnz extends gni {
    final /* synthetic */ GetTokenChimeraActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gnz(GetTokenChimeraActivity getTokenChimeraActivity, Context context, boolean z) {
        super(context, z);
        this.a = getTokenChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        TokenRequest tokenRequest = (TokenRequest) this.a.f().a(GetTokenChimeraActivity.c);
        TokenResponse a2 = new gck(this.a).a(tokenRequest);
        boolean e = jgu.e(this.a, tokenRequest.c);
        fzl fzl = new fzl();
        fzl.b(GetTokenChimeraActivity.a, a2);
        fzl.b(GetTokenChimeraActivity.b, Boolean.valueOf(e));
        return fzl.a;
    }
}
