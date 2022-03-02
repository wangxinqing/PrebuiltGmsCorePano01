package defpackage;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: alde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alde implements rqs {
    final /* synthetic */ LatLng a;

    public alde(LatLng latLng) {
        this.a = latLng;
    }

    public final void a(rqn rqn) {
        rqn.a(rqi.a(this.a));
        rqn.b();
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.a(this.a);
        rqn.a(markerOptions);
    }
}
