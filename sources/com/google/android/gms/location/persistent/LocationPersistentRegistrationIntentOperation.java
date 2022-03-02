package com.google.android.gms.location.persistent;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationPersistentRegistrationIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.location.persistent.REGISTER".equals(intent.getAction())) {
            ahqa.c(this);
        }
    }
}
