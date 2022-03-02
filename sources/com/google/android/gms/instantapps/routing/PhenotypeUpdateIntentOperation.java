package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PhenotypeUpdateIntentOperation extends IntentOperation {
    static {
        new qfn("PhenotypeUpdateIntentOperation");
    }

    public final void onCreate() {
    }

    public final void onHandleIntent(Intent intent) {
        new Object[1][0] = intent;
        if (intent != null && "com.google.android.gms.phenotype.UPDATE".equals(intent.getAction()) && "com.google.android.gms.instantapps".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")) && axuy.a.a().G()) {
            DomainFilterUpdateChimeraService.b();
        }
    }
}
