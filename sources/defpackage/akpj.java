package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: akpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akpj {
    public final String a;
    public final List b;
    public final LatLngBounds c;
    final /* synthetic */ akpt d;
    private final long e;
    private boolean f = false;

    public akpj(akpt akpt, String str, List list, LatLngBounds latLngBounds, long j) {
        this.d = akpt;
        this.a = str;
        this.b = list;
        this.c = latLngBounds;
        this.e = j;
    }

    public final void a() {
        this.f = true;
    }

    public final void b() {
        if (this.d.h) {
            ArrayList arrayList = new ArrayList(this.b.size());
            ArrayList arrayList2 = new ArrayList(this.b.size());
            for (akpd akpd : this.b) {
                String str = akpd.b.c.c;
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                } else {
                    arrayList2.add(akpd);
                    if (Log.isLoggable("Places", 5)) {
                        String valueOf = String.valueOf(akpd);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 76);
                        sb.append("Places will not be fetched for subscription which does not filter by chain: ");
                        sb.append(valueOf);
                        Log.w("Places", sb.toString());
                    }
                }
            }
            this.d.a.removeAll(arrayList2);
            this.b.removeAll(arrayList2);
            if (!arrayList.isEmpty()) {
                PlacesParams placesParams = new PlacesParams("com.google.android.gms", Locale.getDefault(), this.a);
                if (azda.f()) {
                    this.d.e.a(new akts(this.d.d, placesParams, this.c, (int) azbk.h(), arrayList), new akpg(this));
                } else {
                    this.d.e.a(new aksn(this.d.c, placesParams, this.c, (int) azbk.h(), arrayList), new akpf(this));
                }
                if (azbe.b()) {
                    this.d.g.a(akig.a(akig.a((List) arrayList, placesParams)));
                }
            }
        }
    }

    public final void a(int i, Map map) {
        if (!this.f && this.d.h) {
            if (i == 0) {
                if (map.size() != this.b.size()) {
                    if (Log.isLoggable("Places", 6)) {
                        int size = this.b.size();
                        int size2 = map.size();
                        StringBuilder sb = new StringBuilder(105);
                        sb.append("Chains reported by Places Server do not match chains requested. Asked for ");
                        sb.append(size);
                        sb.append(" and got ");
                        sb.append(size2);
                        Log.e("Places", sb.toString());
                    }
                    long k = this.e * azbk.k();
                    for (akpd akpi : this.b) {
                        this.d.b.postDelayed(new akpi(this, akpi, k), this.e);
                    }
                    return;
                }
                for (akpd akpd : this.b) {
                    List list = (List) map.get(akpd.b.c.c);
                    if (this.d.a.contains(akpd)) {
                        this.d.a(list, akpd, false);
                    }
                }
            } else if (this.e > azbk.j()) {
                a();
                this.d.a.removeAll(this.b);
                if (Log.isLoggable("Places", 6)) {
                    StringBuilder sb2 = new StringBuilder(94);
                    sb2.append("Exceeded maximum network back off time, fetching nearby places failed with status: ");
                    sb2.append(i);
                    alfy.a("Places", sb2.toString());
                }
            } else {
                this.d.b.postDelayed(new akph(this, this.e * azbk.k()), this.e);
            }
        }
    }
}
