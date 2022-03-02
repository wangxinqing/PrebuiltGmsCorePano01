package com.google.android.gms.subscribedfeeds;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FeedsGcmReceiverChimeraService extends Service {
    public acug a;
    private final Executor b = qvj.b.a(new jlt("SubscribedFeeds-messages"));
    private final ScheduledExecutorService c = qvj.b.a((ThreadFactory) new jlt("SubscribedFeeds-timeout"), 1);
    private int d;
    private int e = 0;

    public final Future a(String str) {
        if (!azpv.b()) {
            return aorl.a();
        }
        return this.c.schedule(new acui(this, str), azpv.a.a().c(), TimeUnit.MILLISECONDS);
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.a = acug.a(this.c, new ahgr((Context) this, "STREAMZ_SUBSCRIBEDFEEDS"));
        if (azpv.b()) {
            this.a.a(azpv.e());
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this) {
            this.d = i2;
            this.e++;
        }
        this.b.execute(new acuh(this, intent));
        return 3;
    }

    public final synchronized void a() {
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            stopSelf(this.d);
        }
    }
}
