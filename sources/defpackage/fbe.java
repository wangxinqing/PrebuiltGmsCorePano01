package defpackage;

import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* renamed from: fbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fbe implements ow {
    private final fbk a;

    public fbe(fbk fbk) {
        this.a = fbk;
    }

    public final Object a() {
        fbk fbk = this.a;
        AuthorizationRequest authorizationRequest = fbk.b;
        if (authorizationRequest.c && fbk.i == null) {
            return fbk.a(1);
        }
        if (fbk.j == null) {
            return fbk.a(2);
        }
        if (authorizationRequest.d && fbk.k == null) {
            return fbk.a(3);
        }
        return aorl.a((Object) amri.b(qcr.BUILD_GOOGLE_SIGN_IN_ACCOUNT));
    }
}
