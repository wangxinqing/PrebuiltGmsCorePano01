package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: irt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class irt implements ServiceConnection {
    final /* synthetic */ irx a;
    private final int b;

    public irt(irx irx, int i) {
        this.a = irx;
        this.b = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ity ity;
        int i;
        int i2;
        if (iBinder == null) {
            irx irx = this.a;
            synchronized (irx.f) {
                i = irx.k;
            }
            if (i == 3) {
                irx.o = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = irx.e;
            handler.sendMessage(handler.obtainMessage(i2, irx.q.get(), 16));
            return;
        }
        synchronized (this.a.g) {
            irx irx2 = this.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null) {
                if (queryLocalInterface instanceof ity) {
                    ity = (ity) queryLocalInterface;
                    irx2.h = ity;
                }
            }
            ity = new itw(iBinder);
            irx2.h = ity;
        }
        this.a.a(0, this.b);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.g) {
            this.a.h = null;
        }
        Handler handler = this.a.e;
        handler.sendMessage(handler.obtainMessage(6, this.b, 1));
    }
}
