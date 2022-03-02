package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.gcm.gmsproc.GmsAutoStarter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmModuleInitIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        if (!aekv.a(this) || (axkn.e() && nrq.a(this))) {
            nqw.a((Context) this);
            if (nqw.c()) {
                Intent intent2 = new Intent(intent);
                String action = intent.getAction();
                if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
                    intent2.setAction("com.google.android.gcm.intent.USER_UNLOCKED");
                } else if ("android.intent.action.LOCKED_BOOT_COMPLETED".equals(action)) {
                    intent2.setAction((String) null);
                }
                intent2.setClassName(this, "com.google.android.gms.gcm.GcmService");
                startService(intent2);
            }
            if (!aekv.a(this)) {
                GmsAutoStarter.a(this, intent);
            }
        }
    }
}
