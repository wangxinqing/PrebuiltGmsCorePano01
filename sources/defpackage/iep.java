package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: iep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class iep extends ifa {
    final /* synthetic */ iet a;
    final /* synthetic */ SignInResponse b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iep(iez iez, iet iet, SignInResponse signInResponse) {
        super(iez);
        this.a = iet;
        this.b = signInResponse;
    }

    public final void a() {
        iet iet = this.a;
        SignInResponse signInResponse = this.b;
        if (iet.b(0)) {
            ConnectionResult connectionResult = signInResponse.b;
            if (connectionResult.b()) {
                ResolveAccountResponse resolveAccountResponse = signInResponse.c;
                ConnectionResult connectionResult2 = resolveAccountResponse.c;
                if (!connectionResult2.b()) {
                    String valueOf = String.valueOf(connectionResult2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GACConnecting", sb.toString(), new Exception());
                    iet.b(connectionResult2);
                    return;
                }
                iet.g = true;
                iet.h = resolveAccountResponse.a();
                iet.i = resolveAccountResponse.d;
                iet.j = resolveAccountResponse.e;
                iet.e();
            } else if (iet.a(connectionResult)) {
                iet.f();
                iet.e();
            } else {
                iet.b(connectionResult);
            }
        }
    }
}
