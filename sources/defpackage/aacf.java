package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* renamed from: aacf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aacf implements Runnable, IBinder.DeathRecipient {
    public final Context a;
    public final ntb b;
    public final Intent c;
    public final Executor d;
    public final amsv e = amta.a(aaca.a);
    private final aace f = new aace(this);

    public aacf(Context context, ntb ntb, Intent intent, Executor executor) {
        this.a = context;
        this.b = ntb;
        this.c = intent;
        this.d = executor;
    }

    public final void a() {
        try {
            this.b.asBinder().unlinkToDeath(this, 0);
        } catch (NoSuchElementException e2) {
            Log.e("GcmBinderProxy", "Binder unlinkToDeath failed", e2);
        }
    }

    public final void binderDied() {
        if (((Boolean) this.e.a()).booleanValue()) {
            Log.e("GcmBinderProxy", "Scheduler process in user 0 died, unbinding from the task");
            this.f.close();
        }
    }

    public final void run() {
        try {
            if (!jca.a().a(this.a, "NetworkScheduler", this.c, (ServiceConnection) this.f, aacp.a())) {
                try {
                    this.b.b();
                } catch (RemoteException e2) {
                    Log.e("GcmBinderProxy", "Error conveying bind result to primary user", e2);
                }
                this.f.close();
            } else if (((Boolean) this.e.a()).booleanValue()) {
                try {
                    this.b.asBinder().linkToDeath(this, 0);
                } catch (RemoteException e3) {
                    Log.e("GcmBinderProxy", "Scheduler process in user 0 died", e3);
                    this.f.close();
                }
            }
        } catch (SecurityException e4) {
            Log.e("GcmBinderProxy", "Error binding to task service", e4);
            try {
                this.b.c();
            } catch (RemoteException e5) {
                Log.e("GcmBinderProxy", "Error conveying binder exception to primary user", e5);
            }
            this.f.close();
        }
    }
}
