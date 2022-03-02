package defpackage;

import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: appr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class appr implements acvp {
    final /* synthetic */ apts a;

    public appr(apts apts) {
        this.a = apts;
    }

    public final void a(acwa acwa) {
        if (acwa.b()) {
            this.a.a((GetTokenResponse) acwa.d());
        } else {
            this.a.a(acwa.e().getMessage());
        }
    }
}
