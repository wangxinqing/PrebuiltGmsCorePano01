package com.google.android.location.reporting.state.update;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ExternalChangeIntentReceiver extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (jjy.a(this)) {
            ajmi.a((Context) this, intent);
        } else if (Log.isLoggable("GCoreUlr", 4)) {
            Log.i("GCoreUlr", "ULR code skipped on unsupported form factor.");
        }
    }
}
