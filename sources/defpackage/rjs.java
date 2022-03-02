package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: rjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rjs extends bhv implements rju {
    public rjs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IGooglePlacesService");
    }

    public final void a(AddPlaceRequest addPlaceRequest, PlacesParams placesParams, rka rka) {
        throw null;
    }

    public final void a(UserDataType userDataType, PlacesParams placesParams, rka rka) {
        throw null;
    }

    public final void a(LatLng latLng, PlaceFilter placeFilter, PlacesParams placesParams, rka rka) {
        throw null;
    }

    public final void a(LatLng latLng, PlacesParams placesParams, rka rka) {
        throw null;
    }

    public final void a(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, rka rka) {
        throw null;
    }

    public final void b(PlacesParams placesParams, rka rka) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (IInterface) rka);
        b(26, aQ);
    }

    public final void b(PlacesParams placesParams, rla rla) {
        throw null;
    }

    public final void a(PlacesParams placesParams, rka rka) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (IInterface) rka);
        b(23, aQ);
    }

    public final void a(PlacesParams placesParams, rla rla) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (IInterface) rla);
        b(24, aQ);
    }

    public final void a(PlacesParams placesParams, rld rld) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (IInterface) rld);
        b(27, aQ);
    }

    public final void a(LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter, PlacesParams placesParams, rka rka) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) latLngBounds);
        aQ.writeInt(i);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) placeFilter);
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (IInterface) rka);
        b(2, aQ);
    }

    public final void a(String str, int i, int i2, int i3, PlacesParams placesParams, rjx rjx) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        aQ.writeInt(i);
        aQ.writeInt(i2);
        aQ.writeInt(i3);
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (IInterface) rjx);
        b(20, aQ);
    }

    public final void a(String str, PlacesParams placesParams, rjx rjx) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (IInterface) rjx);
        b(19, aQ);
    }

    public final void a(String str, PlacesParams placesParams, rla rla) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        aQ.writeString((String) null);
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (IInterface) rla);
        b(21, aQ);
    }

    public final void a(String str, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, rka rka) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) latLngBounds);
        aQ.writeInt(1);
        bhx.a(aQ, (Parcelable) autocompleteFilter);
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (IInterface) rka);
        b(28, aQ);
    }

    public final void a(String str, String str2, String str3, PlacesParams placesParams, rla rla) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (IInterface) rla);
        b(16, aQ);
    }

    public final void a(List list, PlacesParams placesParams, rka rka) {
        Parcel aQ = aQ();
        aQ.writeStringList(list);
        bhx.a(aQ, (Parcelable) placesParams);
        bhx.a(aQ, (IInterface) rka);
        b(17, aQ);
    }
}
