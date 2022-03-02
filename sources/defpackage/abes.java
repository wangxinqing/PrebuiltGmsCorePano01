package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: abes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abes extends abdq {
    final /* synthetic */ ResolveAccountResponse a;
    final /* synthetic */ iud b;

    public abes(iud iud, ResolveAccountResponse resolveAccountResponse) {
        this.b = iud;
        this.a = resolveAccountResponse;
    }

    public final void a(ConnectionResult connectionResult, AuthAccountResult authAccountResult) {
        this.b.b.b.a(new SignInResponse(connectionResult, this.a));
    }
}
