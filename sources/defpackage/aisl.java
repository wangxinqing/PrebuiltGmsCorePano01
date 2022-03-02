package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.location.internal.PendingIntentCallbackChimeraService;
import com.google.android.location.movement.ActivityDetector$Receiver;
import java.util.Collection;

/* renamed from: aisl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aisl {
    public volatile boolean a = false;
    public final Context b;
    public final int c;
    public final String d;
    public final String e;
    final ActivityDetector$Receiver f = new ActivityDetector$Receiver(this);
    public final aisq g;
    public final Object h = new Object();
    public ahys i;
    public int j = -1;
    public Collection k = null;
    private final PendingIntent l;
    private final aimk m;

    public aisl(Context context, aiso aiso, aimk aimk, String str) {
        this.b = context;
        this.m = aimk;
        this.g = new aisq(aiso, this.m);
        this.c = context.getApplicationInfo().uid;
        this.d = context.getPackageName();
        this.e = str;
        Intent a2 = PendingIntentCallbackChimeraService.a(context);
        a2.setPackage(this.b.getPackageName());
        a2.setAction("com.google.android.location.internal.action.GEOFENCER_AR_RESULT");
        this.l = PendingIntent.getService(this.b, 0, a2, 134217728);
        this.b.getApplicationContext().registerReceiver(this.f, new IntentFilter("com.google.android.location.internal.server.ACTION_RESTARTED"));
        alv.a(context).a(this.f, new IntentFilter(asvl.a("com.google.android.location.internal.action.GEOFENCER_AR_RESULT")));
    }

    public static void a(Context context, PendingIntent pendingIntent) {
        atir atir = new atir(context.getPackageName());
        atir.b(pendingIntent);
        atir.a(context);
    }

    public final void a() {
        synchronized (this.h) {
            if (this.j != -1) {
                this.g.a(false);
                this.m.a();
                this.j = -1;
                this.k = null;
            }
            PendingIntent pendingIntent = this.l;
            if (pendingIntent != null) {
                a(this.b, pendingIntent);
            }
        }
    }

    public final void a(int i2, boolean z, Collection collection) {
        PendingIntent pendingIntent = this.l;
        if (pendingIntent != null) {
            a(this.b, pendingIntent);
        }
        rck rck = new rck();
        WorkSource a2 = isb.a(collection);
        rck.a(((long) i2) * 1000);
        rck.c = z;
        rck.e = "movement.ActivityDetector";
        rck.d = a2;
        atir atir = new atir(this.b.getPackageName());
        atir.a(a2);
        atir.a(rck.a(), this.l);
        if (atir.a(this.b) == null) {
            Log.w("ActivityDetector", "Unable to bind to GMS NLP");
        }
    }
}
