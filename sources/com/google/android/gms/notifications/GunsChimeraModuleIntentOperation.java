package com.google.android.gms.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GunsChimeraModuleIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        int i2 = i & 8;
        int i3 = i & 2;
        if ((i & 4) > 0 || i2 > 0 || i3 > 0) {
            Context applicationContext = getApplicationContext();
            Intent startIntent = IntentOperation.getStartIntent(applicationContext, GunsIntentOperation.class, "com.google.android.gms.notifications.intents.LOAD_NOTIFICATIONS_FROM_DB");
            if (intent != null) {
                startIntent.putExtras(intent);
            }
            applicationContext.startService(startIntent);
        }
    }
}
