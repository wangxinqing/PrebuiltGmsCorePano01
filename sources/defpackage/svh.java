package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: svh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class svh implements ServiceConnection {
    public final String a;
    final /* synthetic */ svi b;

    public svh(svi svi, String str) {
        this.b = svi;
        this.a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        cpv cpv;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (!(queryLocalInterface instanceof cpv)) {
                    cpv = new cpv(iBinder);
                } else {
                    cpv = (cpv) queryLocalInterface;
                }
                if (cpv != null) {
                    this.b.a.E().k.a("Install Referrer Service connected");
                    this.b.a.F().a((Runnable) new svg(this, cpv, this));
                    return;
                }
                this.b.a.E().f.a("Install Referrer Service implementation was not found");
            } catch (Exception e) {
                this.b.a.E().f.a("Exception occurred while calling Install Referrer API", e);
            }
        } else {
            this.b.a.E().f.a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.E().k.a("Install Referrer Service disconnected");
    }
}
