package defpackage;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* renamed from: fua  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fua implements igp {
    private final String a;
    private final BeginSignInRequest b;

    public fua(String str, BeginSignInRequest beginSignInRequest) {
        this.a = str;
        this.b = beginSignInRequest;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        BeginSignInRequest beginSignInRequest = this.b;
        ((fto) ((ftz) obj).x()).a((ftr) new ftq((acwd) obj2), str, beginSignInRequest);
    }
}
