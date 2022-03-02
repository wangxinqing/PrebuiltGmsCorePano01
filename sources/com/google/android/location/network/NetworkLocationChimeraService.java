package com.google.android.location.network;

import android.content.Intent;
import android.location.Location;
import android.os.IBinder;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkLocationChimeraService extends jfl {
    private NetworkLocationProvider b;

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        if (intent != null) {
            Location a = atiq.a(intent);
            if (this.b != null && a != null) {
                atiq.a(a, true);
                rev.a(a, "noGPSLocation", new Location(a));
                NetworkLocationProvider networkLocationProvider = this.b;
                networkLocationProvider.e.a();
                networkLocationProvider.reportLocation(a);
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        if (hxy.d(this)) {
            return null;
        }
        if (this.b == null) {
            NetworkLocationProvider networkLocationProvider = new NetworkLocationProvider(getApplicationContext());
            this.b = networkLocationProvider;
            networkLocationProvider.c.a(networkLocationProvider.g, networkLocationProvider.b.getLooper());
            networkLocationProvider.c.a(networkLocationProvider.f, networkLocationProvider.b.getLooper());
            networkLocationProvider.d.a();
            networkLocationProvider.a();
        }
        ahpx.a(getApplicationContext());
        if (jkr.h() && ajpu.a(getApplicationContext())) {
            ajpz.a(getApplicationContext()).a("com.google.android.gms.location.history");
        }
        return this.b.getBinder();
    }

    public final void onDestroy() {
        NetworkLocationProvider networkLocationProvider = this.b;
        if (networkLocationProvider != null) {
            networkLocationProvider.d.b();
            networkLocationProvider.c.a(networkLocationProvider.f);
            networkLocationProvider.c.a(networkLocationProvider.g);
            this.b = null;
        }
        this.a.quit();
    }
}
