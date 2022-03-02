package defpackage;

import android.location.Location;
import com.android.volley.Response;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: sms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class sms implements acvp {
    private final smt a;

    public sms(smt smt) {
        this.a = smt;
    }

    public final void a(acwa acwa) {
        Location location;
        smt smt = this.a;
        if (acwa.b()) {
            location = (Location) acwa.d();
        } else {
            location = null;
        }
        if (location != null) {
            if (azfk.d()) {
                if (System.currentTimeMillis() - location.getTime() < 600000) {
                    smt.d = true;
                    snl.a().a(location);
                    smt.a(avuj.SUCCESS, location, (Response.Listener) null, (Response.ErrorListener) smt);
                }
                if (((double) location.getAccuracy()) < 25.0d && System.currentTimeMillis() - location.getTime() < 60000) {
                    int i = crc.a;
                    smt.a();
                    return;
                }
            } else {
                smt.d = true;
                snl.a().a(location);
                smt.a(avuj.SUCCESS, location, (Response.Listener) null, (Response.ErrorListener) smt);
            }
        }
        if (azfk.d() && !smt.d) {
            smt.a(avuj.SUCCESS, (Location) null, (Response.Listener) null, (Response.ErrorListener) smt);
        }
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.c(100);
        locationRequest.a(60000);
        locationRequest.c(0);
        locationRequest.b(10);
        LocationRequestInternal a2 = LocationRequestInternal.a("adm_gcm_receiver_service", locationRequest);
        a2.a();
        smt.e.a(a2, (rei) smt, smt.c.getLooper());
    }
}
