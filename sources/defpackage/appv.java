package defpackage;

import com.google.firebase.auth.api.model.VerifyCustomTokenResponse;

/* renamed from: appv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class appv implements acvp {
    final /* synthetic */ apts a;

    public appv(apts apts) {
        this.a = apts;
    }

    public final void a(acwa acwa) {
        if (acwa.b()) {
            this.a.a((VerifyCustomTokenResponse) acwa.d());
        } else {
            this.a.a(acwa.e().getMessage());
        }
    }
}
