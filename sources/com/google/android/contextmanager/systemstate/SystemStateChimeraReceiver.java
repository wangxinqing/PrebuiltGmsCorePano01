package com.google.android.contextmanager.systemstate;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SystemStateChimeraReceiver extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        new Object[1][0] = action;
        if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(action) || "com.google.android.gms.location.reporting.DELETE_OPERATION".equals(action) || "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || "com.google.android.gms.phenotype.COMMITTED".equals(action) || ckr.a.equals(action)) {
            cbi.k().a(new cko(intent), bvq.a("HandleSystemStateOnReceive"));
        }
    }
}
