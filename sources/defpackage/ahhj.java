package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ahhj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahhj implements Application.ActivityLifecycleCallbacks, ahha {
    private static final long g = TimeUnit.MINUTES.toMillis(1);
    public final ScheduledExecutorService a;
    public ahhd b;
    public long c;
    public final AtomicLong d = new AtomicLong(0);
    public ScheduledFuture e;
    protected final Object f;
    private final ahhc h;

    private ahhj(ahhd ahhd, ScheduledExecutorService scheduledExecutorService, ahhc ahhc) {
        this.b = ahhd;
        this.a = scheduledExecutorService;
        this.h = ahhc;
        this.c = g;
        this.f = new Object();
    }

    public static ahhj a(ahhd ahhd, ScheduledExecutorService scheduledExecutorService, ahhc ahhc, Application application) {
        ahhj ahhj = new ahhj(ahhd, scheduledExecutorService, ahhc);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(ahhj);
        }
        ahhc.c = ahhj;
        return ahhj;
    }

    public final void b() {
        this.d.set(0);
        this.b.a(this.h);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        synchronized (this.f) {
            b();
            a();
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void a() {
        synchronized (this.f) {
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.e = null;
            }
        }
    }
}
