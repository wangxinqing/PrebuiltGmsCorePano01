package com.google.android.gms.chromesync.sync;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SyncChimeraService extends Service {
    private static final Object a = new Object();
    private static hno b;

    public final IBinder onBind(Intent intent) {
        return b.getSyncAdapterBinder();
    }

    public final void onCreate() {
        synchronized (a) {
            if (b == null) {
                b = new hno(getApplicationContext());
            }
        }
    }
}
