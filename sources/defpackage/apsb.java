package defpackage;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apsb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apsb implements apts {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ aptg c;
    final /* synthetic */ apte d;

    public apsb(apte apte, String str, String str2, aptg aptg) {
        this.d = apte;
        this.a = str;
        this.b = str2;
        this.c = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        apux apux = new apux();
        apux.c(getTokenResponse.b);
        apux.b(this.a);
        apux.d(this.b);
        this.d.a(this.c, getTokenResponse, apux, this);
    }

    public final void a(String str) {
        this.c.a(apvs.a(str));
    }
}
