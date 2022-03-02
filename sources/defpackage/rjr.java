package defpackage;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.PlacesClientIdentifier;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: rjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface rjr extends IInterface {
    void a(NearbyAlertRequest nearbyAlertRequest, PlacesParams placesParams, PendingIntent pendingIntent, rka rka);

    void a(PlaceFilter placeFilter, PlacesParams placesParams, rka rka);

    void a(PlaceReport placeReport, PlacesParams placesParams, rka rka);

    void a(PlaceRequest placeRequest, PlacesParams placesParams, PendingIntent pendingIntent, rka rka);

    void a(PlacesClientIdentifier placesClientIdentifier, PlacesParams placesParams, ifu ifu);

    void a(PlacesClientIdentifier placesClientIdentifier, PlacesParams placesParams, rka rka);

    void a(PlacefencingRequest placefencingRequest, PlacesParams placesParams, PendingIntent pendingIntent, rka rka);

    void a(PlacesParams placesParams, PendingIntent pendingIntent, rka rka);

    void a(PlacesParams placesParams, String str, rka rka);

    void a(ifu ifu);

    void b(PlacesParams placesParams, PendingIntent pendingIntent, rka rka);
}
