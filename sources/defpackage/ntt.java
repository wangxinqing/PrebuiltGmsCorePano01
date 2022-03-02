package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: ntt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ntt {
    private final Context a;
    private final jbs b;
    private PendingIntent c;

    public ntt(Context context) {
        jbs jbs = new jbs(context);
        this.a = context;
        this.b = jbs;
    }

    public final synchronized void a() {
        if (this.c == null) {
            this.c = PendingIntent.getBroadcast(this.a, 0, new Intent().setClassName("com.google.android.gms", "com.google.android.gms.gcm.ServiceAutoStarter"), 134217728);
        }
        this.b.a("GcmServiceRestart", 3, SystemClock.elapsedRealtime() + TimeUnit.SECONDS.toMillis(axlc.a.a().ao()), this.c);
    }

    public final synchronized void b() {
        PendingIntent pendingIntent = this.c;
        if (pendingIntent != null) {
            this.b.a(pendingIntent);
            this.c.cancel();
            this.c = null;
        }
    }
}
