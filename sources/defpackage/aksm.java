package defpackage;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: aksm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aksm implements Callable {
    private final aksc a;
    private final LatLngBounds b;
    private final int c;
    private final PlacesParams d;

    public aksm(aksc aksc, PlacesParams placesParams, LatLngBounds latLngBounds, int i) {
        this.a = aksc;
        this.d = placesParams;
        this.b = latLngBounds;
        this.c = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        aksc aksc = this.a;
        LatLngBounds latLngBounds = this.b;
        int i = this.c;
        PlacesParams placesParams = this.d;
        asrg asrg = (asrg) aksc.a((aktf) new aktb(aksc.e, aksc.a, aksc.c, aksc.d, latLngBounds, i, "searchByBeacon", placesParams), placesParams);
        Context context = aksc.a;
        if (asrg == null || asrg.b.size() == 0) {
            return new ArrayList();
        }
        asuv asuv = asrg.a;
        if (asuv == null) {
            asuv = asuv.c;
        }
        aksd.a(context, asuv);
        ArrayList arrayList = new ArrayList(asrg.b.size());
        for (int i2 = 0; i2 < asrg.b.size(); i2++) {
            arrayList.add(aksd.a((asuf) asrg.b.get(i2)));
        }
        return arrayList;
    }
}
