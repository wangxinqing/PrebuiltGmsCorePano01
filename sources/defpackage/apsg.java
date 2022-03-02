package defpackage;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apsg implements apts {
    final /* synthetic */ aptg a;
    final /* synthetic */ apte b;

    public apsg(apte apte, aptg aptg) {
        this.b = apte;
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        apux apux = new apux();
        apux.c(getTokenResponse.b);
        apux.b((String) null);
        apux.d((String) null);
        this.b.a(this.a, getTokenResponse, apux, this);
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
