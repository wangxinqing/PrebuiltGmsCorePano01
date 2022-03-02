package defpackage;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apsu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apsu implements apts {
    final /* synthetic */ aptg a;
    final /* synthetic */ apte b;

    public apsu(apte apte, aptg aptg) {
        this.b = apte;
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apty apty = new apty(((GetTokenResponse) obj).b);
        aptt aptt = this.b.b;
        apst apst = new apst(this, this);
        aptt.a(aptt.c, aptt.a, aptt.a(aptt.a(axic.c(), "deleteAccount"), apty.a().k(), (String) null), (auef) null).b(new appt()).a((acvp) new appk(apst));
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
