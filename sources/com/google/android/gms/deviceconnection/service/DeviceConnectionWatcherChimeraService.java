package com.google.android.gms.deviceconnection.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceConnectionWatcherChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        jyl.a((Context) this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
