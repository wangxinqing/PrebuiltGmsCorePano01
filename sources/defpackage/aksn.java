package defpackage;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: aksn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aksn implements Callable {
    private final aksc a;
    private final LatLngBounds b;
    private final int c;
    private final List d;
    private final PlacesParams e;

    public aksn(aksc aksc, PlacesParams placesParams, LatLngBounds latLngBounds, int i, List list) {
        this.a = aksc;
        this.e = placesParams;
        this.b = latLngBounds;
        this.c = i;
        this.d = list;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        HashMap hashMap;
        aksc aksc = this.a;
        LatLngBounds latLngBounds = this.b;
        int i = this.c;
        List list = this.d;
        PlacesParams placesParams = this.e;
        asrj asrj = (asrj) aksc.a((aktf) new aktc(aksc.e, aksc.a, aksc.b, aksc.c, aksc.d, latLngBounds, i, list, "searchByChain", placesParams), placesParams);
        Context context = aksc.a;
        if (asrj == null || (asrj.a & 2) == 0 || asrj.c.size() == 0) {
            hashMap = new HashMap();
        } else {
            asuv asuv = asrj.b;
            if (asuv == null) {
                asuv = asuv.c;
            }
            aksd.a(context, asuv);
            hashMap = new HashMap(asrj.c.size() + 1);
            ArrayList arrayList = new ArrayList(asrj.c.size());
            aucx aucx = asrj.c;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(aksd.a((asuf) aucx.get(i2)));
            }
            hashMap.put(asrj.d, arrayList);
            aucx aucx2 = asrj.e;
            int size2 = aucx2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                asri asri = (asri) aucx2.get(i3);
                ArrayList arrayList2 = new ArrayList(asri.a.size());
                aucx aucx3 = asri.a;
                int size3 = aucx3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    arrayList2.add(aksd.a((asuf) aucx3.get(i4)));
                }
                hashMap.put(asri.b, arrayList2);
            }
        }
        return new aksq(hashMap);
    }
}
