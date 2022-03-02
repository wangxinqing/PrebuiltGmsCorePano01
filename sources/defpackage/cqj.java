package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* renamed from: cqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cqj extends cqd {
    private static final Intent b = new Intent("com.google.android.finsky.BIND_PLAY_MODULE_SERVICE").setPackage("com.android.vending");
    private final cqi a;

    public cqj(cqi cqi) {
        this.a = cqi;
    }

    public static void a(Context context, cqr cqr) {
        try {
            context.unbindService(cqr);
        } catch (IllegalStateException e) {
        }
    }

    public final cqn b(Context context, cqr cqr) {
        cqn cqn = null;
        if (context.bindService(b, cqr, 1)) {
            try {
                IBinder a2 = cqr.a();
                if (a2 != null) {
                    IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.finsky.zapp.protocol.IPlayModuleService");
                    cqn = !(queryLocalInterface instanceof cqn) ? new cqn(a2) : (cqn) queryLocalInterface;
                }
            } catch (InterruptedException e) {
                Thread.interrupted();
            }
            if (cqn == null) {
                a(context, cqr);
                Log.e("ZappPhoneskyConn", "Unable to connect to Phonesky");
            }
            return cqn;
        }
        Log.e("ZappPhoneskyConn", "Unable to bind to Phonesky");
        return null;
    }

    public final void a(Context context, int i, String str) {
        cqi cqi = this.a;
        if (cqi != null) {
            cqi.b(context, i, str);
        }
    }
}
