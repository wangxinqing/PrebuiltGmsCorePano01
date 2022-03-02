package defpackage;

import android.text.TextUtils;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: aprq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aprq implements apts {
    final /* synthetic */ aptg a;
    final /* synthetic */ apte b;

    public aprq(apte apte, aptg aptg) {
        this.b = apte;
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apua apua = (apua) obj;
        if (TextUtils.isEmpty(apua.f)) {
            this.b.a(new GetTokenResponse(apua.b, apua.a, Long.valueOf(apua.d), "Bearer"), (String) null, (String) null, Boolean.valueOf(apua.c), (DefaultOAuthCredential) null, this.a, this);
        } else if (this.b.c.b()) {
            this.a.a(new OnFailedMfaSignInAidlResponse(apua.f, apua.e, (DefaultOAuthCredential) null));
        } else {
            apte.a.e("Need to do multi-factor auth, but either the SDK does not support it, or the flag is disabled.", new Object[0]);
            a("REQUIRES_SECOND_FACTOR_AUTH");
        }
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
