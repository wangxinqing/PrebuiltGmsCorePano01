package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: akwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwo extends akwd {
    private final PlacefencingRequest b;
    private final PendingIntent c;
    private final rka d;
    private final akxe e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akwo(PlacefencingRequest placefencingRequest, PendingIntent pendingIntent, akxe akxe, PlacesParams placesParams, rka rka, akuy akuy, akvn akvn, akhj akhj) {
        super(67, "proxyAddPlacefencesByRequest", placesParams, akuy, akvn, "android.permission.ACCESS_FINE_LOCATION", akhj);
        iva.a((Object) placefencingRequest);
        iva.a((Object) pendingIntent);
        iva.a((Object) rka);
        this.b = placefencingRequest;
        this.c = pendingIntent;
        this.d = rka;
        this.e = akxe;
    }

    public final int a() {
        return 2;
    }

    public final int b() {
        return 2;
    }

    public final aoei c() {
        return null;
    }

    public final void a(Context context) {
        super.a(context);
        akxe akxe = this.e;
        PlacefencingRequest placefencingRequest = this.b;
        PendingIntent pendingIntent = this.c;
        adut adut = akxe.a;
        iha b2 = ihb.b();
        b2.a = new aduh(adut, placefencingRequest, pendingIntent);
        b2.b = new Feature[]{adty.b};
        adut.b(b2.a()).a((acvp) new akwn(this));
    }

    public final void b(Status status) {
        alfs.a(status.i, status.j, this.d);
    }

    public final void a(Status status) {
        b(status);
    }
}
