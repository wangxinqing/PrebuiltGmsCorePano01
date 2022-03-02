package com.google.android.gms.stats.controlledevents;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ControlledEventsPhenotypeUpdateOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (azmv.b() && "com.google.android.gms.phenotype.com.google.android.metrics.COMMITTED".equals(intent.getAction()) && "com.google.android.metrics".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            aguy.a(agvj.a("com.google.android.metrics"));
            acsi.a();
        }
    }
}
