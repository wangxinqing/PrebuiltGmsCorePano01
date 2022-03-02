package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* renamed from: algq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class algq implements ServiceConnection {
    final /* synthetic */ algt a;

    public algq(algt algt) {
        this.a = algt;
    }

    public final void onBindingDied(ComponentName componentName) {
        this.a.a(new algr(7));
    }

    public final void onNullBinding(ComponentName componentName) {
        this.a.a(new algr(6));
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        algb algb;
        if (iBinder == null) {
            Log.w("SucServiceProvider", "Binder is null when onServiceConnected was called!");
            i = 5;
        } else {
            i = 4;
        }
        algt algt = this.a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.ISetupCompatService");
            algb = queryLocalInterface instanceof algb ? (algb) queryLocalInterface : new algb(iBinder);
        } else {
            algb = null;
        }
        algt.a(new algr(i, algb));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.a(new algr(5));
    }
}
