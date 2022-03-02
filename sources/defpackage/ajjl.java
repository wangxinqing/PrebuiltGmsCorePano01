package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.location.places.NearbyAlertRequest;
import java.util.concurrent.ScheduledFuture;

/* renamed from: ajjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajjl {
    public final jfc a;
    public ScheduledFuture b;
    public int c = 0;
    public final ajjg d;

    public ajjl(Context context) {
        ajjg ajjg = new ajjg(context);
        jfc a2 = jfm.a(1, 10);
        this.d = ajjg;
        this.a = a2;
    }

    public static int a(int i) {
        return i != 0 ? 2 : 0;
    }

    public static int b(int i) {
        if (i == 110 || i == 100) {
            return i;
        }
        return -1;
    }

    public final void a(PendingIntent pendingIntent) {
        this.a.execute(new ajji(this, pendingIntent));
    }

    /* access modifiers changed from: package-private */
    public final void b(PendingIntent pendingIntent, NearbyAlertRequest nearbyAlertRequest) {
        if (pendingIntent != null) {
            this.d.a().a(nearbyAlertRequest, pendingIntent).a((acvp) new ajjj(this, pendingIntent, nearbyAlertRequest));
        } else {
            ajix.c("GCoreUlr", "Invalid parameters given. Not registering for nearby alerts");
        }
    }

    public final void a(PendingIntent pendingIntent, NearbyAlertRequest nearbyAlertRequest) {
        this.a.execute(new ajjh(this, pendingIntent, nearbyAlertRequest));
    }
}
