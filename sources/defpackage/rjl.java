package defpackage;

import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: rjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rjl {
    public static final icf a(icc icc) {
        return icc.a((idf) new rji(rij.a, icc));
    }

    public static final icf a(icc icc, LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter) {
        boolean z;
        iva.a((Object) latLngBounds, (Object) "bounds == null");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "maxResults <= 0");
        return icc.a((idf) new rjh(rij.a, icc, latLngBounds, str, i, placeFilter));
    }

    public static final icf a(icc icc, String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter) {
        return icc.a((idf) new rik(rij.a, icc, str, latLngBounds, autocompleteFilter));
    }

    public static final icf a(icc icc, String... strArr) {
        boolean z;
        boolean z2;
        if (strArr != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "placeIds == null");
        int length = strArr.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2, "placeIds is empty");
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            iva.b(str != null, "placeId == null");
            iva.b(!str.isEmpty(), "placeId is empty");
        }
        return icc.a((idf) new rjg(rij.a, icc, strArr));
    }
}
