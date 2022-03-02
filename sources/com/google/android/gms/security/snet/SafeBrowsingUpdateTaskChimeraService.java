package com.google.android.gms.security.snet;

import android.content.Intent;
import android.os.IBinder;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SafeBrowsingUpdateTaskChimeraService extends qwf {
    private IBinder a = new aawm();

    static {
        SafeBrowsingUpdateTaskChimeraService.class.getSimpleName();
    }

    public final int a(qxz qxz) {
        SafeBrowsingUpdateChimeraIntentService.a(this);
        return 0;
    }

    public final void aH() {
        SafeBrowsingUpdateChimeraIntentService.b(this);
    }

    public final IBinder onBind(Intent intent) {
        IBinder onBind = super.onBind(intent);
        return onBind == null ? this.a : onBind;
    }
}
