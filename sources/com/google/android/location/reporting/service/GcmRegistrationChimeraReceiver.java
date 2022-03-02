package com.google.android.location.reporting.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmRegistrationChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        ajnw.a(context);
        if (aztb.Q() && "com.google.android.gms.gcm.REGISTERED".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("GCM registration ID changed: ");
            sb.append(valueOf);
            ajix.a("GCoreUlr", sb.toString());
            ajnw.a(context, ajme.a(context, "com.google.android.location.reporting.GCM_ID_CHANGED"));
        }
    }
}
