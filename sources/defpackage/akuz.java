package defpackage;

import android.content.Context;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.places.service.GeoDataChimeraService;
import java.util.List;

/* renamed from: akuz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akuz extends rjt implements niz {
    private final akuy a;
    private final nix b;
    private final GeoDataChimeraService c;
    private final akvn d;
    private final akhj e;

    public akuz(GeoDataChimeraService geoDataChimeraService, nix nix, Context context, String str, akvn akvn, aoru aoru) {
        this.a = new akuy(context, str);
        iva.a((Object) nix);
        this.b = nix;
        this.c = geoDataChimeraService;
        this.d = akvn;
        this.e = new akhj(context, new hol(context.getApplicationContext(), "LE", (String) null), 1, aoru);
    }

    public final void a(AddPlaceRequest addPlaceRequest, PlacesParams placesParams, rka rka) {
        this.b.a(new akvo(addPlaceRequest, placesParams, rka, this.a, this.d, this.e));
    }

    public final void b(PlacesParams placesParams, rka rka) {
        this.b.a(new akvp(placesParams, rka, this.a, this.d, this.e));
    }

    @Deprecated
    public final void a(UserDataType userDataType, PlacesParams placesParams, rka rka) {
        this.b.a(new akvx(userDataType, placesParams, rka, this.a, this.d, this.e));
    }

    public final void b(PlacesParams placesParams, rla rla) {
        this.b.a(new akvs(placesParams, rla, this.a, this.d, this.e));
    }

    public final void a(PlacesParams placesParams, rka rka) {
        this.b.a(new akwb(placesParams, rka, this.a, this.d, this.e));
    }

    public final void a(PlacesParams placesParams, rla rla) {
        this.b.a(new akvz(placesParams, rla, this.a, this.d, this.e));
    }

    public final void a(PlacesParams placesParams, rld rld) {
        this.b.a(new akwa(placesParams, rld, this.a, this.d, this.e));
    }

    public final void a(LatLng latLng, PlaceFilter placeFilter, PlacesParams placesParams, rka rka) {
        this.b.a(new akvw(latLng, placeFilter, placesParams, rka, this.a, this.d, this.e));
    }

    public final void a(LatLng latLng, PlacesParams placesParams, rka rka) {
        this.b.a(new akvy(latLng, placesParams, rka, this.a, this.d, this.e));
    }

    public final void a(LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter, PlacesParams placesParams, rka rka) {
        this.b.a(new akwe(latLngBounds, i, str, placeFilter, placesParams, rka, this.a, this.d, this.e));
    }

    public final void a(String str, int i, int i2, int i3, PlacesParams placesParams, rjx rjx) {
        this.b.a(new akvt(str, i, i2, i3, placesParams, rjx, this.a, this.d, this.c, this.e));
    }

    public final void a(String str, PlacesParams placesParams, rjx rjx) {
        this.b.a(new akvu(str, placesParams, rjx, this.a, this.d, this.e));
    }

    public final void a(String str, PlacesParams placesParams, rla rla) {
        this.b.a(new akvq(str, placesParams, rla, this.a, this.d, this.e));
    }

    public final void a(String str, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, rka rka) {
        this.b.a(new akvr(str, latLngBounds, i, autocompleteFilter, placesParams, rka, this.a, this.d, this.c, this.e));
    }

    @Deprecated
    public final void a(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, rka rka) {
        a(str, latLngBounds, 1, autocompleteFilter, placesParams, rka);
    }

    public final void a(String str, String str2, String str3, PlacesParams placesParams, rla rla) {
        this.b.a(new akwf(str, str2, str3, placesParams, rla, this.a, this.d, this.e));
    }

    public final void a(List list, PlacesParams placesParams, rka rka) {
        this.b.a(new akvv(list, placesParams, rka, this.a, this.d, this.c, this.e));
    }
}
