package com.google.android.gms.usagereporting.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Process;
import android.os.SystemProperties;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InitHandler extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        boolean z;
        if (!Process.myUserHandle().isOwner()) {
            adtm a = adtm.a();
            synchronized (a.a) {
                boolean z2 = false;
                if (!adtl.a() && !SystemProperties.getBoolean("ro.fw.mu.headless_system_user", false) && !SystemProperties.getBoolean("android.car.systemuser.headless", false)) {
                    z2 = true;
                }
                SharedPreferences b = a.b();
                irk.a((Object) b, (Object) "Unexpected null from getPrefs.");
                z = b.getBoolean("OptInUsageReporting", z2);
            }
            adtl.a(this, z);
            return;
        }
        adtm.a().a((Context) this);
    }
}
