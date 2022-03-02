package com.google.android.gms.googlehelp.service;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ClearHelpHistoryChimeraIntentOperation extends IntentOperation {

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public class PackageActionIntentOperation extends IntentOperation {
        public final void onHandleIntent(Intent intent) {
            String str;
            if (intent != null && "android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) {
                Uri data = intent.getData();
                if (data != null) {
                    str = data.getSchemeSpecificPart();
                } else {
                    str = "";
                }
                Intent intent2 = new Intent("com.google.android.gms.googlehelp.clear_help_history");
                intent2.putExtra("app_package_name", str);
                startService(new Intent("com.google.android.chimera.container.IntentOperationService.MODULE_SPECIFIC").setPackage("com.google.android.gms").putExtra("moduleid", "com.google.android.gms.googlehelp").putExtra("intent", intent2));
            }
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("app_package_name");
            if (!TextUtils.isEmpty(stringExtra)) {
                okc okc = new okc(this);
                ofn ofn = new ofn(this);
                onj onj = new onj(this, stringExtra);
                okc.b(stringExtra);
                okc.close();
                ofn.b(stringExtra);
                ofn.close();
                onj.b();
                onj.close();
            }
        }
    }
}
