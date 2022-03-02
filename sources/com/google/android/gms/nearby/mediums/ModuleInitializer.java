package com.google.android.gms.nearby.mediums;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleInitializer extends IntentOperation {
    private static final String a = jkq.a("com.google.android.gms.nearby");

    public final void onHandleIntent(Intent intent) {
        if ((!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && !a.equals(intent.getAction())) || "com.google.android.gms.nearby".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            tfy.a(this, "com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingService", aymi.L());
            if (aymi.a.a().w()) {
                upf.a().c(this);
            }
        }
    }
}
