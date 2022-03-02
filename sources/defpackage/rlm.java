package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: rlm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rlm implements icm {
    final /* synthetic */ int a;
    final /* synthetic */ rhf b;
    final /* synthetic */ rlr c;

    public rlm(rlr rlr, int i, rhf rhf) {
        this.c = rlr;
        this.a = i;
        this.b = rhf;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        Status status;
        rhr rhr = (rhr) icl;
        this.c.a((icf) null);
        rlr rlr = this.c;
        rlr.a(rlk.a(rlr.b, rhr));
        rhr.c();
        rlk rlk = this.c.b;
        if (rlk.a == 7 && (status = rlk.b) != null && status.c()) {
            rlr rlr2 = this.c;
            rlr2.a(rlk.a(rlr2.b, this.a));
            rlr rlr3 = this.c;
            rhf rhf = this.b;
            LatLngBounds latLngBounds = rlr3.e;
            if (latLngBounds == null) {
                latLngBounds = new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d));
            }
            icf a2 = rjl.a(rlr3.c, latLngBounds, 1, rhf.e().toString(), (PlaceFilter) null);
            rlr3.a(a2);
            a2.a((icm) new rln(rlr3));
            return;
        }
        rlr rlr4 = this.c;
        alcj alcj = rlr4.g;
        if (alcj != null) {
            rlk rlk2 = rlr4.b;
            if (rlk2.a == 8) {
                alcj.a(rlk2.e);
            }
        }
    }
}
