package defpackage;

import com.google.firebase.auth.api.model.GetAccountInfoResponse;

/* renamed from: apqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apqc implements acvp {
    final /* synthetic */ apts a;

    public apqc(apts apts) {
        this.a = apts;
    }

    public final void a(acwa acwa) {
        if (acwa.b()) {
            this.a.a((GetAccountInfoResponse) acwa.d());
        } else {
            this.a.a(acwa.e().getMessage());
        }
    }
}
