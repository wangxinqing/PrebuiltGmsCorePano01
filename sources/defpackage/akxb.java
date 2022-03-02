package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import java.util.ArrayList;

/* renamed from: akxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxb extends akwd {
    private final akuy b;
    private final NearbyAlertRequest c;
    private final Intent d;
    private final PendingIntent e;
    private final rka f;
    private final akxe g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akxb(NearbyAlertRequest nearbyAlertRequest, Intent intent, PendingIntent pendingIntent, akxe akxe, PlacesParams placesParams, rka rka, akuy akuy, akvn akvn, akhj akhj) {
        super(67, "RequestNearbyAlerts", placesParams, akuy, akvn, "android.permission.ACCESS_FINE_LOCATION", akhj);
        iva.a((Object) nearbyAlertRequest);
        iva.a((Object) pendingIntent);
        iva.a((Object) rka);
        this.d = intent;
        this.c = nearbyAlertRequest;
        this.e = pendingIntent;
        this.f = rka;
        this.b = akuy;
        this.g = akxe;
    }

    public final int a() {
        return 2;
    }

    public final int b() {
        return 1;
    }

    public final aoei c() {
        return akig.a(this.c, this.a, true);
    }

    public final boolean e() {
        return true;
    }

    public final void a(Context context) {
        boolean z;
        super.a(context);
        try {
            PlacesParams placesParams = this.a;
            if (!this.b.b.equals("com.google.android.gms")) {
                iva.b(this.e.getTargetPackage().equals(placesParams.b), "The supplied PendingIntent was not created by your application.");
            }
            NearbyAlertFilter nearbyAlertFilter = this.c.c;
            iva.a((Object) nearbyAlertFilter);
            int g2 = (int) azbk.g();
            if (nearbyAlertFilter.e.size() <= g2) {
                z = true;
            } else {
                z = false;
            }
            iva.b(z, "Too many place IDs specified in NearbyAlertFilter. Maximum allowed is %d.", Integer.valueOf(g2));
            iva.b(true, "Nearby Alerts does not support personalization.");
            PendingIntent service = PendingIntent.getService(context, 0, this.d, 134217728);
            akxe akxe = this.g;
            NearbyAlertRequest nearbyAlertRequest = this.c;
            int i = nearbyAlertRequest.a;
            NearbyAlertFilter nearbyAlertFilter2 = nearbyAlertRequest.c;
            UserLocationNearbyAlertRequest a = UserLocationNearbyAlertRequest.a(i, new UserLocationNearbyAlertFilter(new ArrayList(nearbyAlertFilter2.e), new ArrayList(nearbyAlertFilter2.f), nearbyAlertFilter2.c, nearbyAlertFilter2.d), nearbyAlertRequest.b, nearbyAlertRequest.d, nearbyAlertRequest.e, nearbyAlertRequest.f);
            PendingIntent pendingIntent = this.e;
            adut adut = akxe.a;
            iha b2 = ihb.b();
            b2.a = new aduj(adut, a, service, pendingIntent);
            adut.b(b2.a()).a((acvp) new akxa(this));
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new nja(9004, e2.getMessage());
        }
    }

    public final void b(Status status) {
        alfs.a(status.i, status.j, this.f);
    }

    public final void a(Status status) {
        b(status);
    }
}
