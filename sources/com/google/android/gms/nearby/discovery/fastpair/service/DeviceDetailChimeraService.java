package com.google.android.gms.nearby.discovery.fastpair.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceDetailChimeraService extends BoundService {
    private aehr a;

    public final IBinder onBind(Intent intent) {
        ((anih) tsp.a.d()).a("FastPair: Device detail service bound to intent %s", (Object) intent);
        if (!aymw.a.a().R()) {
            ((anih) tsp.a.d()).a("FastPair: Device detail service not enabled");
            return null;
        } else if (!"com.google.android.gms.nearby.discovery.fastpair.ACTION_BIND_DEVICE_DETAIL".equals(intent.getAction())) {
            return null;
        } else {
            if (this.a == null) {
                this.a = new aehr(this);
            }
            return this.a;
        }
    }

    public final boolean onUnbind(Intent intent) {
        ((anih) tsp.a.d()).a("FastPair: Device detail service unbind to intent %s", (Object) intent);
        return super.onUnbind(intent);
    }
}
