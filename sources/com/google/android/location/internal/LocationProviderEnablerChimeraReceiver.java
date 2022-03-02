package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationProviderEnablerChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("locationMode", 0);
        if (intExtra != 0) {
            int intExtra2 = intent.getIntExtra("source", 0);
            new aioi(context).a(intExtra, (aiol) null, aqng.a(intExtra2), intent.getIntArrayExtra("textResources"));
        }
    }
}
