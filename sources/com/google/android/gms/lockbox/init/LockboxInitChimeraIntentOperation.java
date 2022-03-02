package com.google.android.gms.lockbox.init;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LockboxInitChimeraIntentOperation extends hec {
    private static final String[] a = {"com.google.android.gms.lockbox.LockboxAlarmReceiver", "com.google.android.gms.lockbox.LockboxService", "com.google.android.gms.lockbox.service.LockboxBrokerService"};

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        if ((i & 14) != 0) {
            startService(jhg.h("com.google.android.gms.lockbox.LockboxService"));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        for (String a2 : a) {
            jhg.a((Context) this, a2, true);
        }
    }
}
