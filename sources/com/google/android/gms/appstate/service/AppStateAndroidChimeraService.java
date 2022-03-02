package com.google.android.gms.appstate.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppStateAndroidChimeraService extends Service {
    public static final HashMap a = new HashMap();
    public static final Object b = new Object();

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.appstate.service.START".equals(intent.getAction())) {
            return new ebh(this, this);
        }
        return null;
    }
}
