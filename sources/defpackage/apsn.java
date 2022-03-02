package defpackage;

import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apsn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apsn implements apts {
    final /* synthetic */ apso a;

    public apsn(apso apso) {
        this.a = apso;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apuc apuc = (apuc) obj;
        this.a.d.a(new GetTokenResponse(apuc.b, apuc.a, Long.valueOf(apuo.a(apuc.a)), "Bearer"), (String) null, (String) null, false, (DefaultOAuthCredential) null, this.a.c, this);
    }

    public final void a(String str) {
        this.a.c.a(apvs.a(str));
    }
}
