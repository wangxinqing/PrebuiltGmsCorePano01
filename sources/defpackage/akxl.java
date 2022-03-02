package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.fencing.PlacefencingFilter;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.placefencing.PlacefencingSubscription;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: akxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxl implements akwg {
    private final String a;
    private final ifu b;

    public akxl(String str, ifu ifu) {
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
        return false;
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        String str = this.a;
        List<String> singletonList = Collections.singletonList("ignored");
        for (String isEmpty : singletonList) {
            if (TextUtils.isEmpty(isEmpty)) {
                throw new IllegalArgumentException("Null or empty client identifiers are not valid.");
            }
        }
        PlacefencingFilter placefencingFilter = new PlacefencingFilter((List) null, (List) null, singletonList);
        rix rix = new rix();
        iva.a(str, (Object) "Request ID cannot be empty.");
        boolean z = false;
        iva.b(str.length() <= 50, "Request ID cannotexceed length of 50");
        rix.a = str;
        iva.a((Object) placefencingFilter, (Object) "Filter cannot be null.");
        rix.b = placefencingFilter;
        rix.c = 1;
        iva.a((Object) rix.a, (Object) "Request ID may not be null, did you forget to call PlacefencingRequest.Builder.setRequestId(String)?");
        iva.a((Object) rix.b, (Object) "Filter may not be null, did you forget to call PlacefencingRequest.Builder.setPlacefencingFilter(PlacefencingFilter)?");
        if (rix.c != 0) {
            z = true;
        }
        iva.b(z, "Transitions must be set, did you forget to call PlacefencingRequest.Builder.setTransitions(int)?");
        try {
            b((Status) akvf.b(PlacefencingSubscription.a(new PlacefencingRequest(rix.a, rix.b, rix.c, 5, 0, 0), placesParams, (PendingIntent) null)).get());
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
