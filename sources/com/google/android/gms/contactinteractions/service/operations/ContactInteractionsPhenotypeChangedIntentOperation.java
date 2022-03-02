package com.google.android.gms.contactinteractions.service.operations;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.contactinteractions.service.ContactInteractionsChimeraTaskService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ContactInteractionsPhenotypeChangedIntentOperation extends IntentOperation {
    static final String a = jkq.a("com.google.android.gms.contactinteractions");

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (intent == null) {
            return;
        }
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && "com.google.android.gms.contactinteractions".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ContactInteractionsChimeraTaskService.c(this);
        }
    }
}
