package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.Subscription;
import com.google.android.places.placefencing.PlacefencingSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: akxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxi implements akwg {
    private final PlacefencingRequest a;
    private final PendingIntent b;
    private final ifu c;

    public akxi(PlacefencingRequest placefencingRequest, PendingIntent pendingIntent, ifu ifu) {
        iva.a((Object) placefencingRequest);
        iva.a((Object) pendingIntent);
        iva.a((Object) ifu);
        this.a = placefencingRequest;
        this.b = pendingIntent;
        this.c = ifu;
    }

    private final void b(Status status) {
        try {
            this.c.a(status);
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
        return 2;
    }

    public final String c() {
        return "android.permission.ACCESS_FINE_LOCATION";
    }

    public final boolean d() {
        return true;
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        try {
            b((Status) akvf.a((Subscription) PlacefencingSubscription.a(this.a, placesParams, this.b)).get());
        } catch (InterruptedException e) {
            throw new akwc(14);
        } catch (ExecutionException e2) {
            throw new nja(13, e2.getMessage());
        }
    }

    public final void a(Status status) {
        b(status);
    }
}
