package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SchedulerModuleInitIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        if (!aekv.a(this) || (axkn.e() && axkn.d())) {
            nqw.a((Context) this);
            if (nqw.c()) {
                jhg.a((Context) this, "com.google.android.gms.gcm.nts.SchedulerService", true);
                Intent intent2 = new Intent(intent);
                String action = intent.getAction();
                if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
                    intent2.setAction("com.google.android.gms.scheduler.intent.USER_UNLOCKED");
                } else if ("android.intent.action.LOCKED_BOOT_COMPLETED".equals(action)) {
                    intent2.setAction((String) null);
                }
                intent2.setClassName(this, "com.google.android.gms.gcm.nts.SchedulerService");
                startService(intent2);
            }
        }
    }
}
