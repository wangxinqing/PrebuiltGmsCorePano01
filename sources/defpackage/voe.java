package defpackage;

import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: voe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class voe implements acvs {
    private final ReceiveSurfaceChimeraActivity a;

    public voe(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.a = receiveSurfaceChimeraActivity;
    }

    public final void a(Exception exc) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.a;
        if (ayni.O()) {
            Toast.makeText(receiveSurfaceChimeraActivity, receiveSurfaceChimeraActivity.getString(R.string.sharing_enable_failed_location), 0).show();
        } else {
            receiveSurfaceChimeraActivity.a(receiveSurfaceChimeraActivity.getString(R.string.sharing_required_service_location));
        }
        anih anih = (anih) vvj.a.c();
        anih.a((Throwable) exc);
        anih.a("Failed to turn on Location.");
    }
}
