package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.service.GeoDataChimeraService;
import java.util.concurrent.TimeoutException;

/* renamed from: akvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvt extends akwd {
    private final String b;
    private final int c;
    private final int d;
    private final int e;
    private final akjb f;
    private final GeoDataChimeraService g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akvt(String str, int i, int i2, int i3, PlacesParams placesParams, rjx rjx, akuy akuy, akvn akvn, GeoDataChimeraService geoDataChimeraService, akhj akhj) {
        super(65, "GetPhotoImage", placesParams, akuy, akvn, "", akhj);
        boolean z;
        int i4 = i;
        int i5 = i2;
        iva.a((Object) str);
        boolean z2 = true;
        if (i4 > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        iva.b(i5 <= 0 ? false : z2);
        iva.a((Object) rjx);
        this.b = str;
        this.c = i4;
        this.d = i5;
        this.e = i3;
        this.f = new akjb(rjx);
        this.g = geoDataChimeraService;
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 1;
    }

    public final aoei c() {
        int i = this.e;
        aoei c2 = akig.c(5, this.a);
        aucd aucd = (aucd) c2.c(5);
        aucd.a((aucj) c2);
        aucd o = aoez.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoez aoez = (aoez) o.b;
        aoez.b = 1;
        int i2 = 1 | aoez.a;
        aoez.a = i2;
        aoez.a = i2 | 2;
        aoez.c = i;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aoez aoez2 = (aoez) o.i();
        aoei aoei2 = aoei.w;
        aoez2.getClass();
        aoei.l = aoez2;
        aoei.a |= 512;
        return (aoei) aucd.i();
    }

    public final void a(Context context) {
        super.a(context);
        akib akib = this.g.b;
        String str = this.b;
        int i = this.c;
        int i2 = this.d;
        akhz akhz = new akhz(akib, this.f);
        akib.b.add(new akia(iqk.a(i, i2, str), akhz, i, i2, akhz));
        try {
            this.f.a(f().a("photoImage", this.a));
        } catch (VolleyError | eif | TimeoutException e2) {
            throw akwd.a(e2);
        }
    }

    public final void a(Status status) {
        this.f.a(status);
    }
}
