package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdateSecretNumberBroadcastOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        int intExtra;
        if (azuf.d() && (intExtra = intent.getIntExtra("OPT_VALUE", 0)) != 0) {
            adtm a = adtm.a();
            synchronized (a.a) {
                SharedPreferences b = a.b();
                irk.a((Object) b, (Object) "Unexpected null from getPrefs.");
                SharedPreferences.Editor edit = b.edit();
                edit.putInt("DeviceWideCbSecretNumber", intExtra);
                edit.apply();
            }
        }
    }
}
