package defpackage;

import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: akyx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akyx implements Runnable {
    final /* synthetic */ akyy a;

    public akyx(akyy akyy) {
        this.a = akyy;
    }

    public final void run() {
        if (this.a.b.isAdded()) {
            akzj akzj = this.a.b;
            if (!akzj.b) {
                akzj.b = true;
                LocationManager locationManager = (LocationManager) akzj.getActivity().getSystemService("location");
                if (locationManager == null) {
                    akzh akzh = this.a.b.t;
                    if (akzh != null) {
                        akzh.b();
                    }
                } else {
                    Location lastKnownLocation = locationManager.getLastKnownLocation("passive");
                    if (lastKnownLocation != null) {
                        akzh akzh2 = this.a.b.t;
                        if (akzh2 != null) {
                            akzh2.a(new LatLng(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude()));
                        }
                    } else {
                        akzh akzh3 = this.a.b.t;
                        if (akzh3 != null) {
                            akzh3.b();
                        }
                    }
                }
                rqn rqn = this.a.b.f;
                if (rqn != null) {
                    rqn.a((akyw) null);
                }
            }
        }
    }
}
