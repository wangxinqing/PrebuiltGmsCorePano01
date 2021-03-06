package com.google.android.gms.gcm.registration;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmExportedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        nqw.a((Context) this);
        String action = intent.getAction();
        if ("com.google.iid.TOKEN_REQUEST".equals(action)) {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
            PushMessagingRegistrarChimeraProxy.a(this, intent);
            return;
        }
        String valueOf = String.valueOf(action);
        Log.w("GCM", valueOf.length() == 0 ? new String("ExportedIntentOperation dropping intent with unknown action: ") : "ExportedIntentOperation dropping intent with unknown action: ".concat(valueOf));
    }
}
