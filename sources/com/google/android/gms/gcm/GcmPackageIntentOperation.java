package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmPackageIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (!"android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || !intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            GcmProxyIntentOperation.a((Context) this, intent);
        }
    }

    public static ntx a(Intent intent, int i) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return ntx.a(str, i);
        }
        return null;
    }
}
