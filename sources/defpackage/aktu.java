package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import java.util.concurrent.TimeUnit;

/* renamed from: aktu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aktu extends akua {
    private final aktn a;
    private final aktj b;
    private final Context c;
    private final ClientContext d;
    private final LatLng e;
    private final int f;
    private final PlacesParams g;

    public aktu(aktn aktn, aktj aktj, Context context, ClientContext clientContext, LatLng latLng, int i, PlacesParams placesParams) {
        this.a = aktn;
        this.b = aktj;
        this.c = context;
        this.d = clientContext;
        this.f = i;
        this.e = latLng;
        this.g = placesParams;
    }

    public final /* bridge */ /* synthetic */ anui a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        aszs aszs = (aszs) obj;
        anui a2 = akua.a(4, aodm.a(i), j, this.g);
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
        aucd o = aocu.c.o();
        if (aszs != null) {
            i2 = aszs.a.size();
        } else {
            i2 = 0;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aocu aocu = (aocu) o.b;
        aocu.a |= 1;
        aocu.b = i2;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        aodn aodn2 = (aodn) aucd3.b;
        aocu aocu2 = (aocu) o.i();
        aocu2.getClass();
        aodn2.i = aocu2;
        aodn2.a |= 128;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aoei aoei2 = (aoei) aucd2.b;
        aodn aodn3 = (aodn) aucd3.i();
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
            aszr a2 = akth.a(this.c, this.e, this.f, this.g);
            long c2 = azda.c();
            if (aktn.g == null) {
                aktn.g = baaj.a(baai.UNARY, "userlocation.SemanticLocationService/EstimatePlacesByLocation", baoq.a(aszr.f), baoq.a(aszs.b));
            }
            return (aszs) aktn.a.a(aktn.g, a2, c2, TimeUnit.MILLISECONDS);
        }
        Account account = new Account(this.g.d, "com.google");
        ClientContext clientContext = new ClientContext(this.d);
        clientContext.d = account;
        clientContext.c = account;
        aktj aktj = this.b;
        aszr a3 = akth.a(this.c, this.e, this.f, this.g);
        if (aktj.c == null) {
            aktj.c = baaj.a(baai.UNARY, "userlocation.SemanticLocationService/EstimatePlacesByLocation", baoq.a(aszr.f), baoq.a(aszs.b));
        }
        return (aszs) aktj.a.a(aktj.c, clientContext, a3, 10000, TimeUnit.MILLISECONDS);
    }
}
