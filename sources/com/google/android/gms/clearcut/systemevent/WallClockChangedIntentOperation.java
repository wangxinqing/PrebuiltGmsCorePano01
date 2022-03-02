package com.google.android.gms.clearcut.systemevent;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WallClockChangedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        new Object[1][0] = intent.getAction();
        if (!awtf.g()) {
            ClearcutLoggerChimeraService.a.execute(hvw.a);
        }
    }
}
