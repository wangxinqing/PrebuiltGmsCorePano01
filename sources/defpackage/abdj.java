package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;

/* renamed from: abdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abdj extends abdq {
    final /* synthetic */ acwd a;

    public abdj(acwd acwd) {
        this.a = acwd;
    }

    public final void a(ConnectionResult connectionResult, AuthAccountResult authAccountResult) {
        ihd.a(Status.a, authAccountResult, this.a);
    }
}
