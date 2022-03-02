package com.google.android.location.geocode;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GeocodeChimeraService extends Service {
    private aiji a;

    public final IBinder onBind(Intent intent) {
        IBinder binder;
        synchronized (this) {
            if (this.a == null) {
                this.a = new aiji(getApplicationContext());
            }
            binder = this.a.getBinder();
        }
        return binder;
    }

    public final void onDestroy() {
        synchronized (this) {
            this.a = null;
        }
        super.onDestroy();
    }

    public final boolean onUnbind(Intent intent) {
        return false;
    }
}
