package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.userlocation.LegacySemanticLocationEventSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: akxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxn implements akwg {
    private final PendingIntent a;
    private final ifu b;

    public akxn(PendingIntent pendingIntent, ifu ifu) {
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
        return 3;
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
        return false;
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        try {
            b((Status) akvf.b(new LegacySemanticLocationEventSubscription(LegacySemanticLocationEventSubscription.a, placesParams, (PendingIntent) null, this.a)).get());
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
