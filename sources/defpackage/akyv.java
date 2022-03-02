package defpackage;

import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: akyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akyv implements rqs {
    final /* synthetic */ rhq a;
    final /* synthetic */ akzj b;

    public akyv(akzj akzj, rhq rhq) {
        this.b = akzj;
        this.a = rhq;
    }

    public final void a(rqn rqn) {
        this.b.g();
        akzj akzj = this.b;
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.a(this.a.d());
        markerOptions.d = this.b.c;
        akzj.k = rqn.a(markerOptions);
        akzj akzj2 = this.b;
        if (akzj2.p != null) {
            GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
            LatLng d = this.a.d();
            akzj akzj3 = this.b;
            groundOverlayOptions.a(d, (float) akzj3.r, (float) akzj3.s);
            groundOverlayOptions.a(0.4f);
            groundOverlayOptions.a(this.b.p);
            akzj2.l = rqn.a(groundOverlayOptions);
        }
    }
}
