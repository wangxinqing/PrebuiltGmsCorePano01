package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: aksv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aksv extends aktf {
    private final Context b;
    private final ClientContext c;
    private final String d;
    private final String e;
    private final String f;
    private final LatLngBounds g;
    private final int h;
    private final AutocompleteFilter i;
    private final PlacesParams j;
    private final iyn k;

    public aksv(iyn iyn, Context context, ClientContext clientContext, String str, String str2, String str3, LatLngBounds latLngBounds, int i2, AutocompleteFilter autocompleteFilter, String str4, PlacesParams placesParams) {
        super(str4);
        this.k = iyn;
        this.b = context;
        this.c = clientContext;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = latLngBounds;
        this.h = i2;
        this.i = autocompleteFilter;
        this.j = placesParams;
    }

    public final /* bridge */ /* synthetic */ anui a(int i2, long j2, PlacesParams placesParams, Object obj) {
        int i3;
        asre asre = (asre) obj;
        anui a = aktf.a(6, i2, j2, this.j);
        aucd aucd = (aucd) a.c(5);
        aucd.a((aucj) a);
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
        aucd o = aoda.c.o();
        if (asre != null) {
            i3 = asre.b.size();
        } else {
            i3 = 0;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoda aoda = (aoda) o.b;
        aoda.a |= 1;
        aoda.b = i3;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        aodn aodn2 = (aodn) aucd3.b;
        aoda aoda2 = (aoda) o.i();
        aoda2.getClass();
        aodn2.k = aoda2;
        aodn2.a |= 512;
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
        if (!TextUtils.isEmpty(this.j.d)) {
            return (asre) this.k.a(this.c, this.a, aksd.a(this.b, this.f, this.g, this.h, this.i, this.j).k(), (Object) asre.c, azcl.c(), 10247);
        }
        return (asre) this.k.a(this.a, aksd.a(this.b, this.f, this.g, this.h, this.i, this.j).k(), (Object) asre.c, this.d, this.e, azcl.c(), 10246);
    }
}
