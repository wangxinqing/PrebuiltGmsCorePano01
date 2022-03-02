package com.google.android.gms.scheduler;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SchedulerProxyIntentOperation extends IntentOperation {
    public static void a(Intent intent, int i) {
        boolean z;
        if (nqw.d() == 0) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        if (i < 0) {
            Log.w("GCM", "Dispatching intent with invalid user serial");
            return;
        }
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_REPLACED".equals(action)) {
            ntx a = SchedulerPackageIntentOperation.a(intent, i);
            if (a != null) {
                aabg.a().d.a(a);
            }
        } else if ("android.intent.action.PACKAGE_FULLY_REMOVED".equals(action)) {
            ntx a2 = SchedulerPackageIntentOperation.a(intent, i);
            if (a2 != null) {
                aabg.a().d.b(a2);
            }
        } else {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Unexpected forwarded intent: ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (!"com.google.android.gms.gcm.nts.USER_FORWARD".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Unexpected intent: ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
            return;
        }
        Intent intent2 = (Intent) intent.getParcelableExtra("intent");
        int intExtra = intent.getIntExtra("userSerial", -1);
        if (intent2 != null) {
            a(intent2, intExtra);
        }
    }
}
