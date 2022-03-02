package defpackage;

import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apsa implements apts {
    final /* synthetic */ aptg a;
    final /* synthetic */ apte b;

    public apsa(apte apte, aptg aptg) {
        this.b = apte;
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apvn apvn = (apvn) obj;
        this.b.a(new GetTokenResponse(apvn.b, apvn.a, Long.valueOf(apvn.c), "Bearer"), (String) null, (String) null, Boolean.valueOf(apvn.d), (DefaultOAuthCredential) null, this.a, this);
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
