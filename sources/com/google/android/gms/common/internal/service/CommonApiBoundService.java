package com.google.android.gms.common.internal.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CommonApiBoundService extends BoundService {
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.common.service.START".equals(intent.getAction())) {
            return new ivz(this, this);
        }
        return null;
    }
}
