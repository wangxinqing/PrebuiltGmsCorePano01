package com.google.android.gms.ads.identifier.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import com.google.android.gms.ads.identifier.internal.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AdvertisingIdChimeraBoundService extends BoundService {
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
