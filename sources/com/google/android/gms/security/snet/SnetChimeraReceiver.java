package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.security.verifier.InternalApkUploadChimeraService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SnetChimeraReceiver extends IntentOperation {
    static {
        SnetChimeraReceiver.class.getSimpleName();
    }

    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            SnetGcmSchedulerChimeraIntentService.b(this);
            SnetGcmSchedulerChimeraIntentService.d(this);
            SafeBrowsingUpdateChimeraIntentService.b(this);
            InternalApkUploadChimeraService.a((Context) this);
            snb.e(this);
        }
    }
}
