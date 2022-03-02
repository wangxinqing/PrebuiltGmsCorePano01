package com.google.android.gms.plus.service;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class DefaultChimeraIntentService extends hcz {
    private static hdb i = new hdb();
    public yrr a;

    public DefaultChimeraIntentService() {
        super("DefaultIntentService", i);
    }

    public static void a(Context context, hcy hcy) {
        i.add(hcy);
        context.startService(jhg.g("com.google.android.gms.plus.service.default.INTENT").setClassName(context, "com.google.android.gms.plus.service.DefaultIntentService"));
    }

    public final void onCreate() {
        super.onCreate();
        this.a = yrr.a(this);
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        if (intent.getBooleanExtra("isLoggingIntent", false)) {
            i.addFirst(new yll(this, intent));
        }
        return super.onStartCommand(intent, i2, i3);
    }
}
