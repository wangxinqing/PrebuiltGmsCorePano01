package com.google.android.gms.usagereporting.service;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InitIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        jix.g(getApplicationContext());
        if ((i & 14) != 0 && aztt.e()) {
            int i2 = Build.VERSION.SDK_INT;
            startService(IntentOperation.getStartIntent((Context) this, InitHandler.class, "com.google.android.gms.usagereporting.init"));
        }
    }
}
