package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.places.NearbyAlertRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: ajjj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajjj implements acvp {
    final /* synthetic */ PendingIntent a;
    final /* synthetic */ NearbyAlertRequest b;
    final /* synthetic */ ajjl c;

    public ajjj(ajjl ajjl, PendingIntent pendingIntent, NearbyAlertRequest nearbyAlertRequest) {
        this.c = ajjl;
        this.a = pendingIntent;
        this.b = nearbyAlertRequest;
    }

    public final void a(acwa acwa) {
        if (!acwa.b()) {
            ajix.c("GCoreUlr", "Registration for Nearby Alerts failed.");
            if (aztb.a.a().bu() && this.c.b == null) {
                long J = aztb.J();
                StringBuilder sb = new StringBuilder(46);
                sb.append("Retrying again in ");
                sb.append(J);
                sb.append(" seconds");
                ajix.a("GCoreUlr", sb.toString());
                ajjl ajjl = this.c;
                ajjl.b = ajjl.a.a((Runnable) new ajjk(ajjl, this.a, this.b), aztb.J(), TimeUnit.SECONDS);
                return;
            }
            return;
        }
        this.c.c = 0;
    }
}
