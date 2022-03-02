package com.google.android.gms.config;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ConfigIntentListener$PackageIntentOperation extends IntentOperation {
    private static final String a(Intent intent) {
        return intent.getData().getSchemeSpecificPart();
    }

    public final void onHandleIntent(Intent intent) {
        String schemeSpecificPart;
        String a;
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data != null && (schemeSpecificPart = data.getSchemeSpecificPart()) != null && !schemeSpecificPart.isEmpty()) {
                if ("android.intent.action.PACKAGE_DATA_CLEARED".equals(action)) {
                    String a2 = a(intent);
                    if (a2 != null) {
                        joe.a();
                        joe.a(this, "com.google.android.gms.config.ACTION_PACKAGE_DATA_CLEARED", a2);
                    }
                } else if ("android.intent.action.PACKAGE_REMOVED".equals(action) && !intent.getBooleanExtra("android.intent.extra.REPLACING", false) && (a = a(intent)) != null) {
                    joe.a();
                    joe.a(this, "com.google.android.gms.config.ACTION_PACKAGE_FULLY_REMOVED", a);
                }
            }
        }
    }
}
