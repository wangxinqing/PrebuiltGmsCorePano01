package defpackage;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;

/* renamed from: fuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fuc implements igp {
    private final String a;
    private final BeginSignInRequest b;
    private final InternalSignInCredentialWrapper c;

    public fuc(String str, BeginSignInRequest beginSignInRequest, InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        this.a = str;
        this.b = beginSignInRequest;
        this.c = internalSignInCredentialWrapper;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        BeginSignInRequest beginSignInRequest = this.b;
        InternalSignInCredentialWrapper internalSignInCredentialWrapper = this.c;
        ((fto) ((ftz) obj).x()).a((ftc) new ftb((acwd) obj2), str, beginSignInRequest, internalSignInCredentialWrapper);
    }
}
