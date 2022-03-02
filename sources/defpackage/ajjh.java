package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.places.NearbyAlertRequest;

/* renamed from: ajjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajjh implements Runnable {
    final /* synthetic */ PendingIntent a;
    final /* synthetic */ NearbyAlertRequest b;
    final /* synthetic */ ajjl c;

    public ajjh(ajjl ajjl, PendingIntent pendingIntent, NearbyAlertRequest nearbyAlertRequest) {
        this.c = ajjl;
        this.a = pendingIntent;
        this.b = nearbyAlertRequest;
    }

    public final void run() {
        this.c.b(this.a, this.b);
    }
}
