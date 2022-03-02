package com.google.android.gms.udc.intentoperation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmRegistrationIntentOperation extends IntentOperation {
    private final amsv a;
    private final amsv b;

    public GcmRegistrationIntentOperation() {
        this.a = new adbl(this);
        this.b = new adbm(this);
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.gcm.REGISTERED".equals(intent.getAction())) {
            if (azrk.r()) {
                ((afyy) this.a.a()).c().a((Enum) acyn.PUSH_REGISTRATION);
            }
            try {
                ((aful) this.b.a()).e(aczd.SYNC_ID_CUSTOM_CACHE).get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    GcmRegistrationIntentOperation(afyy afyy, aful aful) {
        this.a = new adbn(afyy);
        this.b = new adbo(aful);
    }
}
