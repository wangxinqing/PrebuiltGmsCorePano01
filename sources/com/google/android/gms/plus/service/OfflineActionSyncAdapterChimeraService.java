package com.google.android.gms.plus.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OfflineActionSyncAdapterChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        Context applicationContext = getApplicationContext();
        if (zaq.a == null) {
            zaq.a = new zaq(applicationContext, yrr.a(applicationContext), applicationContext.getPackageManager());
        }
        return zaq.a.getSyncAdapterBinder();
    }
}
