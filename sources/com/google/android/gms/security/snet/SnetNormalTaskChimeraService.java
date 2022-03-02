package com.google.android.gms.security.snet;

import android.content.Intent;
import android.os.IBinder;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SnetNormalTaskChimeraService extends qwf {
    private IBinder a = new aawx();

    static {
        SnetNormalTaskChimeraService.class.getSimpleName();
    }

    public final int a(qxz qxz) {
        String str = qxz.a;
        if (((str.hashCode() == -487742654 && str.equals("event_log_collector_runner")) ? (char) 0 : 65535) == 0 && azfv.m() && azfv.g()) {
            SnetGcmSchedulerChimeraIntentService.a(this);
        }
        return 0;
    }

    public final void aH() {
        SnetGcmSchedulerChimeraIntentService.b(this);
    }

    public final IBinder onBind(Intent intent) {
        IBinder onBind = super.onBind(intent);
        return onBind == null ? this.a : onBind;
    }
}
