package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DrivingModeLocationFrxIntentOperation extends lvu {
    public final void onHandleIntent(Intent intent) {
        Log.i("CAR.DRIVINGMODE", "DrivingModeFrxIntentOperation onHandleIntent from location module");
        if ("com.google.android.gms.drivingmode.GEARHEAD_FRX_COMPLETED".equals(intent.getAction())) {
            lww.a();
            lww.h(getApplicationContext()).a.edit().putBoolean("gearhead_frx_completed", true).apply();
        }
    }
}
