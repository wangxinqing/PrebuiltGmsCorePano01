package com.google.android.gms.auth.uncertifieddevice;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UncertifiedNotificationIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || "android.intent.action.BOOT_COMPLETED".equals(action)) {
            UncertifiedNotificationChimeraService.b(this);
            if (axdg.b() && ent.ai() == 2) {
                UncertifiedNotificationChimeraService.a((Context) this);
            }
        }
    }
}
