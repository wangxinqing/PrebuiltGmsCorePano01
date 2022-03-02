package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: arwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arwt {
    public final WeakReference a;
    public final ServiceConnection b = new arwn(this);
    public final aryi c;
    public aryh d;

    public arwt(Context context, String str) {
        this.a = new WeakReference(context);
        this.c = new aryi(this.a, str);
    }

    public final void a() {
        Log.w("AutoTestUiInjector", "tryUnregisterCallback called");
        aryh aryh = this.d;
        if (aryh != null) {
            try {
                aryh.c(2, aryh.aQ());
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("AutoTestUiInjector", valueOf.length() == 0 ? new String("iAutoTestService.unregister meet exception! ") : "iAutoTestService.unregister meet exception! ".concat(valueOf));
            }
        }
    }

    public final void a(Object obj) {
        this.c.b = new WeakReference(obj);
        String valueOf = String.valueOf(obj.getClass().getSimpleName());
        Log.w("AutoTestUiInjector", valueOf.length() == 0 ? new String("Set target fragment to ") : "Set target fragment to ".concat(valueOf));
    }
}
