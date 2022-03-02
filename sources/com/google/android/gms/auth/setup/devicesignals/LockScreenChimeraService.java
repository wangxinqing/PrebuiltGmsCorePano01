package com.google.android.gms.auth.setup.devicesignals;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LockScreenChimeraService extends Service {
    public static boolean a = false;
    private BroadcastReceiver b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class ScreenOffReceiver extends nla {
        public ScreenOffReceiver() {
            super("auth_account");
        }

        public final void a(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                gkv.a(context).b();
            }
        }
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.setup.devicesignals.LockScreenService");
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        a = true;
        ScreenOffReceiver screenOffReceiver = new ScreenOffReceiver();
        this.b = screenOffReceiver;
        registerReceiver(screenOffReceiver, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    public final void onDestroy() {
        unregisterReceiver(this.b);
        a = false;
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !intent.getBooleanExtra("is_boot", false)) {
            return 1;
        }
        gkv.a((Context) this).a();
        return 1;
    }
}
