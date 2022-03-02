package com.google.android.places;

import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlacesTaskChimeraService extends qwf {
    public final int a(qxz qxz) {
        char c;
        String str = qxz.a;
        if (str.hashCode() == -684799771 && str.equals("Places.PlacesTaskChimeraService.PREFETCHING_TASK_TAG")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            return 2;
        }
        SharedPreferences sharedPreferences = getSharedPreferences("PlacesTaskChimeraServicePreferences", 0);
        long j = sharedPreferences.getLong("lastPrefetchMillis", -1);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j > azco.a.a().d()) {
            Intent intent = new Intent("com.google.android.gms.location.places.PlaceDetectionAsyncService");
            intent.setPackage(getPackageName());
            intent.putExtra("PREFETCHING", "PREFETCHING");
            startService(intent);
            sharedPreferences.edit().putLong("lastPrefetchMillis", currentTimeMillis).apply();
        }
        return 0;
    }
}
