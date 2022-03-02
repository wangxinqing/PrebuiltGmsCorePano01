package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.EstimationOptions;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.userlocation.SemanticLocationUpdateSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: akxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxh implements akwg {
    private final String a;
    private final ifu b;

    public akxh(String str, ifu ifu) {
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
        return akig.b(placesParams, false);
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        boolean z;
        String str = this.a;
        aduw aduw = new aduw();
        iva.a(str, (Object) "Request ID cannot be empty.");
        if (str.length() <= 30) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Request ID cannot exceed length of 30");
        aduw.a = str;
        if (jlh.d(aduw.a)) {
            String valueOf = String.valueOf(aduw.a);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid request ID: ") : "Invalid request ID: ".concat(valueOf));
        }
        try {
            b((Status) akvf.b(new SemanticLocationUpdateSubscription(new SemanticLocationUpdateRequest(aduw.a, 2, new EstimationOptions(true, true)), placesParams, (advg) null)).get());
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
