package defpackage;

import android.content.Intent;
import com.google.android.gms.signin.activity.SignInChimeraActivity;
import com.google.android.gms.signin.internal.AuthAccountResult;

/* renamed from: abbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abbt implements amqy {
    private final SignInChimeraActivity a;

    public abbt(SignInChimeraActivity signInChimeraActivity) {
        this.a = signInChimeraActivity;
    }

    public final Object a(Object obj) {
        SignInChimeraActivity signInChimeraActivity = this.a;
        AuthAccountResult authAccountResult = (AuthAccountResult) obj;
        if (authAccountResult.aO().c()) {
            return amri.b(6);
        }
        Intent intent = authAccountResult.c;
        if (intent != null) {
            signInChimeraActivity.j = intent;
            return amri.b(5);
        }
        Intent intent2 = new Intent();
        intent2.putExtra("<<ResolutionFailureErrorDetail>>", authAccountResult.b);
        signInChimeraActivity.a(0, intent2);
        return ampu.a;
    }
}
