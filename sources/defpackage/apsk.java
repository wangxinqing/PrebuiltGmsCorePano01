package defpackage;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apsk implements apts {
    final /* synthetic */ String a;
    final /* synthetic */ aptg b;
    final /* synthetic */ apte c;

    public apsk(apte apte, String str, aptg aptg) {
        this.c = apte;
        this.a = str;
        this.b = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apvo apvo = new apvo(((GetTokenResponse) obj).b, this.a);
        this.c.b.a((aptv) apvo, (apth) new apvp(), axif.c(), "mfaEnrollment:withdraw").a((acvp) new appo(new apsj(this)));
    }

    public final void a(String str) {
        this.b.a(apvs.a(str));
    }
}
