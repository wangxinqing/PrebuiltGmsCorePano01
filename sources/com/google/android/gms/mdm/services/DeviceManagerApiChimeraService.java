package com.google.android.gms.mdm.services;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceManagerApiChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.mdm.services.DeviceManagerApiService.START".equals(intent.getAction())) {
            return new smz(this);
        }
        return null;
    }
}
