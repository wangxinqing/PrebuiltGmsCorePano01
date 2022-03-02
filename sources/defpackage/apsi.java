package defpackage;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apsi implements apts {
    final /* synthetic */ String a;
    final /* synthetic */ aptg b;
    final /* synthetic */ apte c;

    public apsi(apte apte, String str, aptg aptg) {
        this.c = apte;
        this.a = str;
        this.b = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        this.c.b.a(new apuh(getTokenResponse.b), (apts) new apsh(this, this, getTokenResponse));
    }

    public final void a(String str) {
        this.b.a(apvs.a(str));
    }
}
