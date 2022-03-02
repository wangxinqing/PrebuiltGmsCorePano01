package com.google.android.chimera;

import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class IntentService extends Service {
    private volatile Looper Dk;
    private volatile bjj b;
    private String c;
    private boolean d;

    public IntentService(String str) {
        this.c = str;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15);
        sb.append("IntentService[");
        sb.append(str);
        sb.append("]");
        HandlerThread handlerThread = new HandlerThread(sb.toString());
        handlerThread.start();
        this.Dk = handlerThread.getLooper();
        this.b = new bjj(this, this.Dk);
    }

    public void onDestroy() {
        this.Dk.quit();
    }

    public abstract void onHandleIntent(Intent intent);

    public void onStart(Intent intent, int i) {
        Message obtainMessage = this.b.obtainMessage();
        obtainMessage.arg1 = i;
        obtainMessage.obj = intent;
        this.b.sendMessage(obtainMessage);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return this.d ? 3 : 2;
    }

    public void setIntentRedelivery(boolean z) {
        this.d = z;
    }
}
