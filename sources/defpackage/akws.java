package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.places.Subscription;
import com.google.android.userlocation.SemanticLocationUpdateSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: akws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akws implements akwg {
    private final SemanticLocationUpdateRequest a;
    private final ifu b;
    private final advg c;

    public akws(SemanticLocationUpdateRequest semanticLocationUpdateRequest, ifu ifu, advg advg) {
        iva.a((Object) semanticLocationUpdateRequest);
        iva.a((Object) ifu);
        iva.a((Object) advg);
        this.a = semanticLocationUpdateRequest;
        this.b = ifu;
        this.c = advg;
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

    public final int b() {
        return 2;
    }

    public final String c() {
        return "android.permission.ACCESS_FINE_LOCATION";
    }

    public final boolean d() {
        return false;
    }

    public final aoei a(PlacesParams placesParams) {
        return akig.b(placesParams, true);
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        try {
            b((Status) akvf.a((Subscription) new SemanticLocationUpdateSubscription(this.a, placesParams, this.c)).get());
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
