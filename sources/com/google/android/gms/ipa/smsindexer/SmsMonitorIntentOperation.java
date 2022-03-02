package com.google.android.gms.ipa.smsindexer;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SmsMonitorIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        qtp c = qtp.c(this);
        if (c != null) {
            new Object[1][0] = intent.toString();
            String action = intent.getAction();
            if (jkr.c() && axvz.g() && !"com.google.android.gms.ipa.smsindexer.SMS_CHANGED".equals(action)) {
                return;
            }
            if ("android.provider.Telephony.SMS_RECEIVED".equals(action) || "android.provider.Telephony.WAP_PUSH_RECEIVED".equals(action) || "com.google.android.gms.ipa.smsindexer.SMS_CHANGED".equals(action)) {
                c.a(false, false);
            }
        }
    }
}
