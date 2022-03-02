package defpackage;

import android.text.TextUtils;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apsj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apsj implements apts {
    final /* synthetic */ apsk a;

    public apsj(apsk apsk) {
        this.a = apsk;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apvp apvp = (apvp) obj;
        if (TextUtils.isEmpty(apvp.a) || TextUtils.isEmpty(apvp.b)) {
            this.a.b.a(apvs.a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        this.a.c.a(new GetTokenResponse(apvp.b, apvp.a, Long.valueOf(apuo.a(apvp.a)), "Bearer"), (String) null, (String) null, false, (DefaultOAuthCredential) null, this.a.b, this);
    }

    public final void a(String str) {
        this.a.b.a(apvs.a(str));
    }
}
