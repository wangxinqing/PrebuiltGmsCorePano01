package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UsageReportingChimeraService extends BoundService {
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.usagereporting.service.START".equals(intent.getAction())) {
            return new adtn(this);
        }
        return null;
    }
}
