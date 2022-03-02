package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhenotypeUpdateIntentOperation extends IntentOperation {
    private static final String a = jkq.a("com.google.android.location");

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && "com.google.android.location".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            if (jkr.c()) {
                jhg.a((Context) this, "com.google.android.location.settings.DrivingConditionProvider", axzs.c());
            }
            ayae.c();
            if (ayab.c()) {
                jhg.a((Context) this, "com.google.android.location.settings.EAlertSettingsActivity", false);
                jhg.a((Context) this, "com.google.android.location.service.EAlertSettingInjectorService", false);
            }
        }
    }
}
