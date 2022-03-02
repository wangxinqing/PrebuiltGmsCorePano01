package defpackage;

import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: vof  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vof implements acvs {
    private final ReceiveSurfaceChimeraActivity a;

    public vof(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.a = receiveSurfaceChimeraActivity;
    }

    public final void a(Exception exc) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.a;
        if (ayni.O()) {
            Toast.makeText(receiveSurfaceChimeraActivity, receiveSurfaceChimeraActivity.getString(R.string.sharing_enable_failed_bluetooth), 0).show();
        } else {
            receiveSurfaceChimeraActivity.a(receiveSurfaceChimeraActivity.getString(R.string.sharing_required_service_bluetooth));
        }
        anih anih = (anih) vvj.a.c();
        anih.a((Throwable) exc);
        anih.a("Failed to turn on Bluetooth.");
    }
}
