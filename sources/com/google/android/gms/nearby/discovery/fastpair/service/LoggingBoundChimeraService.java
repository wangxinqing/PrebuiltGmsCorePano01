package com.google.android.gms.nearby.discovery.fastpair.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LoggingBoundChimeraService extends BoundService {
    public final IBinder onBind(Intent intent) {
        jjg jjg = tsp.a;
        return new aeht(getApplicationContext());
    }
}
