package defpackage;

import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: aprn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aprn implements apts {
    final /* synthetic */ aptg a;
    final /* synthetic */ apte b;

    public aprn(apte apte, aptg aptg) {
        this.b = apte;
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apva apva = (apva) obj;
        this.b.a(new GetTokenResponse(apva.b, apva.a, Long.valueOf(apva.c), "Bearer"), (String) null, (String) null, true, (DefaultOAuthCredential) null, this.a, this);
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
