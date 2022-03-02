package com.google.android.gms.smartdevice.d2d;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TargetDeviceChimeraService extends Service {
    public static abpn a = abpn.a;
    public static acab b = acab.a;
    public static final /* synthetic */ int e = 0;
    private static final iwd f = acqa.a("D2D", "TargetDeviceChimeraService");
    public Handler c;
    public LifecycleSynchronizer d;
    private abtn g;

    public final IBinder onBind(Intent intent) {
        f.a("onBind()", new Object[0]);
        if ("com.google.android.gms.smartdevice.d2d.TargetDeviceService.START".equals(intent.getAction())) {
            return this.g;
        }
        return null;
    }

    public final void onCreate() {
        f.a("onCreate()", new Object[0]);
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("TargetDeviceBackground", 10);
        handlerThread.start();
        handlerThread.getLooper();
        this.d = new LifecycleSynchronizer(this);
        this.c = new qvr(handlerThread.getLooper());
        this.g = new abtn(this);
    }

    public final void onDestroy() {
        f.a("onDestroy()", new Object[0]);
        abva abva = this.g.a;
        if (abva != null) {
            abva.b();
        }
        acpl.a(this.c);
        super.onDestroy();
    }
}
