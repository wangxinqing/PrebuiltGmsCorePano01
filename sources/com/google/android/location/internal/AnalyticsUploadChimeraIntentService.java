package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AnalyticsUploadChimeraIntentService extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        Boolean bool;
        Boolean bool2;
        if (ahym.a(aydu.a.a().reportSystemWideSettings())) {
            boolean z = true;
            boolean z2 = ajqk.a(this) == 2;
            LocationManager locationManager = (LocationManager) getSystemService("location");
            try {
                if (locationManager.isProviderEnabled("network")) {
                    try {
                        if (aeed.a(getContentResolver(), "network_location_opt_in", -1) != 1) {
                            z = false;
                        }
                    } catch (Exception e) {
                    }
                    bool = Boolean.valueOf(z);
                    bool2 = Boolean.valueOf(locationManager.isProviderEnabled("gps"));
                    aiyk aiyk = aiyk.g;
                    Boolean valueOf = Boolean.valueOf(aiyk.b((PowerManager) getSystemService("power")));
                    Boolean valueOf2 = Boolean.valueOf(aiyk.a((WifiManager) getApplicationContext().getSystemService("wifi"), (Context) this));
                    Boolean valueOf3 = Boolean.valueOf(jjm.a(this));
                    aipg a = aipg.a((Context) this);
                    a.a(Boolean.valueOf(z2), bool2, bool, valueOf2, valueOf3, valueOf);
                    a.a();
                }
                z = false;
                bool = Boolean.valueOf(z);
            } catch (Exception e2) {
                bool = null;
            }
            try {
                bool2 = Boolean.valueOf(locationManager.isProviderEnabled("gps"));
            } catch (Exception e3) {
                bool2 = null;
            }
            aiyk aiyk2 = aiyk.g;
            Boolean valueOf4 = Boolean.valueOf(aiyk2.b((PowerManager) getSystemService("power")));
            Boolean valueOf22 = Boolean.valueOf(aiyk2.a((WifiManager) getApplicationContext().getSystemService("wifi"), (Context) this));
            Boolean valueOf32 = Boolean.valueOf(jjm.a(this));
            aipg a2 = aipg.a((Context) this);
            a2.a(Boolean.valueOf(z2), bool2, bool, valueOf22, valueOf32, valueOf4);
            a2.a();
        }
    }
}
