package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NlpNetworkProviderSettingsUpdateChimeraReceiver extends BroadcastReceiver {
    private static Boolean b = null;

    public static synchronized void a(Context context) {
        synchronized (NlpNetworkProviderSettingsUpdateChimeraReceiver.class) {
            boolean isProviderEnabled = ((LocationManager) context.getSystemService("location")).isProviderEnabled("network");
            if (b == null || b.booleanValue() != isProviderEnabled) {
                Boolean valueOf = Boolean.valueOf(isProviderEnabled);
                b = valueOf;
                if (valueOf.booleanValue()) {
                    new atir(context.getPackageName()).a(context);
                }
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a(context);
        }
    }
}
