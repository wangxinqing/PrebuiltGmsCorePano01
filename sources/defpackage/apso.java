package defpackage;

import android.content.Context;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apso implements apts {
    final /* synthetic */ apub a;
    final /* synthetic */ Context b;
    final /* synthetic */ aptg c;
    final /* synthetic */ apte d;

    public apso(apte apte, apub apub, Context context, aptg aptg) {
        this.d = apte;
        this.a = apub;
        this.b = context;
        this.c = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apub apub = this.a;
        apub.a = ((GetTokenResponse) obj).b;
        aptt aptt = this.d.b;
        aptt.a((aptv) apub, (apth) new apuc(), axif.c(), "mfaEnrollment:finalize").a((acvp) new appn(aptt, this.b, new apsn(this), apub));
    }

    public final void a(String str) {
        this.c.a(apvs.a(str));
    }
}
