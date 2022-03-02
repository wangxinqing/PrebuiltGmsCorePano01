package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhenotypeChangeListenerIntentOperation extends IntentOperation {
    private static final String a = jkq.a("com.google.android.gms.measurement");

    public final void onHandleIntent(Intent intent) {
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || a.equals(intent.getAction())) && "com.google.android.gms.measurement".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            svv.a((Context) this).E().k.a("Measurement Phenotype flag(s) updated");
        }
    }
}
