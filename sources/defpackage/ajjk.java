package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.places.NearbyAlertRequest;

/* renamed from: ajjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajjk implements Runnable {
    final /* synthetic */ PendingIntent a;
    final /* synthetic */ NearbyAlertRequest b;
    final /* synthetic */ ajjl c;

    public ajjk(ajjl ajjl, PendingIntent pendingIntent, NearbyAlertRequest nearbyAlertRequest) {
        this.c = ajjl;
        this.a = pendingIntent;
        this.b = nearbyAlertRequest;
    }

    public final void run() {
        ajjl ajjl = this.c;
        ajjl.b = null;
        if (((long) ajjl.c) < aztb.a.a().bs()) {
            ajjl ajjl2 = this.c;
            ajjl2.c++;
            ajjl2.b(this.a, this.b);
        }
    }
}
