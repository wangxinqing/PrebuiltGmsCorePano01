package defpackage;

import android.content.Intent;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: abcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abcn implements aora {
    final /* synthetic */ long a;
    final /* synthetic */ SignInChimeraActivity b;

    public abcn(SignInChimeraActivity signInChimeraActivity, long j) {
        this.b = signInChimeraActivity;
        this.a = j;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        amri amri = (amri) obj;
        SignInChimeraActivity signInChimeraActivity = this.b;
        signInChimeraActivity.a(this.a, signInChimeraActivity.c, true);
        if (amri.a()) {
            this.b.c = ((Integer) amri.b()).intValue();
            this.b.e();
        }
    }

    public final void a(Throwable th) {
        SignInChimeraActivity signInChimeraActivity = this.b;
        signInChimeraActivity.a(this.a, signInChimeraActivity.c, false);
        this.b.a(0, (Intent) null);
    }
}
