package com.google.android.location.internal.server;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HardwareArProviderChimeraService extends Service {
    private IBinder a;

    public final IBinder onBind(Intent intent) {
        if (!"com.android.location.service.ActivityRecognitionProvider".equals(intent.getAction()) || axwl.b()) {
            return null;
        }
        return this.a;
    }

    public final void onCreate() {
        this.a = aivz.a().a();
    }

    public final void onDestroy() {
        this.a = null;
        super.onDestroy();
    }
}
