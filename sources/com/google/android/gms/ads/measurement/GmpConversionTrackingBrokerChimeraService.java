package com.google.android.gms.ads.measurement;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.ads.internal.util.client.c;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GmpConversionTrackingBrokerChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        c.a("Binding to the conversion tracking service");
        if ("com.google.android.gms.ads.measurement.service.START".equals(intent.getAction())) {
            return new a(this, this);
        }
        return null;
    }
}
