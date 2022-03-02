package com.google.firebase.auth.api.gms;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceStateChangedIntentOperation extends IntentOperation {
    private static final iwd a = new iwd("FirebaseAuth", "DeviceStateChangedIntentOperation");

    public DeviceStateChangedIntentOperation() {
    }

    public final void onHandleIntent(Intent intent) {
        a.a("Handle intent-operations: %s", intent);
        if (intent != null && "android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction())) {
            apox.a.a(getBaseContext());
        }
    }

    protected DeviceStateChangedIntentOperation(Context context) {
        attachBaseContext(context);
    }
}
