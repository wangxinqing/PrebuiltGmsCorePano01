package com.google.android.gms.nearby.messages;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GcmRegistrationChimeraReceiver extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.gcm.REGISTERED".equals(intent.getAction())) {
            jjg jjg = tgc.a;
            getSharedPreferences("copresence_gcm_pref", 0).edit().putBoolean("require_sync_to_server", true).commit();
        }
    }
}
