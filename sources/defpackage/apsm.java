package defpackage;

import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.VerifyCustomTokenResponse;

/* renamed from: apsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apsm implements apts {
    final /* synthetic */ aptg a;
    final /* synthetic */ apte b;

    public apsm(apte apte, aptg aptg) {
        this.b = apte;
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        VerifyCustomTokenResponse verifyCustomTokenResponse = (VerifyCustomTokenResponse) obj;
        this.b.a(new GetTokenResponse(verifyCustomTokenResponse.b, verifyCustomTokenResponse.a, Long.valueOf(verifyCustomTokenResponse.c), "Bearer"), (String) null, (String) null, Boolean.valueOf(verifyCustomTokenResponse.d), (DefaultOAuthCredential) null, this.a, this);
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
