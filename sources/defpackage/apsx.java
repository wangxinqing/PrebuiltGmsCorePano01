package defpackage;

import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;

/* renamed from: apsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apsx implements apts {
    final /* synthetic */ aptg a;
    final /* synthetic */ apte b;

    public apsx(apte apte, aptg aptg) {
        this.b = apte;
        this.a = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apvh apvh = (apvh) obj;
        if (!apvh.b()) {
            this.b.a(apvh, this.a, this);
        } else if (this.b.c.b()) {
            this.a.a(new OnFailedMfaSignInAidlResponse(apvh.l, apvh.k, apvh.c()));
        } else {
            apte.a.e("Need to do multi-factor auth, but SDK does not support it.", new Object[0]);
            a("REQUIRES_SECOND_FACTOR_AUTH");
        }
    }

    public final void a(String str) {
        this.a.a(apvs.a(str));
    }
}
