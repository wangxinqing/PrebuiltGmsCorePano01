package com.google.android.gms.drive.metadata.sync.syncadapter;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SyncAdapterChimeraService extends Service {
    private static ldy a = null;

    public final IBinder onBind(Intent intent) {
        if (a == null) {
            a = new ldy(getApplicationContext());
        }
        return a.getSyncAdapterBinder();
    }
}
