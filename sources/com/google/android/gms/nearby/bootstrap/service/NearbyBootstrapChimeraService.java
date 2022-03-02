package com.google.android.gms.nearby.bootstrap.service;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NearbyBootstrapChimeraService extends Service {
    public static final anil a = anil.a("NearbyBootstrap");
    public tfq b;
    public Handler c;

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START".equals(intent.getAction())) {
            return new tff(this);
        }
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("NearbyBootstrapBackground", 10);
        handlerThread.start();
        this.c = new qvr(handlerThread.getLooper());
    }

    public final void onDestroy() {
        tfq tfq = this.b;
        if (tfq != null) {
            tdf tdf = tfq.b;
            if (tdf != null) {
                tdf.a((teb) null);
            }
            jca.a().a(tfq.c, tfq.e);
            tfq.b = null;
            this.b = null;
        }
        Looper looper = this.c.getLooper();
        if (looper != null) {
            looper.quit();
        }
        super.onDestroy();
    }
}
