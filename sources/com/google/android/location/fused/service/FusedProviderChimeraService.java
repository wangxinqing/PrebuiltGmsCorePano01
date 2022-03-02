package com.google.android.location.fused.service;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FusedProviderChimeraService extends Service {
    private IBinder a;

    public final IBinder onBind(Intent intent) {
        if ("com.android.location.service.FusedProvider".equals(intent.getAction())) {
            return this.a;
        }
        Log.e("GCoreFlp", "Invalid intent received in FusedProviderService.");
        return null;
    }

    public final void onDestroy() {
        this.a = null;
        super.onDestroy();
    }

    public final void onCreate() {
        IBinder iBinder;
        GmsHardwareFusedProvider gmsHardwareFusedProvider;
        int i = Build.VERSION.SDK_INT;
        if (!jkr.e()) {
            synchronized (GmsHardwareFusedProvider.a) {
                if (GmsHardwareFusedProvider.b == null) {
                    GmsHardwareFusedProvider.b = new GmsHardwareFusedProvider();
                }
                gmsHardwareFusedProvider = GmsHardwareFusedProvider.b;
            }
            iBinder = gmsHardwareFusedProvider.getBinder();
        } else {
            iBinder = null;
        }
        this.a = iBinder;
    }
}
