package defpackage;

import android.os.IInterface;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: rju  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface rju extends IInterface {
    void a(AddPlaceRequest addPlaceRequest, PlacesParams placesParams, rka rka);

    void a(UserDataType userDataType, PlacesParams placesParams, rka rka);

    void a(PlacesParams placesParams, rka rka);

    void a(PlacesParams placesParams, rla rla);

    void a(PlacesParams placesParams, rld rld);

    void a(LatLng latLng, PlaceFilter placeFilter, PlacesParams placesParams, rka rka);

    void a(LatLng latLng, PlacesParams placesParams, rka rka);

    void a(LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter, PlacesParams placesParams, rka rka);

    void a(String str, int i, int i2, int i3, PlacesParams placesParams, rjx rjx);

    void a(String str, PlacesParams placesParams, rjx rjx);

    void a(String str, PlacesParams placesParams, rla rla);

    void a(String str, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, rka rka);

    void a(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, rka rka);

    void a(String str, String str2, String str3, PlacesParams placesParams, rla rla);

    void a(List list, PlacesParams placesParams, rka rka);

    void b(PlacesParams placesParams, rka rka);

    void b(PlacesParams placesParams, rla rla);
}
