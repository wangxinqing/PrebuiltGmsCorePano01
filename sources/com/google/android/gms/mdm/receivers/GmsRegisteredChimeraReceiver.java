package com.google.android.gms.mdm.receivers;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GmsRegisteredChimeraReceiver extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (!jix.a((Context) this)) {
            smy.a();
            Intent a = smy.a(this, false, avup.GMS_GCM_REGISTERED);
            if (a != null) {
                int i = crc.a;
                startService(a);
            }
        }
    }
}
