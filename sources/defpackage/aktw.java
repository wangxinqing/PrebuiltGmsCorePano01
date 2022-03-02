package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: aktw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aktw extends akua {
    private final aktj a;
    private final ClientContext b;
    private final String c;

    public aktw(aktj aktj, ClientContext clientContext, String str) {
        this.a = aktj;
        this.b = clientContext;
        this.c = str;
    }

    public final /* bridge */ /* synthetic */ anui a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        aszv aszv = (aszv) obj;
        anui a2 = akua.a(5, aodm.a(i), j, placesParams);
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
        aodn2.b = 4;
        aodn2.a |= 1;
        aocy aocy = (aocy) aocz.d.o();
        aocy.a(aocx.HOME);
        aocy.a(aocx.WORK);
        if (aszv != null) {
            i2 = aszv.a.size();
        } else {
            i2 = 0;
        }
        if (aocy.c) {
            aocy.c();
            aocy.c = false;
        }
        aocz aocz = (aocz) aocy.b;
        aocz.a |= 1;
        aocz.c = i2;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        aodn aodn3 = (aodn) aucd3.b;
        aocz aocz2 = (aocz) aocy.i();
        aocz2.getClass();
        aodn3.h = aocz2;
        aodn3.a |= 64;
        aodn aodn4 = (aodn) aucd3.i();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aoei aoei2 = (aoei) aucd2.b;
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
        aktj aktj = this.a;
        ClientContext clientContext = this.b;
        String str = this.c;
        aszt aszt = (aszt) aszu.d.o();
        if (aszt.c) {
            aszt.c();
            aszt.c = false;
        }
        aszu aszu = (aszu) aszt.b;
        str.getClass();
        aszu.a |= 1;
        aszu.b = str;
        aszt.a(atab.CONFIRMED_HOME);
        aszt.a(atab.CONFIRMED_WORK);
        return aktj.a(clientContext, (aszu) aszt.i(), azda.c());
    }
}
