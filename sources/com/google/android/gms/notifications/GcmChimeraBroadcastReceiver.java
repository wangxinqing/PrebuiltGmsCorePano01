package com.google.android.gms.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmChimeraBroadcastReceiver extends acsb {
    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        if (!aynt.a.a().e()) {
            String action = intent.getAction();
            if ("gcm".equals(nsp.a(context).a(intent)) || "com.google.android.gms.notifications.intents.SHOW_NOTIFICATION".equals(action)) {
                intent2 = IntentOperation.getStartIntent(context, GunsIntentOperation.class, "com.google.android.gms.notifications.intents.START_SERVICE");
                intent2.putExtras(intent);
            } else if ("com.google.android.gms.notifications.intents.HANDLE_NOTIFICATION_ACTION".equals(action)) {
                intent2 = IntentOperation.getStartIntent(context, GunsIntentOperation.class, "com.google.android.gms.notifications.intents.HANDLE_NOTIFICATION_ACTION");
                intent2.putExtras(intent);
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                acsb.b(context, intent2);
            }
        }
    }
}
