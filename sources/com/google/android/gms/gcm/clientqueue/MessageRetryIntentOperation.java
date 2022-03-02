package com.google.android.gms.gcm.clientqueue;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MessageRetryIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        nrj f = nrr.a().f();
        nud nud = f.h;
        if (nud.a) {
            for (ntx ntx : nud.d.a(f)) {
                nxy nxy = nxy.CLIENT_QUEUE_APP_DOES_NOT_SUPPORT_RETRIES;
                nud.c.a(ntx);
                nud.d.b(ntx, nxy);
            }
            nud.a();
        }
    }
}
