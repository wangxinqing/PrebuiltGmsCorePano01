package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PackageAddedIntentOperation extends IntentOperation {
    private Context a;

    static {
        PackageAddedIntentOperation.class.getSimpleName();
    }

    public final void onCreate() {
        this.a = getApplicationContext();
    }

    public final void onHandleIntent(Intent intent) {
        String str;
        if (intent != null && "android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
            Uri data = intent.getData();
            if (data != null) {
                str = data.getSchemeSpecificPart();
            } else {
                str = null;
            }
            if (str != null) {
                Intent intent2 = new Intent("com.google.android.vending.verifier.ACTION_CHECK_VERIFY_INSTALL");
                intent2.setPackage("com.android.vending");
                intent2.putExtra("package_name", str);
                this.a.sendBroadcast(intent2);
            }
        }
    }
}
