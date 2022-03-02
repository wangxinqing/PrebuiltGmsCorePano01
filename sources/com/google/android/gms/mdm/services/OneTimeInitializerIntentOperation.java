package com.google.android.gms.mdm.services;

import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OneTimeInitializerIntentOperation extends IntentOperation {
    private static final String a = OneTimeInitializerIntentOperation.class.getSimpleName();

    public final void onHandleIntent(Intent intent) {
        try {
            if ("com.google.android.gms.onetimeinitializer.ONE_TIME_INITIALIZED".equals(intent.getAction())) {
                int i = Build.VERSION.SDK_INT;
                int intValue = ((Integer) smo.k.a()).intValue();
                int i2 = Build.VERSION.SDK_INT;
                if (intValue == 0 && intent.getIntExtra("run_count", 0) == 0) {
                    smo.k.a((Object) 1);
                    snb.b(this, true);
                }
            }
        } catch (Exception e) {
            Log.e(a, "One time init failed.");
        }
    }
}
