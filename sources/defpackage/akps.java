package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: akps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akps {
    public final akpd a;
    public final LatLngBounds b;
    public final long c;
    final /* synthetic */ akpt d;
    private boolean e;
    private final aksb f = new akpq(this);
    private final akpr g = new akpr(this);

    public akps(akpt akpt, akpd akpd, LatLngBounds latLngBounds, long j) {
        this.d = akpt;
        this.a = akpd;
        this.b = latLngBounds;
        this.c = j;
        this.e = false;
    }

    public final void a() {
        this.e = true;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        String str;
        if (this.d.h) {
            UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = this.a.b.c;
            if (!userLocationNearbyAlertFilter.a.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(userLocationNearbyAlertFilter.a);
                akhw akhw = this.d.f;
                PlacesParams placesParams = PlacesParams.a;
                akpr akpr = this.g;
                riq riq = new riq();
                riq.d = placesParams.d;
                riq.a = placesParams.b;
                riq.c = placesParams.g;
                rij.b(akhw.a, riq.a()).a((String[]) arrayList.toArray(new String[arrayList.size()])).a(akhw.b, (acvp) new akhv(akpr));
                if (azbe.b()) {
                    this.d.g.a(akig.a(akig.a(arrayList.size(), 2, PlacesParams.a)));
                }
            } else if (userLocationNearbyAlertFilter.c != null) {
                if (!azbt.b() || TextUtils.isEmpty(this.a.a().d)) {
                    str = "";
                } else {
                    str = this.a.a().d;
                }
                PlacesParams placesParams2 = new PlacesParams("com.google.android.gms", Locale.getDefault(), str);
                List singletonList = Collections.singletonList(userLocationNearbyAlertFilter.c);
                if (azda.f()) {
                    this.d.e.a(new akts(this.d.d, placesParams2, this.b, (int) azbk.h(), singletonList), new akpo(this));
                } else {
                    this.d.e.a(new aksn(this.d.c, placesParams2, this.b, (int) azbk.h(), singletonList), new akpn(this));
                }
                if (azbe.b()) {
                    this.d.g.a(akig.a(akig.a(singletonList, placesParams2)));
                }
            } else if (userLocationNearbyAlertFilter.d) {
                if (azda.a.a().i()) {
                    this.d.e.a(new aktr(this.d.d, PlacesParams.a, this.b, (int) azbk.h()), new aktl(this));
                } else {
                    this.d.e.a(new aksm(this.d.c, PlacesParams.a, this.b, (int) azbk.h()), new aksg(this));
                }
                if (azbe.b()) {
                    int h = (int) azbk.h();
                    PlacesParams placesParams3 = PlacesParams.a;
                    aoei c2 = akig.c(1, placesParams3);
                    aucd aucd = (aucd) c2.c(5);
                    aucd.a((aucj) c2);
                    aofe a2 = akig.a(11, placesParams3.c, Locale.getDefault().toString());
                    aucd aucd2 = (aucd) a2.c(5);
                    aucd2.a((aucj) a2);
                    aucd o = aoff.c.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aoff aoff = (aoff) o.b;
                    aoff.a |= 1;
                    aoff.b = h;
                    aoff aoff2 = (aoff) o.i();
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    aofe aofe = (aofe) aucd2.b;
                    aofe aofe2 = aofe.s;
                    aoff2.getClass();
                    aofe.n = aoff2;
                    aofe.a |= 16384;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    aoei aoei = (aoei) aucd.b;
                    aofe aofe3 = (aofe) aucd2.i();
                    aoei aoei2 = aoei.w;
                    aofe3.getClass();
                    aoei.i = aofe3;
                    aoei.a |= 64;
                    this.d.g.a(akig.a((aoei) aucd.i()));
                }
            } else {
                this.d.e.a(new aksp(this.d.c, PlacesParams.a, this.b, (int) azbk.h(), "*", userLocationNearbyAlertFilter), this.f);
                if (azbe.b()) {
                    PlacesParams placesParams4 = PlacesParams.a;
                    aoei c3 = akig.c(1, placesParams4);
                    aucd aucd3 = (aucd) c3.c(5);
                    aucd3.a((aucj) c3);
                    aofe a3 = akig.a(2, placesParams4.c, Locale.getDefault().toString());
                    aucd aucd4 = (aucd) a3.c(5);
                    aucd4.a((aucj) a3);
                    aucd o2 = aofj.d.o();
                    aodr a4 = akig.a((Collection) userLocationNearbyAlertFilter.b, false);
                    if (aucd4.c) {
                        aucd4.c();
                        aucd4.c = false;
                    }
                    aofe aofe4 = (aofe) aucd4.b;
                    aofe aofe5 = aofe.s;
                    a4.getClass();
                    aofe4.e = a4;
                    aofe4.a |= 8;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aofj aofj = (aofj) o2.b;
                    aofj.c = 1;
                    aofj.a |= 16;
                    if (aucd4.c) {
                        aucd4.c();
                        aucd4.c = false;
                    }
                    aofe aofe6 = (aofe) aucd4.b;
                    aofj aofj2 = (aofj) o2.i();
                    aofj2.getClass();
                    aofe6.f = aofj2;
                    aofe6.a |= 16;
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    aoei aoei3 = (aoei) aucd3.b;
                    aofe aofe7 = (aofe) aucd4.i();
                    aoei aoei4 = aoei.w;
                    aofe7.getClass();
                    aoei3.i = aofe7;
                    aoei3.a |= 64;
                    this.d.g.a(akig.a((aoei) aucd3.i()));
                }
            }
        }
    }

    public final void a(int i, List list) {
        if (!this.e) {
            akpt akpt = this.d;
            if (akpt.h && akpt.a.contains(this.a)) {
                if (i == 0) {
                    this.d.a(list, this.a, false);
                } else if (this.c > azbk.j()) {
                    a();
                    this.d.a.remove(this.a);
                    if (Log.isLoggable("Places", 6)) {
                        StringBuilder sb = new StringBuilder(93);
                        sb.append("Exceeded maximum network backoff time, fetching nearby places failed with status: ");
                        sb.append(i);
                        alfy.a("Places", sb.toString());
                    }
                } else {
                    this.d.b.postDelayed(new akpp(this), this.c);
                }
            }
        }
    }

    public final void a(int i, Map map) {
        if (i != 0) {
            a(i, (List) amzy.h());
        } else if (map.size() != 1) {
            alfy.a("Places", "Chains reported by Semantic Location Server do not match chains requested");
            a(0, (List) amzy.h());
        } else {
            a(0, (List) map.values().iterator().next());
        }
    }
}
