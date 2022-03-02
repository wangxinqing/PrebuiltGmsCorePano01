package com.google.android.gms.ads.identifier.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.ads.identifier.internal.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AdvertisingIdChimeraService extends Service {
    private c a;

    public final IBinder onBind(Intent intent) {
        c cVar = this.a;
        cVar.asBinder();
        return cVar;
    }

    public final void onCreate() {
        this.a = new c((byte[]) null);
    }
}
