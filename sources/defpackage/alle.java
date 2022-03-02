package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.places.Subscription;

/* renamed from: alle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alle implements akjv {
    private final SemanticLocationEventRequest a;
    private final PendingIntent b;
    private final Context c;
    private final allf d;

    public alle(PendingIntent pendingIntent, SemanticLocationEventRequest semanticLocationEventRequest, allf allf, Context context) {
        this.d = allf;
        this.b = pendingIntent;
        this.a = semanticLocationEventRequest;
        this.c = context;
    }

    public final void a(akip akip, long j, akip akip2, long j2) {
        if (!azcr.d()) {
            Intent a2 = adue.a(alll.a(akip, j, this.a.c.b), alll.a(akip2, j2, this.a.c.b)).a();
            int i = Build.VERSION.SDK_INT;
            jhr.a(this.c).c("android:fine_location", this.b.getCreatorUid(), this.b.getCreatorPackage());
            try {
                int i2 = Build.VERSION.SDK_INT;
                this.b.send(this.c, 0, a2, (PendingIntent.OnFinished) null, (Handler) null, "android.permission.ACCESS_FINE_LOCATION");
            } catch (PendingIntent.CanceledException e) {
                allf allf = this.d;
                ((akiy) allf.a).a((Subscription) allf.b);
            }
        }
    }
}
