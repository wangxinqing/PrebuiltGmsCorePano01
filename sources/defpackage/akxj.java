package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import com.google.android.location.places.NearbyAlertSubscription;
import com.google.android.places.Subscription;
import java.util.concurrent.ExecutionException;

/* renamed from: akxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxj implements akwg {
    private final UserLocationNearbyAlertRequest a;
    private final PendingIntent b;
    private final PendingIntent c;
    private final ifu d;

    public akxj(UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, PendingIntent pendingIntent, PendingIntent pendingIntent2, ifu ifu) {
        this.a = userLocationNearbyAlertRequest;
        this.b = pendingIntent;
        this.c = pendingIntent2;
        this.d = ifu;
    }

    private final void b(Status status) {
        try {
            this.d.a(status);
        } catch (RemoteException e) {
        }
    }

    public final int a() {
        return 2;
    }

    public final aoei a(PlacesParams placesParams) {
        return null;
    }

    public final int b() {
        return 1;
    }

    public final String c() {
        return "android.permission.ACCESS_FINE_LOCATION";
    }

    public final boolean d() {
        return true;
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        boolean z;
        try {
            UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = this.a.c;
            int g = (int) azbk.g();
            if (userLocationNearbyAlertFilter.a.size() <= g) {
                z = true;
            } else {
                z = false;
            }
            iva.b(z, "Too many place IDs specified in NearbyAlertFilter. Maximum allowed is %d.", Integer.valueOf(g));
            try {
                b((Status) akvf.a((Subscription) new NearbyAlertSubscription(this.a, placesParams, this.b, this.c)).get());
            } catch (InterruptedException e) {
                throw new akwc(14);
            } catch (ExecutionException e2) {
                throw new nja(13, e2.getMessage());
            }
        } catch (IllegalArgumentException | NullPointerException e3) {
            throw new nja(26000, e3.getMessage());
        }
    }

    public final void a(Status status) {
        b(status);
    }
}
