package defpackage;

import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.TimeUnit;

/* renamed from: akty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akty extends akua {
    private final int a;
    private final aktn b;
    private final LatLngBounds c;

    public akty(aktn aktn, LatLngBounds latLngBounds, int i) {
        this.b = aktn;
        this.c = latLngBounds;
        this.a = i;
    }

    public final /* bridge */ /* synthetic */ anui a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        aszl aszl = (aszl) obj;
        anui a2 = akua.a(11, aodm.a(i), j, placesParams);
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        aoei aoei = ((anui) aucd.b).c;
        if (aoei == null) {
            aoei = aoei.w;
        }
        aucd aucd2 = (aucd) aoei.c(5);
        aucd2.a((aucj) aoei);
        aodn aodn = ((aoei) aucd2.b).v;
        if (aodn == null) {
            aodn = aodn.q;
        }
        aucd aucd3 = (aucd) aodn.c(5);
        aucd3.a((aucj) aodn);
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        aodn aodn2 = (aodn) aucd3.b;
        aodn2.b = 10;
        aodn2.a |= 1;
        aucd o = aofm.d.o();
        int i3 = this.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aofm aofm = (aofm) o.b;
        aofm.a |= 1;
        aofm.b = i3;
        if (aszl != null) {
            i2 = aszl.a.size();
        } else {
            i2 = 0;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aofm aofm2 = (aofm) o.b;
        aofm2.a |= 2;
        aofm2.c = i2;
        aofm aofm3 = (aofm) o.i();
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        aodn aodn3 = (aodn) aucd3.b;
        aofm3.getClass();
        aodn3.j = aofm3;
        aodn3.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aoei aoei2 = (aoei) aucd2.b;
        aodn aodn4 = (aodn) aucd3.i();
        aodn4.getClass();
        aoei2.v = aodn4;
        aoei2.a |= 8388608;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anui anui = (anui) aucd.b;
        aoei aoei3 = (aoei) aucd2.i();
        anui anui2 = anui.p;
        aoei3.getClass();
        anui.c = aoei3;
        anui.a |= 2;
        return (anui) aucd.i();
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aktn aktn = this.b;
        LatLngBounds latLngBounds = this.c;
        int i = this.a;
        aucd o = aszk.d.o();
        aszw a2 = akth.a(latLngBounds);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aszk aszk = (aszk) o.b;
        a2.getClass();
        aszk.b = a2;
        int i2 = aszk.a | 1;
        aszk.a = i2;
        aszk.a = i2 | 2;
        aszk.c = i;
        aszk aszk2 = (aszk) o.i();
        long c2 = azda.c();
        if (aktn.f == null) {
            aktn.f = baaj.a(baai.UNARY, "userlocation.SemanticLocationService/SearchByBeacon", baoq.a(aszk.d), baoq.a(aszl.b));
        }
        return (aszl) aktn.a.a(aktn.f, aszk2, c2, TimeUnit.MILLISECONDS);
    }
}
