package com.google.android.gms.auth.account.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.Service;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WorkAccountChimeraService extends Service {
    public static final iwd a = ehv.a("WorkAccount");
    private esc b;
    private fys c;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ChimeraReceiver extends BroadcastReceiver {
        public final void onReceive(Context context, Intent intent) {
            iwd iwd = WorkAccountChimeraService.a;
            String valueOf = String.valueOf(intent.getAction());
            iwd.c(valueOf.length() == 0 ? new String("update authenticator enabled for intent: ") : "update authenticator enabled for intent: ".concat(valueOf), new Object[0]);
            Intent intent2 = new Intent("com.google.android.gms.auth.account.ACTION_UPDATE_WORK_AUTHENTICATOR");
            intent2.setClassName(context, "com.google.android.gms.auth.account.service.WorkAccountService");
            context.startService(intent2);
        }
    }

    public final synchronized IBinder onBind(Intent intent) {
        String action;
        action = intent.getAction();
        a.b("onBind with action %s", action);
        return action != null ? new esb(this, this.b, this.c) : null;
    }

    public final void onCreate() {
        super.onCreate();
        this.b = new esc(this, new LifecycleSynchronizer(this));
        this.c = (fys) fys.d.b();
    }
}
