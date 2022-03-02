package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;

/* renamed from: igr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class igr implements Runnable {
    final /* synthetic */ SignInResponse a;
    final /* synthetic */ igs b;

    public igr(igs igs, SignInResponse signInResponse) {
        this.b = igs;
        this.a = signInResponse;
    }

    public final void run() {
        igs igs = this.b;
        SignInResponse signInResponse = this.a;
        ConnectionResult connectionResult = signInResponse.b;
        if (connectionResult.b()) {
            ResolveAccountResponse resolveAccountResponse = signInResponse.c;
            ConnectionResult connectionResult2 = resolveAccountResponse.c;
            if (!connectionResult2.b()) {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                igs.f.b(connectionResult2);
                igs.e.j();
                return;
            }
            ifm ifm = igs.f;
            itm a2 = resolveAccountResponse.a();
            Set set = igs.c;
            if (a2 == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                ifm.b(new ConnectionResult(4));
            } else {
                ifm.c = a2;
                ifm.d = set;
                ifm.a();
            }
        } else {
            igs.f.b(connectionResult);
        }
        igs.e.j();
    }
}
