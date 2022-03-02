package com.google.android.location.reporting.service;

import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReportingAndroidChimeraService extends Service {
    public ajmm a;
    public ajmo b;
    private Future c;

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.location.reporting.service.START".equals(intent.getAction())) {
            return new ajlp(this, this);
        }
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.c = new jfv(1, 9).submit((Runnable) new ajlo(this));
    }

    public final void a() {
        try {
            this.c.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RemoteException();
        }
    }
}
