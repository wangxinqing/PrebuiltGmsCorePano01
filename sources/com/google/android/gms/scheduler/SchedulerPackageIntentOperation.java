package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SchedulerPackageIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (!"android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || !intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            nqw.a((Context) this);
            if (nqw.d() == 0) {
                SchedulerProxyIntentOperation.a(intent, 0);
                return;
            }
            Intent intent2 = new Intent("com.google.android.gms.gcm.nts.USER_FORWARD");
            intent2.setClassName(this, "com.google.android.gms.chimera.GmsIntentOperationService$PersistentInternalReceiver");
            intent2.putExtra("intent", intent);
            intent2.putExtra("userSerial", nqw.d());
            nqw.a((Context) this, intent2);
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
