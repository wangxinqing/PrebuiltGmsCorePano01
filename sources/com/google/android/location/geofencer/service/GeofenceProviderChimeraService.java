package com.google.android.location.geofencer.service;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GeofenceProviderChimeraService extends Service {
    private IBinder a;

    public final IBinder onBind(Intent intent) {
        if (!"com.android.location.service.GeofenceProvider".equals(intent.getAction())) {
            return null;
        }
        boolean z = aikq.a;
        return this.a;
    }

    public final void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        this.a = ainh.a.getBinder();
    }
}
