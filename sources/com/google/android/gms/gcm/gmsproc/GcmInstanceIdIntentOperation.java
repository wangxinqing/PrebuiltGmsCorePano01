package com.google.android.gms.gcm.gmsproc;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmInstanceIdIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        Log.i("GCM", "Refreshing GMS registration due to token refresh");
        qwq a = qwq.a((Context) this);
        nsm.b(this).edit().remove("regId").commit();
        nvu.a(this, a);
    }
}
