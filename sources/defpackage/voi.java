package defpackage;

import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: voi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class voi implements acvv {
    private final ReceiveSurfaceChimeraActivity a;

    public voi(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.a = receiveSurfaceChimeraActivity;
    }

    public final void a(Object obj) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.a;
        receiveSurfaceChimeraActivity.k.setText(receiveSurfaceChimeraActivity.getString(R.string.sharing_receive_surface_subtitle, new Object[]{(String) obj}));
    }
}
