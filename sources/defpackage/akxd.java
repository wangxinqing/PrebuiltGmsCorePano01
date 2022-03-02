package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;

/* renamed from: akxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akxd extends akwd {
    private final akuy b;
    private final PlaceRequest c;
    private final PendingIntent d;
    private final Intent e;
    private final rka f;
    private final akxe g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akxd(PlaceRequest placeRequest, Intent intent, PendingIntent pendingIntent, akxe akxe, rka rka, PlacesParams placesParams, akuy akuy, akvn akvn, akhj akhj) {
        super(67, "RequestPlaceUpdates", placesParams, akuy, akvn, "android.permission.ACCESS_FINE_LOCATION", akhj);
        iva.a((Object) placeRequest);
        iva.a((Object) pendingIntent);
        iva.a((Object) intent);
        iva.a((Object) rka);
        this.c = placeRequest;
        this.g = akxe;
        this.d = pendingIntent;
        this.e = intent;
        this.f = rka;
        this.a = placesParams;
        this.b = akuy;
    }

    public final int a() {
        return 2;
    }

    public final int b() {
        return 2;
    }

    public final aoei c() {
        return akig.a(Integer.valueOf(this.c.c), Long.valueOf(this.c.b), this.a, true);
    }

    public final boolean e() {
        return true;
    }

    public final void a(Context context) {
        int i;
        boolean z;
        super.a(context);
        try {
            PlacesParams placesParams = this.a;
            if (!this.b.b.equals("com.google.android.gms")) {
                iva.b(this.d.getTargetPackage().equals(placesParams.b), "The supplied PendingIntent was not created by your application.");
            }
            PlaceFilter placeFilter = this.c.a;
            if (placeFilter != null) {
                int g2 = (int) azbk.g();
                if (placeFilter.g.size() <= g2) {
                    z = true;
                } else {
                    z = false;
                }
                iva.b(z, "Too many place IDs specified in PlaceFilter. Maximum allowed is %d.", Integer.valueOf(g2));
                if (!placeFilter.f.isEmpty()) {
                    iva.b(placesParams.d != null, "PlaceFilter requires UserData but no account is specified.");
                }
            }
            PendingIntent service = PendingIntent.getService(context, 0, this.e, 134217728);
            PlaceRequest placeRequest = this.c;
            aduf aduf = new aduf();
            int i2 = placeRequest.c;
            if (i2 == 100 || i2 == 102 || i2 == 104) {
                i = 2;
            } else {
                i = 1;
            }
            aduf.a = i;
            aduf.a(15);
            aduf.c = placeRequest.f;
            aduf.b = true;
            aduf.a("unused");
            SemanticLocationEventRequest a = aduf.a();
            akxe akxe = this.g;
            PendingIntent pendingIntent = this.d;
            adut adut = akxe.a;
            adut.b((ihb) new adum(adut, a, service, pendingIntent)).a((acvp) new akxc(this));
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new nja(9004, e2.getMessage());
        }
    }

    public final void b(Status status) {
        alfs.a(status.i, status.j, this.f);
    }

    public final void a(Status status) {
        b(status);
    }
}
