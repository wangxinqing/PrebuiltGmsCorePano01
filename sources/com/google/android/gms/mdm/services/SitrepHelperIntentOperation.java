package com.google.android.gms.mdm.services;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SitrepHelperIntentOperation extends IntentOperation {
    public static avup a(Intent intent, String str) {
        if (!intent.hasExtra(str)) {
            return avup.UNKNOWN;
        }
        avup a = avup.a(intent.getIntExtra(str, 0));
        return a == null ? avup.UNKNOWN : a;
    }

    public final void onHandleIntent(Intent intent) {
        Intent a;
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("force", false);
            boolean booleanExtra2 = intent.getBooleanExtra("enabled", false);
            avup a2 = a(intent, "reason");
            if ("com.google.android.gms.mdm.services.ACTION_DEVICE_ADMIN_CHANGED".equals(intent.getAction())) {
                Intent a3 = smy.a(this, booleanExtra, a2, avup.UNKNOWN, booleanExtra2, snh.a(this));
                if (a3 != null) {
                    int i = crc.a;
                    startService(a3);
                }
            } else if ("com.google.android.gms.mdm.services.ACTION_DIALOG_DISMISSED".equals(intent.getAction()) && (a = smy.a(this, booleanExtra, a2)) != null) {
                startService(a);
            }
        }
    }
}
