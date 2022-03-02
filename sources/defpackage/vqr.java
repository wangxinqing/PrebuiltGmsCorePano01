package defpackage;

import android.view.View;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vqr implements View.OnClickListener {
    private final SetupChimeraActivity a;

    public vqr(SetupChimeraActivity setupChimeraActivity) {
        this.a = setupChimeraActivity;
    }

    public void onClick(View view) {
        SetupChimeraActivity setupChimeraActivity = this.a;
        if (setupChimeraActivity.l == 0) {
            setupChimeraActivity.h();
        } else if (!ayni.C()) {
            setupChimeraActivity.h();
        } else {
            setupChimeraActivity.b.t().b(new vqs(setupChimeraActivity)).a((acvp) new vqo(setupChimeraActivity));
        }
    }
}
