package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: abbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abbz implements amqy {
    private final SignInChimeraActivity a;

    public abbz(SignInChimeraActivity signInChimeraActivity) {
        this.a = signInChimeraActivity;
    }

    public final Object a(Object obj) {
        SignInChimeraActivity signInChimeraActivity = this.a;
        if (!((Status) obj).c()) {
            SignInChimeraActivity.a.d("Saving selected account failed. User probably need to re-select.", new Object[0]);
        }
        signInChimeraActivity.a(-1, (Intent) null);
        return ampu.a;
    }
}
