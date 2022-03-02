package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: akwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwq extends akwd {
    private final String b;
    private final rka c;
    private final akxe d;

    public akwq(String str, akxe akxe, PlacesParams placesParams, rka rka, akuy akuy, akvn akvn, akhj akhj) {
        super(67, "proxyRemovePlacefencesByRequest", placesParams, akuy, akvn, "android.permission.ACCESS_FINE_LOCATION", akhj);
        iva.a((Object) str);
        iva.b(!str.isEmpty());
        iva.a((Object) rka);
        this.d = akxe;
        this.b = str;
        this.c = rka;
    }

    public final int a() {
        return 2;
    }

    public final int b() {
        return 1;
    }

    public final aoei c() {
        return null;
    }

    public final void a(Context context) {
        super.a(context);
        akxe akxe = this.d;
        String str = this.b;
        adut adut = akxe.a;
        iha b2 = ihb.b();
        b2.a = new adui(adut, str);
        b2.b = new Feature[]{adty.b};
        adut.b(b2.a()).a((acvp) new akwp(this));
    }

    public final void b(Status status) {
        alfs.a(status.i, status.j, this.c);
    }

    public final void a(Status status) {
        b(status);
    }
}
