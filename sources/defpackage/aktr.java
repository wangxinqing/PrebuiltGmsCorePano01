package defpackage;

import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: aktr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aktr implements Callable {
    private final aktg a;
    private final LatLngBounds b;
    private final int c;
    private final PlacesParams d;

    public aktr(aktg aktg, PlacesParams placesParams, LatLngBounds latLngBounds, int i) {
        this.a = aktg;
        this.d = placesParams;
        this.b = latLngBounds;
        this.c = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        aktg aktg = this.a;
        LatLngBounds latLngBounds = this.b;
        int i = this.c;
        aszl aszl = (aszl) aktg.a(new akty(aktg.b, latLngBounds, i), this.d);
        if (aszl == null || aszl.a.size() == 0) {
            return amzy.h();
        }
        ArrayList arrayList = new ArrayList(aszl.a.size());
        for (int i2 = 0; i2 < aszl.a.size(); i2++) {
            arrayList.add(akth.a((atak) aszl.a.get(i2)));
        }
        return amzy.a((Collection) arrayList);
    }
}
