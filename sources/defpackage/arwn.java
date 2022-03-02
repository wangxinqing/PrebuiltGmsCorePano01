package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: arwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arwn implements ServiceConnection {
    final /* synthetic */ arwt a;

    public arwn(arwt arwt) {
        this.a = arwt;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        aryh aryh;
        Log.w("AutoTestUiInjector", "onServiceConnected called");
        arwt arwt = this.a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.autotest.IAutoTestService");
            aryh = queryLocalInterface instanceof aryh ? (aryh) queryLocalInterface : new aryh(iBinder);
        } else {
            aryh = null;
        }
        arwt.d = aryh;
        try {
            arwt arwt2 = this.a;
            arwt2.d.a(arwt2.c);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("AutoTestUiInjector", valueOf.length() == 0 ? new String("Error! iAutoTestService.register meet exception! ") : "Error! iAutoTestService.register meet exception! ".concat(valueOf));
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Log.w("AutoTestUiInjector", "onServiceDisconnected called");
        this.a.a();
    }
}
