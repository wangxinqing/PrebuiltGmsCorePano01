package defpackage;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: aktz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aktz extends akua {
    private final aktn a;
    private final aktj b;
    private final ClientContext c;
    private final int d;
    private final List e;
    private final LatLngBounds f;
    private final PlacesParams g;

    public aktz(aktn aktn, aktj aktj, ClientContext clientContext, LatLngBounds latLngBounds, int i, List list, PlacesParams placesParams) {
        this.a = aktn;
        this.b = aktj;
        this.c = clientContext;
        this.d = i;
        this.e = list;
        this.f = latLngBounds;
        this.g = placesParams;
    }

    public final /* bridge */ /* synthetic */ anui a(int i, long j, PlacesParams placesParams, Object obj) {
        aszo aszo = (aszo) obj;
        anui a2 = akua.a(12, aodm.a(i), j, this.g);
        aucd aucd = (aucd) a2.c(5);
        aucd.a((aucj) a2);
        aofn aofn = (aofn) aofo.e.o();
        int i2 = this.d;
        if (aofn.c) {
            aofn.c();
            aofn.c = false;
        }
        aofo aofo = (aofo) aofn.b;
        aofo.a |= 1;
        aofo.b = i2;
        if (this.e != null) {
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                aofn.a(akig.a((String) this.e.get(i3)));
            }
        }
        if (aszo != null) {
            aucd o = aofp.d.o();
            String a3 = akig.a(aszo.c);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aofp aofp = (aofp) o.b;
            a3.getClass();
            aofp.a |= 1;
            aofp.b = a3;
            int size = aszo.b.size();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aofp aofp2 = (aofp) o.b;
            aofp2.a |= 2;
            aofp2.c = size;
            aofn.a(o);
            for (int i4 = 0; i4 < aszo.d.size(); i4++) {
                aucd o2 = aofp.d.o();
                String a4 = akig.a(((aszn) aszo.d.get(i4)).b);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aofp aofp3 = (aofp) o2.b;
                a4.getClass();
                aofp3.a |= 1;
                aofp3.b = a4;
                int size2 = ((aszn) aszo.d.get(i4)).a.size();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aofp aofp4 = (aofp) o2.b;
                aofp4.a |= 2;
                aofp4.c = size2;
                aofn.a((aofp) o2.i());
            }
        }
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
        aofo aofo2 = (aofo) aofn.i();
        aofo2.getClass();
        aodn2.m = aofo2;
        aodn2.a |= 2048;
        aodn aodn3 = (aodn) aucd3.i();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aoei aoei2 = (aoei) aucd2.b;
        aodn3.getClass();
        aoei2.v = aodn3;
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
        if (TextUtils.isEmpty(this.g.d)) {
            aktn aktn = this.a;
            aszm a2 = akth.a(this.f, this.d, this.e);
            if (aktn.e == null) {
                aktn.e = baaj.a(baai.UNARY, "userlocation.SemanticLocationService/SearchByChain", baoq.a(aszm.e), baoq.a(aszo.e));
            }
            return (aszo) aktn.a.a(aktn.e, a2, 10000, TimeUnit.MILLISECONDS);
        }
        Account account = new Account(this.g.d, "com.google");
        ClientContext clientContext = new ClientContext(this.c);
        clientContext.d = account;
        clientContext.c = account;
        aktj aktj = this.b;
        aszm a3 = akth.a(this.f, this.d, this.e);
        long c2 = azda.c();
        if (aktj.b == null) {
            aktj.b = baaj.a(baai.UNARY, "userlocation.SemanticLocationService/SearchByChain", baoq.a(aszm.e), baoq.a(aszo.e));
        }
        return (aszo) aktj.a.a(aktj.b, clientContext, a3, c2, TimeUnit.MILLISECONDS);
    }
}
