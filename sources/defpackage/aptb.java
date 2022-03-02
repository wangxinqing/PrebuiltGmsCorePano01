package defpackage;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: aptb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aptb implements apts {
    final /* synthetic */ String a;
    final /* synthetic */ aptg b;
    final /* synthetic */ apte c;

    public aptb(apte apte, String str, aptg aptg) {
        this.c = apte;
        this.a = str;
        this.b = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        String str = getTokenResponse.b;
        apux apux = new apux();
        apux.c(str);
        apux.d(this.a);
        this.c.a(this.b, getTokenResponse, apux, this);
    }

    public final void a(String str) {
        this.b.a(apvs.a(str));
    }
}
