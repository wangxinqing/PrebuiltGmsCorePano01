package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocation;
import java.util.concurrent.ExecutionException;

/* renamed from: akwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwj implements akwg {
    private final String a;
    private final advg b;

    public akwj(String str, advg advg) {
        iva.a((Object) advg);
        this.b = advg;
        this.a = str;
    }

    private final void a(Status status, SemanticLocation semanticLocation) {
        try {
            this.b.a(status, semanticLocation);
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
        return akig.a(placesParams, 6);
    }

    public final void a(Context context, akvf akvf, PlacesParams placesParams) {
        try {
            a(Status.a, alll.a((akip) akvf.a(this.a).get()));
        } catch (InterruptedException e) {
            throw new akwc(14);
        } catch (ExecutionException e2) {
            throw new nja(13, e2.getMessage());
        }
    }

    public final void a(Status status) {
        a(status, (SemanticLocation) null);
    }
}
