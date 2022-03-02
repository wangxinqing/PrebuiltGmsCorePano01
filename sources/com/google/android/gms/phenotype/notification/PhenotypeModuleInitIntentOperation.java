package com.google.android.gms.phenotype.notification;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.phenotype.platform.PhenotypeBootCompleteIntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhenotypeModuleInitIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        Context applicationContext = getApplicationContext();
        applicationContext.startService(IntentOperation.getStartIntent(applicationContext, PhenotypeBootCompleteIntentOperation.class, "android.intent.action.PHENOTYPE_BOOT_COMPLETED"));
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        jhg.a((Context) this, "com.google.android.gms.phenotype.service.FlagOverrideReceiver", true);
        if ((i & 12) != 0) {
            yij.a((Context) this);
        }
    }
}
