package com.google.android.gms.lockbox.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LockboxBrokerChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.lockbox.service.START".equals(intent.getAction())) {
            return new rqd(this, this);
        }
        return null;
    }
}
