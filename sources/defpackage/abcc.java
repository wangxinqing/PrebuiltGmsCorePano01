package defpackage;

import android.content.Intent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: abcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abcc implements icb {
    private final SignInChimeraActivity a;

    public abcc(SignInChimeraActivity signInChimeraActivity) {
        this.a = signInChimeraActivity;
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.a(0, (Intent) null);
    }
}
