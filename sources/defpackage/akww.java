package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: akww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akww extends akwd {
    private final PendingIntent b;
    private final rka c;
    private final akxe d;

    public akww(PendingIntent pendingIntent, akxe akxe, rka rka, PlacesParams placesParams, akuy akuy, akvn akvn, akhj akhj) {
        super(67, "RemovePlaceUpdates", placesParams, akuy, akvn, "android.permission.ACCESS_FINE_LOCATION", akhj);
        iva.a((Object) pendingIntent);
        iva.a((Object) rka);
        this.d = akxe;
        this.b = pendingIntent;
        this.c = rka;
        this.a = placesParams;
    }

    public final int a() {
        return 2;
    }

    public final int b() {
        return 1;
    }

    public final aoei c() {
        return akig.a((Integer) null, (Long) null, this.a, false);
    }

    public final void a(Context context) {
        super.a(context);
        this.d.a(this.b).a((acvp) new akwv(this));
    }

    public final void b(Status status) {
        alfs.a(status.i, status.j, this.c);
    }

    public final void a(Status status) {
        b(status);
    }
}
