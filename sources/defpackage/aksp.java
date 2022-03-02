package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: aksp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aksp implements Callable {
    private final aksc a;
    private final LatLngBounds b;
    private final int c;
    private final String d;
    private final UserLocationNearbyAlertFilter e;
    private final PlacesParams f;

    public aksp(aksc aksc, PlacesParams placesParams, LatLngBounds latLngBounds, int i, String str, UserLocationNearbyAlertFilter userLocationNearbyAlertFilter) {
        this.a = aksc;
        this.f = placesParams;
        this.b = latLngBounds;
        this.c = i;
        this.d = str;
        this.e = userLocationNearbyAlertFilter;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        List list;
        aksc aksc = this.a;
        LatLngBounds latLngBounds = this.b;
        int i = this.c;
        String str = this.d;
        List list2 = this.e.b;
        PlacesParams placesParams = this.f;
        asuz asuz = (asuz) aksc.a((aktf) new akte(aksc.e, aksc.a, aksc.c, aksc.d, latLngBounds, i, str, list2, false, "search", placesParams), placesParams);
        Context context = aksc.a;
        if (asuz == null || asuz.b.size() == 0) {
            return new ArrayList();
        }
        asuv asuv = asuz.a;
        if (asuv == null) {
            asuv = asuv.c;
        }
        aksd.a(context, asuv);
        ArrayList arrayList = new ArrayList(asuz.b.size());
        for (int i2 = 0; i2 < asuz.b.size(); i2++) {
            assu assu = (assu) asuz.b.get(i2);
            akri akri = null;
            if (assu != null) {
                int i3 = assu.a;
                if ((i3 & 1) != 0) {
                    if ((i3 & 32) != 0) {
                        assw assw = assu.i;
                        if (assw == null) {
                            assw = assw.d;
                        }
                        if ((assw.a & 1) != 0) {
                            String str2 = assu.b;
                            int size = assu.c.size();
                            List arrayList2 = new ArrayList(size);
                            if (size != 0) {
                                aucx aucx = assu.c;
                                int size2 = aucx.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    arrayList2.add(Integer.valueOf(akic.a((String) aucx.get(i4))));
                                }
                                list = arrayList2;
                            } else {
                                if (Log.isLoggable("Places", 5)) {
                                    alfy.c("Places", "place is missing type. Defaulting to 'other'");
                                }
                                list = Collections.singletonList(0);
                            }
                            assw assw2 = assu.i;
                            if (assw2 == null) {
                                assw2 = assw.d;
                            }
                            avoq avoq = assw2.b;
                            if (avoq == null) {
                                avoq = avoq.c;
                            }
                            LatLng a2 = aksd.a(avoq);
                            akri = new akri(str2, a2.a, a2.b, 80.0f, list);
                        } else if (Log.isLoggable("Places", 6)) {
                            alfy.a("Places", "received place lacks latlng");
                        }
                    } else if (Log.isLoggable("Places", 6)) {
                        alfy.a("Places", "received place lacks geometry");
                    }
                } else if (Log.isLoggable("Places", 6)) {
                    alfy.a("Places", "received place lacks id");
                }
            } else if (Log.isLoggable("Places", 6)) {
                alfy.a("Places", "received null place");
            }
            arrayList.add(akri);
        }
        return arrayList;
    }
}
