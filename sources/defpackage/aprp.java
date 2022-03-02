package defpackage;

import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: aprp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aprp implements apts {
    final /* synthetic */ EmailAuthCredential a;
    final /* synthetic */ aptg b;
    final /* synthetic */ apte c;

    public aprp(apte apte, EmailAuthCredential emailAuthCredential, aptg aptg) {
        this.c = apte;
        this.a = emailAuthCredential;
        this.b = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.c.a(new aptz(this.a, ((GetTokenResponse) obj).b), this.b);
    }

    public final void a(String str) {
        this.b.a(apvs.a(str));
    }
}
