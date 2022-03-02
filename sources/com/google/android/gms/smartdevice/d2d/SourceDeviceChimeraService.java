package com.google.android.gms.smartdevice.d2d;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SourceDeviceChimeraService extends Service {
    public static final abpn a = abpn.a;
    public static final acab b = acab.a;
    private static final iwd e = acqa.a("D2D", "SourceDeviceChimeraService");
    public Handler c;
    public LifecycleSynchronizer d;
    private abqe f;

    public final IBinder onBind(Intent intent) {
        e.a("onBind()", new Object[0]);
        if ("com.google.android.gms.smartdevice.d2d.SourceDeviceService.START".equals(intent.getAction())) {
            return this.f;
        }
        return null;
    }

    public final void onCreate() {
        e.a("onCreate()", new Object[0]);
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("SourceDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.c = new qvr(handlerThread.getLooper());
        this.f = new abqe(this);
        this.d = new LifecycleSynchronizer(this);
    }

    public final void onDestroy() {
        e.a("onDestroy()", new Object[0]);
        absd absd = this.f.a;
        if (absd != null) {
            absd.c();
        }
        acqe.a();
        acpl.a(this.c);
        super.onDestroy();
    }
}
