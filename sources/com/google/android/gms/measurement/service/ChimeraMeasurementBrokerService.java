package com.google.android.gms.measurement.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ChimeraMeasurementBrokerService extends Service {
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.measurement.START".equals(intent.getAction())) {
            return new tai(this);
        }
        return null;
    }
}
