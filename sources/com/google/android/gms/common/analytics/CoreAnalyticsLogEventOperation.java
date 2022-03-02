package com.google.android.gms.common.analytics;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CoreAnalyticsLogEventOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action)) {
            iap.a();
            iap.a(this, 12, ((Long) ikq.d.c()).longValue());
        } else if ("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED".equals(action)) {
            iap.a();
            iap.a(this, 13, ((Long) ikq.d.c()).longValue());
        }
    }
}
