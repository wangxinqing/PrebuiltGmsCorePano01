package com.google.android.gms.phenotype.platform;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhenotypeBootCompleteIntentOperation extends IntentOperation {
    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public final void onHandleIntent(Intent intent) {
        if (!"android.intent.action.PHENOTYPE_BOOT_COMPLETED".equals(intent.getAction())) {
            intent.getAction();
        } else if (yhe.a()) {
            yfh.a();
            yhj.a();
        }
    }
}
