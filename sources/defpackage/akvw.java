package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import java.util.Collections;
import java.util.concurrent.TimeoutException;

/* renamed from: akvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvw extends akwd {
    private final LatLng b;
    private final PlaceFilter c;
    private final rka d;

    public akvw(LatLng latLng, PlaceFilter placeFilter, PlacesParams placesParams, rka rka, akuy akuy, akvn akvn, akhj akhj) {
        super(65, "GetPlaceByLatLng", placesParams, akuy, akvn, "", akhj);
        iva.a((Object) latLng);
        iva.a((Object) placeFilter);
        iva.a((Object) rka);
        this.b = latLng;
        this.c = placeFilter;
        this.d = rka;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 1;
    }

    public final aoei c() {
        return akig.a(this.c, this.a);
    }

    public final void a(Context context) {
        super.a(context);
        try {
            alfs.a(0, f().a(this.b, (int) azbe.a.a().h(), false, this.a, this.c), 108, this.d);
        } catch (VolleyError | eif | TimeoutException e) {
            throw akwd.a(e);
        }
    }

    public final void a(Status status) {
        alfs.a(status.i, Collections.emptyList(), 108, this.d);
    }
}
