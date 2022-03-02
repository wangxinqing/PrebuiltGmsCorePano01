package defpackage;

import com.google.android.gms.maps.model.CameraPosition;

/* renamed from: akze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akze implements rqs {
    final /* synthetic */ CameraPosition a;
    final /* synthetic */ akzj b;

    public akze(akzj akzj, CameraPosition cameraPosition) {
        this.b = akzj;
        this.a = cameraPosition;
    }

    public final void a(rqn rqn) {
        this.b.B = true;
        akzj.a(rqn, this.a);
    }
}
