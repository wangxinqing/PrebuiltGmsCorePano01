package defpackage;

import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: akhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akhp {
    public static PlaceEntity a(String str, double d, double d2, List list) {
        Locale locale = Locale.getDefault();
        LatLng latLng = new LatLng(d, d2);
        LatLngBounds latLngBounds = new LatLngBounds(latLng, latLng);
        rkj rkj = new rkj();
        rkj.a = str;
        rkj.c = latLng;
        rkj.e = latLngBounds;
        rkj.b = str;
        rkj.k = new ArrayList(list);
        PlaceEntity a = rkj.a();
        a.r = locale;
        return a;
    }
}
