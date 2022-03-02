package defpackage;

import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: vor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vor implements View.OnClickListener {
    private final ReceiveSurfaceChimeraActivity a;

    public vor(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.a = receiveSurfaceChimeraActivity;
    }

    public void onClick(View view) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.a;
        receiveSurfaceChimeraActivity.j.a(true);
        acwa a2 = wia.a((Activity) receiveSurfaceChimeraActivity);
        acwa a3 = wht.a(receiveSurfaceChimeraActivity.getApplicationContext());
        acwa a4 = win.a((Activity) receiveSurfaceChimeraActivity);
        acws.a(a2, a3, receiveSurfaceChimeraActivity.b.b(true), a4).a((acvp) new vod(receiveSurfaceChimeraActivity));
        a2.a((acvs) new voe(receiveSurfaceChimeraActivity));
        a3.a((acvs) new vof(receiveSurfaceChimeraActivity));
        a4.a((acvs) new vog(receiveSurfaceChimeraActivity));
    }
}
