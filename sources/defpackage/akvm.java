package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.PlacesClientIdentifier;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.service.TransformNearbyAlertIntentOperation;
import com.google.android.places.service.TransformSemanticLocationEventIntentOperation;

/* renamed from: akvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvm extends rjq implements niz {
    private final nix a;
    private final akuy b;
    private final akvn c;
    private final akhj d;

    public akvm(akvn akvn, akuy akuy, nix nix, akhj akhj) {
        this.c = akvn;
        this.b = akuy;
        this.a = nix;
        this.d = akhj;
    }

    private final void a(PlacesParams placesParams, akwg akwg, String str) {
        this.a.a(new akwm(placesParams, this.b, this.c, akwg, str, this.d));
    }

    public final void b(PlacesParams placesParams, PendingIntent pendingIntent, rka rka) {
        if (a(pendingIntent, placesParams)) {
            this.a.a(new akwu(pendingIntent, akxf.a(this.b.a, placesParams.b, placesParams.d), placesParams, rka, this.b, this.c, this.d));
            return;
        }
        a(rka);
    }

    private static void a(rka rka) {
        alfs.a(9004, "The supplied PendingIntent was not created by your application.", rka);
    }

    private final boolean a(PendingIntent pendingIntent, PlacesParams placesParams) {
        return this.b.b.equals("com.google.android.gms") || pendingIntent.getTargetPackage().equals(placesParams.b);
    }

    public final void a(NearbyAlertRequest nearbyAlertRequest, PlacesParams placesParams, PendingIntent pendingIntent, rka rka) {
        PlacesParams placesParams2 = placesParams;
        Intent startIntent = IntentOperation.getStartIntent(this.b.a, TransformNearbyAlertIntentOperation.class, "com.google.android.places.service.ACTION_NEARBY_ALERT_EVENT");
        startIntent.setPackage("com.google.android.gms");
        this.a.a(new akxb(nearbyAlertRequest, startIntent, pendingIntent, akxf.a(this.b.a, placesParams2.b, placesParams2.d), placesParams2, rka, this.b, this.c, this.d));
    }

    public final void a(PlaceFilter placeFilter, PlacesParams placesParams, rka rka) {
        a(placesParams, (akwg) new akwi(this.d, placeFilter, rka), "GetCurrentPlace");
    }

    public final void a(PlaceReport placeReport, PlacesParams placesParams, rka rka) {
        a(placesParams, (akwg) new akwz(placeReport, rka), "ReportDeviceAtPlace");
    }

    public final void a(PlaceRequest placeRequest, PlacesParams placesParams, PendingIntent pendingIntent, rka rka) {
        PlacesParams placesParams2 = placesParams;
        Intent startIntent = IntentOperation.getStartIntent(this.b.a, TransformSemanticLocationEventIntentOperation.class, "com.google.android.places.service.ACTION_SEMANTIC_LOCATION_EVENT");
        startIntent.setPackage("com.google.android.gms");
        this.a.a(new akxd(placeRequest, startIntent, pendingIntent, akxf.a(this.b.a, placesParams2.b, placesParams2.d), rka, placesParams2, this.b, this.c, this.d));
    }

    public final void a(PlacesClientIdentifier placesClientIdentifier, PlacesParams placesParams, ifu ifu) {
        a(placesParams, (akwg) new akwk(placesClientIdentifier, ifu), "HasPersonalizedDataAccess");
    }

    @Deprecated
    public final void a(PlacesClientIdentifier placesClientIdentifier, PlacesParams placesParams, rka rka) {
        a(placesParams, (akwg) new akwk(placesClientIdentifier, rka), "HasPersonalizedDataAccess");
    }

    public final void a(PlacefencingRequest placefencingRequest, PlacesParams placesParams, PendingIntent pendingIntent, rka rka) {
        if (a(pendingIntent, placesParams)) {
            this.a.a(new akwo(placefencingRequest, pendingIntent, akxf.a(this.b.a, placesParams.b, placesParams.d), placesParams, rka, this.b, this.c, this.d));
            return;
        }
        a(rka);
    }

    public final void a(PlacesParams placesParams, PendingIntent pendingIntent, rka rka) {
        this.a.a(new akww(pendingIntent, akxf.a(this.b.a, placesParams.b, placesParams.d), rka, placesParams, this.b, this.c, this.d));
    }

    public final void a(PlacesParams placesParams, String str, rka rka) {
        this.a.a(new akwq(str, akxf.a(this.b.a, placesParams.b, placesParams.d), placesParams, rka, this.b, this.c, this.d));
    }

    public final void a(ifu ifu) {
        ifu.a(Status.f);
    }
}
