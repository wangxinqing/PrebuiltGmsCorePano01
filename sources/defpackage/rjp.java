package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.PlacesClientIdentifier;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: rjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rjp extends bhv implements rjr {
    public rjp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
    }

    public final void a(NearbyAlertRequest nearbyAlertRequest, PlacesParams placesParams, PendingIntent pendingIntent, rka rka) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) nearbyAlertRequest);
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (Parcelable) pendingIntent);
        bhx.a(aQ, (IInterface) rka);
        b(4, aQ);
    }

    public final void a(PlaceReport placeReport, PlacesParams placesParams, rka rka) {
        throw null;
    }

    public final void a(PlacesClientIdentifier placesClientIdentifier, PlacesParams placesParams, rka rka) {
        throw null;
    }

    public final void a(PlacefencingRequest placefencingRequest, PlacesParams placesParams, PendingIntent pendingIntent, rka rka) {
        throw null;
    }

    public final void a(PlacesParams placesParams, String str, rka rka) {
        throw null;
    }

    public final void a(ifu ifu) {
        throw null;
    }

    public final void b(PlacesParams placesParams, PendingIntent pendingIntent, rka rka) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (Parcelable) pendingIntent);
        bhx.a(aQ, (IInterface) rka);
        b(5, aQ);
    }

    public final void a(PlaceFilter placeFilter, PlacesParams placesParams, rka rka) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) placeFilter);
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (IInterface) rka);
        b(6, aQ);
    }

    public final void a(PlaceRequest placeRequest, PlacesParams placesParams, PendingIntent pendingIntent, rka rka) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) placeRequest);
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (Parcelable) pendingIntent);
        bhx.a(aQ, (IInterface) rka);
        b(2, aQ);
    }

    public final void a(PlacesClientIdentifier placesClientIdentifier, PlacesParams placesParams, ifu ifu) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) placesClientIdentifier);
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (IInterface) ifu);
        b(11, aQ);
    }

    public final void a(PlacesParams placesParams, PendingIntent pendingIntent, rka rka) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (Parcelable) pendingIntent);
        bhx.a(aQ, (IInterface) rka);
        b(3, aQ);
    }
}
