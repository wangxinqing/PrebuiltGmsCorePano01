package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.userlocation.SemanticLocationEventSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: akxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxg implements akwg {
    private final String a;
    private final ifu b;

    public akxg(String str, ifu ifu) {
        iva.a((Object) str);
        iva.b(!str.isEmpty());
        iva.a((Object) ifu);
        this.a = str;
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
        return akig.a(placesParams, false);
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        String str = this.a;
        aduf aduf = new aduf();
        aduf.a(1);
        aduf.a(str);
        try {
            b((Status) akvf.b(new SemanticLocationEventSubscription(aduf.a(), placesParams, (PendingIntent) null)).get());
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
