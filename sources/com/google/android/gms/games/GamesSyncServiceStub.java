package com.google.android.gms.games;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GamesSyncServiceStub extends Service {
    public final IBinder onBind(Intent intent) {
        return new nll(this).getSyncAdapterBinder();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        stopSelf(i2);
        return 2;
    }
}
