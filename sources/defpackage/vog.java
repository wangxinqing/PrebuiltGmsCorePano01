package defpackage;

import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: vog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vog implements acvs {
    private final ReceiveSurfaceChimeraActivity a;

    public vog(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.a = receiveSurfaceChimeraActivity;
    }

    public final void a(Exception exc) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.a;
        Toast.makeText(receiveSurfaceChimeraActivity, receiveSurfaceChimeraActivity.getString(R.string.sharing_enable_failed_wifi), 0).show();
        anih anih = (anih) vvj.a.c();
        anih.a((Throwable) exc);
        anih.a("Failed to turn on Wifi.");
    }
}
