package defpackage;

import android.view.View;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vqq implements View.OnClickListener {
    private final SetupChimeraActivity a;

    public vqq(SetupChimeraActivity setupChimeraActivity) {
        this.a = setupChimeraActivity;
    }

    public void onClick(View view) {
        SetupChimeraActivity setupChimeraActivity = this.a;
        setupChimeraActivity.setResult(0);
        setupChimeraActivity.finish();
    }
}
