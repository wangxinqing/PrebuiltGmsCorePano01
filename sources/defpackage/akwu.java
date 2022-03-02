package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: akwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akwu extends akwd {
    private final PendingIntent b;
    private final rka c;
    private final akxe d;

    public akwu(PendingIntent pendingIntent, akxe akxe, PlacesParams placesParams, rka rka, akuy akuy, akvn akvn, akhj akhj) {
        super(67, "RemoveNearbyAlerts", placesParams, akuy, akvn, "", akhj);
        iva.a((Object) pendingIntent);
        this.b = pendingIntent;
        this.d = akxe;
        this.c = rka;
    }

    public final int a() {
        return 2;
    }

    public final int b() {
        return 1;
    }

    public final aoei c() {
        return akig.a((NearbyAlertRequest) null, this.a, false);
    }

    public final void a(Context context) {
        super.a(context);
        this.d.b(this.b).a((acvp) new akwt(this));
    }

    public final void b(Status status) {
        alfs.a(status.i, status.j, this.c);
    }

    public final void a(Status status) {
        b(status);
    }
}
