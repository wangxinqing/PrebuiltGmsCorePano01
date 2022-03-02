package defpackage;

import android.app.PendingIntent;
import java.util.concurrent.ScheduledFuture;

/* renamed from: ajji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajji implements Runnable {
    final /* synthetic */ PendingIntent a;
    final /* synthetic */ ajjl b;

    public ajji(ajjl ajjl, PendingIntent pendingIntent) {
        this.b = ajjl;
        this.a = pendingIntent;
    }

    public final void run() {
        ajjl ajjl = this.b;
        PendingIntent pendingIntent = this.a;
        ScheduledFuture scheduledFuture = ajjl.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            ajjl.b = null;
        }
        ajjl.c = 0;
        ajjl.d.a().e(pendingIntent);
        pendingIntent.cancel();
    }
}
