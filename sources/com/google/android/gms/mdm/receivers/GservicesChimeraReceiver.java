package com.google.android.gms.mdm.receivers;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GservicesChimeraReceiver extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (!jix.a((Context) this) && "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction()) && !GoogleAccountsAddedChimeraReceiver.a()) {
            int i = crc.a;
            GoogleAccountsAddedChimeraReceiver.b();
        }
    }
}
