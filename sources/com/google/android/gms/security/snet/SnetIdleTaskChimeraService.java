package com.google.android.gms.security.snet;

import android.content.Intent;
import android.os.IBinder;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SnetIdleTaskChimeraService extends qwf {
    private IBinder a = new aawu();

    static {
        SnetIdleTaskChimeraService.class.getSimpleName();
    }

    public final int a(qxz qxz) {
        SnetGcmSchedulerChimeraIntentService.c(this);
        return 0;
    }

    public final void aH() {
        SnetGcmSchedulerChimeraIntentService.d(this);
    }

    public final IBinder onBind(Intent intent) {
        IBinder onBind = super.onBind(intent);
        return onBind == null ? this.a : onBind;
    }
}
