package com.google.android.gms.mdm.receivers;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ActivateDeviceAdminUponUnlockChimeraReceiver extends IntentOperation {
    private static boolean a;

    public static synchronized void a(boolean z) {
        synchronized (ActivateDeviceAdminUponUnlockChimeraReceiver.class) {
            a = z;
        }
    }

    public static synchronized boolean a() {
        boolean z;
        synchronized (ActivateDeviceAdminUponUnlockChimeraReceiver.class) {
            z = a;
        }
        return z;
    }

    public final void onHandleIntent(Intent intent) {
        if (a() && "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            if (!snb.b(this)) {
                Intent intent2 = new Intent("com.google.android.gms.settings.SECURITY_SETTINGS");
                intent2.setPackage(getPackageName());
                intent2.putExtra("show_modal_request", true);
                intent2.addFlags(276824064);
                startActivity(intent2);
            }
            a(false);
        }
    }
}
