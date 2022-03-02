package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.util.Pair;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vos implements vhf {
    private final ReceiveSurfaceChimeraActivity a;

    public vos(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.a = receiveSurfaceChimeraActivity;
    }

    public final void a() {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.a;
        receiveSurfaceChimeraActivity.startActivityForResult(SetupChimeraActivity.a((Context) receiveSurfaceChimeraActivity), ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, ActivityOptions.makeSceneTransitionAnimation(receiveSurfaceChimeraActivity.getContainerActivity(), new Pair[]{new Pair(receiveSurfaceChimeraActivity.d, "card")}).toBundle());
    }
}
