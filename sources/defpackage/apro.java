package defpackage;

import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apro implements apts {
    final /* synthetic */ aptg a;
    final /* synthetic */ apte b;

    public apro(apte apte, aptg aptg) {
        this.b = apte;
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apvl apvl = (apvl) obj;
        if (!apvl.b()) {
            this.b.a(new GetTokenResponse(apvl.b, apvl.a, Long.valueOf(apvl.c), "Bearer"), (String) null, (String) null, false, (DefaultOAuthCredential) null, this.a, this);
        } else if (this.b.c.b()) {
            this.a.a(new OnFailedMfaSignInAidlResponse(apvl.e, apvl.d, (DefaultOAuthCredential) null));
        } else {
            apte.a.e("Need to do multi-factor auth, but SDK does not support it.", new Object[0]);
            a("REQUIRES_SECOND_FACTOR_AUTH");
        }
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
