package defpackage;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apta implements apts {
    final /* synthetic */ String a;
    final /* synthetic */ aptg b;
    final /* synthetic */ apte c;

    public apta(apte apte, String str, aptg aptg) {
        this.c = apte;
        this.a = str;
        this.b = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        apux apux = new apux();
        apux.c(getTokenResponse.b);
        apux.b(this.a);
        this.c.a(this.b, getTokenResponse, apux, this);
    }

    public final void a(String str) {
        this.b.a(apvs.a(str));
    }
}
