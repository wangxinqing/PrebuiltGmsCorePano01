package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

/* renamed from: abci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class abci implements DialogInterface.OnCancelListener {
    private final SignInChimeraActivity a;
    private final aosh b;

    public abci(SignInChimeraActivity signInChimeraActivity, aosh aosh) {
        this.a = signInChimeraActivity;
        this.b = aosh;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        SignInChimeraActivity signInChimeraActivity = this.a;
        aosh aosh = this.b;
        Intent intent = new Intent();
        intent.putExtra("<<ResolutionFailureErrorDetail>>", 17);
        signInChimeraActivity.a(0, intent);
        aosh.b((Object) ampu.a);
    }
}
