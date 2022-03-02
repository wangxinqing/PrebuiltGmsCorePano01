package defpackage;

import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;

/* renamed from: fhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fhz implements amqy {
    static final amqy a = new fhz();

    private fhz() {
    }

    public final Object a(Object obj) {
        iwd iwd = fib.a;
        SignInCredential signInCredential = ((InternalSignInCredentialWrapper) obj).g;
        if (signInCredential.f != null) {
            return Integer.valueOf(signInCredential.a());
        }
        return Integer.MAX_VALUE;
    }
}
