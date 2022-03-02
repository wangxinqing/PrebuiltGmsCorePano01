package defpackage;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apss implements apts {
    final /* synthetic */ aptg a;
    final /* synthetic */ apte b;

    public apss(apte apte, aptg aptg) {
        this.b = apte;
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        this.b.b.a(new apuh(getTokenResponse.b), (apts) new apsr(this, this, getTokenResponse));
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
