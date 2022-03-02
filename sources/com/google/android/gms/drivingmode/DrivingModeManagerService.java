package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DrivingModeManagerService extends BoundService {
    private lwh a;

    public final IBinder onBind(Intent intent) {
        lwh lwh = new lwh(getApplicationContext());
        this.a = lwh;
        if (!lwh.b) {
            lwh.b = true;
            lwh.a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(lwh);
        }
        lxb lxb = new lxb(getApplicationContext());
        return lxb.getInterfaceDescriptor() != null ? new lxj(lxb) : lxb;
    }

    public final boolean onUnbind(Intent intent) {
        lwh lwh = this.a;
        if (lwh.b) {
            lwh.b = false;
            Thread.setDefaultUncaughtExceptionHandler(lwh.a);
        }
        return super.onUnbind(intent);
    }
}
