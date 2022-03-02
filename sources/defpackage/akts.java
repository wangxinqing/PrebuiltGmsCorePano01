package defpackage;

import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: akts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akts implements Callable {
    private final aktg a;
    private final LatLngBounds b;
    private final int c;
    private final List d;
    private final PlacesParams e;

    public akts(aktg aktg, PlacesParams placesParams, LatLngBounds latLngBounds, int i, List list) {
        this.a = aktg;
        this.e = placesParams;
        this.b = latLngBounds;
        this.c = i;
        this.d = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        anaf anaf;
        aktg aktg = this.a;
        LatLngBounds latLngBounds = this.b;
        int i = this.c;
        List list = this.d;
        PlacesParams placesParams = this.e;
        aszo aszo = (aszo) aktg.a(new aktz(aktg.b, aktg.c, aktg.d, latLngBounds, i, list, placesParams), placesParams);
        if (aszo == null || (aszo.a & 1) == 0 || aszo.b.size() == 0) {
            anaf = anfu.b;
        } else {
            HashMap a2 = anet.a(aszo.b.size() + 1);
            ArrayList arrayList = new ArrayList(aszo.b.size());
            aucx aucx = aszo.b;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(akth.a((atak) aucx.get(i2)));
            }
            a2.put(aszo.c, arrayList);
            aucx aucx2 = aszo.d;
            int size2 = aucx2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                aszn aszn = (aszn) aucx2.get(i3);
                ArrayList arrayList2 = new ArrayList(aszn.a.size());
                aucx aucx3 = aszn.a;
                int size3 = aucx3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    arrayList2.add(akth.a((atak) aucx3.get(i4)));
                }
                a2.put(aszn.b, arrayList2);
            }
            anaf = anaf.a((Map) a2);
        }
        return new aktt(anaf);
    }
}
