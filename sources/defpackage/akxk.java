package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.places.Subscription;
import com.google.android.userlocation.LegacySemanticLocationEventSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: akxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxk implements akwg {
    private final SemanticLocationEventRequest a;
    private final ifu b;
    private final PendingIntent c;
    private final PendingIntent d;

    public akxk(SemanticLocationEventRequest semanticLocationEventRequest, ifu ifu, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        iva.a((Object) semanticLocationEventRequest);
        iva.a((Object) ifu);
        iva.a((Object) pendingIntent);
        iva.a((Object) pendingIntent2);
        this.a = semanticLocationEventRequest;
        this.b = ifu;
        this.c = pendingIntent;
        this.d = pendingIntent2;
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
        return true;
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        try {
            b((Status) akvf.a((Subscription) new LegacySemanticLocationEventSubscription(this.a, placesParams, this.c, this.d)).get());
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
