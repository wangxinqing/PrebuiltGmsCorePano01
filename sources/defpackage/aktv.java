package defpackage;

import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: aktv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aktv extends akua {
    private final List a;
    private final aktn b;

    public aktv(aktn aktn, List list) {
        this.b = aktn;
        this.a = list;
    }

    public final /* bridge */ /* synthetic */ anui a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        aszz aszz = (aszz) obj;
        anui a2 = akua.a(7, aodm.a(i), j, placesParams);
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
        aodn2.b = 6;
        aodn2.a |= 1;
        aucd o = aodc.d.o();
        int size = this.a.size();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aodc aodc = (aodc) o.b;
        aodc.a |= 1;
        aodc.b = size;
        if (aszz != null) {
            i2 = aszz.a.size();
        } else {
            i2 = 0;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aodc aodc2 = (aodc) o.b;
        aodc2.a |= 2;
        aodc2.c = i2;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        aodn aodn3 = (aodn) aucd3.b;
        aodc aodc3 = (aodc) o.i();
        aodc3.getClass();
        aodn3.l = aodc3;
        aodn3.a |= 1024;
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
        List list = this.a;
        aucd o = aszy.b.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aszy aszy = (aszy) o.b;
        if (!aszy.a.a()) {
            aszy.a = aucj.a(aszy.a);
        }
        auab.a((Iterable) list, (List) aszy.a);
        aszy aszy2 = (aszy) o.i();
        long c = azda.c();
        if (aktn.d == null) {
            aktn.d = baaj.a(baai.UNARY, "userlocation.SemanticLocationService/GetNearbyAlertDataById", baoq.a(aszy.b), baoq.a(aszz.b));
        }
        return (aszz) aktn.a.a(aktn.d, aszy2, c, TimeUnit.MILLISECONDS);
    }
}
