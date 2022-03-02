package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: aksu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aksu extends aktf {
    private final Context b;
    private final ClientContext c;
    private final String d;
    private final String e;
    private final int f;
    private final LatLng g;
    private final boolean h;
    private final PlacesParams i;
    private final iyn j;

    public aksu(iyn iyn, Context context, ClientContext clientContext, String str, String str2, LatLng latLng, int i2, boolean z, String str3, PlacesParams placesParams) {
        super(str3);
        this.j = iyn;
        this.b = context;
        this.c = clientContext;
        this.d = str;
        this.e = str2;
        this.g = latLng;
        this.f = i2;
        this.h = z;
        this.i = placesParams;
    }

    public final /* bridge */ /* synthetic */ anui a(int i2, long j2, PlacesParams placesParams, Object obj) {
        int i3;
        asrx asrx = (asrx) obj;
        anui a = aktf.a(4, i2, j2, placesParams);
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
        aucd o = aocu.c.o();
        if (asrx != null) {
            i3 = asrx.b.size();
        } else {
            i3 = 0;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aocu aocu = (aocu) o.b;
        aocu.a |= 1;
        aocu.b = i3;
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
        if (!TextUtils.isEmpty(this.i.d)) {
            return (asrx) this.j.a(this.c, this.a, aksd.a(this.b, this.g, this.f, this.h, this.i).k(), (Object) asrx.c, azcl.c(), 10265);
        }
        return (asrx) this.j.a(this.a, aksd.a(this.b, this.g, this.f, this.h, this.i).k(), (Object) asrx.c, this.d, this.e, azcl.c(), 10265);
    }
}
