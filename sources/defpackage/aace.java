package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: aace  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aace extends qvy implements aabz {
    final /* synthetic */ aacf a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aace(aacf aacf) {
        super("scheduler");
        this.a = aacf;
    }

    public final void a() {
        if (((Boolean) this.a.e.a()).booleanValue()) {
            this.a.a();
        }
        jca.a().b(this.a.a, (ServiceConnection) this);
        synchronized (this) {
        }
    }

    public final void b(ComponentName componentName) {
        try {
            this.a.b.a(componentName);
        } catch (RemoteException e) {
            Log.e("GcmBinderProxy", "Error conveying null binder to primary user", e);
        }
        a();
    }

    public final void close() {
        if (axlu.c()) {
            this.a.d.execute(new aacd(this));
        } else {
            a();
        }
    }

    public final void onNullBinding(ComponentName componentName) {
        if (axlu.c()) {
            this.a.d.execute(new aacb(this, componentName));
        } else {
            b(componentName);
        }
    }

    public final void b(ComponentName componentName, IBinder iBinder) {
        boolean z;
        if (componentName != null) {
            z = componentName.equals(this.a.c.getComponent());
        } else {
            z = false;
        }
        if (componentName != null && z && aaby.a(iBinder)) {
            try {
                this.a.b.a(componentName, new nsx(iBinder, this));
            } catch (RemoteException e) {
                Log.e("GcmBinderProxy", "Error connecting primary user binder", e);
                close();
            }
        } else {
            try {
                this.a.b.d();
            } catch (RemoteException e2) {
                Log.e("GcmBinderProxy", "Error conveying binder error to primary user", e2);
            }
            close();
        }
    }

    public final void a(ComponentName componentName) {
        close();
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        if (axlu.c()) {
            this.a.d.execute(new aacc(this, componentName, iBinder));
        } else {
            b(componentName, iBinder);
        }
    }
}
