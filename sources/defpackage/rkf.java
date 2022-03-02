package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.places.NearbyAlertRequest;

/* renamed from: rkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rkf extends rin {
    final /* synthetic */ NearbyAlertRequest a;
    final /* synthetic */ PendingIntent b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rkf(ibq ibq, icc icc, NearbyAlertRequest nearbyAlertRequest, PendingIntent pendingIntent) {
        super(ibq, icc);
        this.a = nearbyAlertRequest;
        this.b = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        rki rki = (rki) ibf;
        rio rio = new rio((rin) this);
        NearbyAlertRequest nearbyAlertRequest = this.a;
        PendingIntent pendingIntent = this.b;
        iva.a((Object) rio, (Object) "callback == null");
        ((rjr) rki.x()).a(nearbyAlertRequest, rki.a, pendingIntent, (rka) rio);
    }
}
