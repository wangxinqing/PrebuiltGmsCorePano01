package defpackage;

import android.app.ActivityOptions;
import android.util.Pair;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vqo implements acvp {
    private final SetupChimeraActivity a;

    public vqo(SetupChimeraActivity setupChimeraActivity) {
        this.a = setupChimeraActivity;
    }

    public final void a(acwa acwa) {
        SetupChimeraActivity setupChimeraActivity = this.a;
        if (!acwa.b()) {
            Toast.makeText(setupChimeraActivity, setupChimeraActivity.getResources().getString(R.string.sharing_setup_toast_contact_mode_not_available), 0).show();
            setupChimeraActivity.b.a(0);
            setupChimeraActivity.i();
        } else if (((Boolean) acwa.d()).booleanValue()) {
            setupChimeraActivity.h();
        } else {
            setupChimeraActivity.startActivityForResult(ConsentsChimeraActivity.a(setupChimeraActivity), 1004, ActivityOptions.makeSceneTransitionAnimation(setupChimeraActivity.getContainerActivity(), new Pair[]{new Pair(setupChimeraActivity.d, "card")}).toBundle());
        }
    }
}
