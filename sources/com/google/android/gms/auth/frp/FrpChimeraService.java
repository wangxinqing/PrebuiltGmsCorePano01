package com.google.android.gms.auth.frp;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FrpChimeraService extends Service {
    private gfo a;

    static {
        new iwd("GLSActivity", "FrpService");
    }

    public final IBinder onBind(Intent intent) {
        gfo gfo = this.a;
        gfo.asBinder();
        return gfo;
    }

    public final void onCreate() {
        this.a = new gfo(this);
    }
}
