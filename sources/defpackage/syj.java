package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: syj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class syj {
    public final Context a;

    public syj(Context context) {
        iva.a((Object) context);
        this.a = context;
    }

    public final IBinder a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                return new suf(sze.a(this.a), (String) null);
            }
            c().f.a("onBind received unknown action", action);
            return null;
        }
        c().c.a("onBind called with null intent");
        return null;
    }

    public final void b() {
        svv a2 = svv.a(this.a);
        sut E = a2.E();
        if (a2.f.a) {
            E.k.a("Device PackageMeasurementTaskService is shutting down");
        } else {
            E.k.a("Local AppMeasurementService is shutting down");
        }
    }

    public final sut c() {
        return svv.a(this.a).E();
    }

    public final void c(Intent intent) {
        if (intent != null) {
            c().k.a("onUnbind called for intent. action", intent.getAction());
            return;
        }
        c().c.a("onUnbind called with null intent");
    }

    public final void b(Intent intent) {
        if (intent != null) {
            c().k.a("onRebind called. action", intent.getAction());
            return;
        }
        c().c.a("onRebind called with null intent");
    }

    public final void a() {
        svv a2 = svv.a(this.a);
        sut E = a2.E();
        if (a2.f.a) {
            E.k.a("Device PackageMeasurementTaskService is starting up");
        } else {
            E.k.a("Local AppMeasurementService is starting up");
        }
    }

    public final void a(Intent intent, int i) {
        svv a2 = svv.a(this.a);
        sut E = a2.E();
        if (intent == null) {
            E.f.a("AppMeasurementService started with null intent");
            return;
        }
        String action = intent.getAction();
        if (a2.f.a) {
            E.k.a("Device PackageMeasurementTaskService called. startId, action", Integer.valueOf(i), action);
        } else {
            E.k.a("Local AppMeasurementService called. startId, action", Integer.valueOf(i), action);
        }
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            a((Runnable) new syf(this, i, E, intent));
        }
    }

    public final void a(Runnable runnable) {
        sze a2 = sze.a(this.a);
        a2.F().a((Runnable) new syh(a2, runnable));
    }
}
