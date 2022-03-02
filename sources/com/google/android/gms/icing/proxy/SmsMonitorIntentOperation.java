package com.google.android.gms.icing.proxy;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SmsMonitorIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        poo c = poo.c(this);
        if (c != null) {
            pnz.d("Handling %s", intent.toString());
            String action = intent.getAction();
            if (!jkr.c() || !((Boolean) ozx.an.c()).booleanValue() || "com.google.android.gms.icing.proxy.action.SMS_CHANGED".equals(action)) {
                boolean z = true;
                if (!"android.provider.Telephony.SMS_RECEIVED".equals(action) && !"android.provider.Telephony.WAP_PUSH_RECEIVED".equals(action)) {
                    z = false;
                }
                if (z || "com.google.android.gms.icing.proxy.action.SMS_CHANGED".equals(action)) {
                    c.a(z);
                }
            }
        }
    }
}
