package com.google.android.gms.appstate.service;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PackageChangedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String str;
        if (!awhx.b() && "android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) && !intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            Uri data = intent.getData();
            if (data != null) {
                str = data.getSchemeSpecificPart();
            } else {
                str = null;
            }
            if (str != null) {
                AppStateIntentChimeraService.a(this, AppStateIntentChimeraService.a, new ebm(str));
            }
        }
    }
}
