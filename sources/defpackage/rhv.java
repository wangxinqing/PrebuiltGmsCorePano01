package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceRequest;

@Deprecated
/* renamed from: rhv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rhv extends iby {
    public rhv(Context context, ibq ibq, rir rir) {
        super(context, ibq, (ibm) rir, ibx.a);
    }

    public final acwa a(NearbyAlertRequest nearbyAlertRequest, PendingIntent pendingIntent) {
        ibq ibq = rij.a;
        icc icc = this.j;
        iva.a((Object) nearbyAlertRequest, (Object) "request == null");
        iva.a((Object) pendingIntent, (Object) "callbackIntent == null");
        rkf rkf = new rkf(rij.b, icc, nearbyAlertRequest, pendingIntent);
        icc.b((idf) rkf);
        return iux.a(rkf);
    }

    public final acwa e(PendingIntent pendingIntent) {
        ibq ibq = rij.a;
        icc icc = this.j;
        iva.a((Object) pendingIntent, (Object) "callbackIntent == null");
        rkd rkd = new rkd(rij.b, icc, pendingIntent);
        icc.b((idf) rkd);
        return iux.a(rkd);
    }

    public final acwa f(PendingIntent pendingIntent) {
        ibq ibq = rij.a;
        icc icc = this.j;
        iva.a((Object) pendingIntent, (Object) "callbackIntent == null");
        rke rke = new rke(rij.b, icc, pendingIntent);
        icc.b((idf) rke);
        return iux.a(rke);
    }

    public final acwa a(PlaceRequest placeRequest, PendingIntent pendingIntent) {
        ibq ibq = rij.a;
        icc icc = this.j;
        iva.a((Object) placeRequest, (Object) "request == null");
        iva.a((Object) pendingIntent, (Object) "callbackIntent == null");
        rkg rkg = new rkg(rij.b, icc, placeRequest, pendingIntent);
        icc.b((idf) rkg);
        return iux.a(rkg);
    }
}
