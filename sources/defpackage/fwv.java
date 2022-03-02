package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: fwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fwv implements ir {
    final /* synthetic */ SignInHubActivity a;

    public fwv(SignInHubActivity signInHubActivity) {
        this.a = signInHubActivity;
    }

    public final km a(int i, Bundle bundle) {
        return new fwa(this.a, icc.a());
    }

    public final void a(km kmVar) {
    }

    public final /* bridge */ /* synthetic */ void a(km kmVar, Object obj) {
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = this.a;
        signInHubActivity.setResult(signInHubActivity.k, signInHubActivity.l);
        this.a.finish();
    }
}
