package com.google.android.gms.smartdevice.setup.accounts;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountsChimeraService extends Service {
    public static final iwd a = acqa.a("Setup", "Accounts", "AccountsService");
    public achr b;
    public Handler c;

    public final IBinder onBind(Intent intent) {
        a.a("onBind()", new Object[0]);
        if ("com.google.android.gms.smartdevice.setup.accounts.AccountsService.START".equals(intent.getAction())) {
            return new ache(this);
        }
        return null;
    }

    public final void onCreate() {
        a.a("onCreate()", new Object[0]);
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("AccountBootstrapBackground", 10);
        handlerThread.start();
        this.c = new qvr(handlerThread.getLooper());
    }

    public final void onDestroy() {
        a.a("onDestroy()", new Object[0]);
        achr achr = this.b;
        if (achr != null) {
            achr.a();
            this.b = null;
        }
        super.onDestroy();
    }
}
