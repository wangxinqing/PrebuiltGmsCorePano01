package defpackage;

import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apsp implements apts {
    final /* synthetic */ aptg a;
    final /* synthetic */ apte b;

    public apsp(apte apte, aptg aptg) {
        this.b = apte;
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apue apue = (apue) obj;
        this.b.a(new GetTokenResponse(apue.b, apue.a, Long.valueOf(apuo.a(apue.a)), "Bearer"), (String) null, (String) null, false, (DefaultOAuthCredential) null, this.a, this);
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
