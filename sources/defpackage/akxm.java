package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.location.places.NearbyAlertSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: akxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxm implements akwg {
    private final PendingIntent a;
    private final ifu b;

    public akxm(PendingIntent pendingIntent, ifu ifu) {
        iva.a((Object) pendingIntent);
        iva.a((Object) ifu);
        this.a = pendingIntent;
        this.b = ifu;
    }

    private final void b(Status status) {
        try {
            this.b.a(status);
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
        return "";
    }

    public final boolean d() {
        return false;
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        try {
            b((Status) akvf.b(new NearbyAlertSubscription(NearbyAlertSubscription.a, PlacesParams.a, (PendingIntent) null, this.a)).get());
        } catch (InterruptedException e) {
            throw new akwc(14);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    public final void a(Status status) {
        b(status);
    }
}
