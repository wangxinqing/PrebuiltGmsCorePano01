package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocation;

/* renamed from: akwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwh implements akwg {
    private final advg a;

    public akwh(advg advg) {
        iva.a((Object) advg);
        this.a = advg;
    }

    private final void b(Status status) {
        try {
            this.a.a(status, (SemanticLocation) null);
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
        return false;
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        b(Status.c);
    }

    public final void a(Status status) {
        b(status);
    }
}
