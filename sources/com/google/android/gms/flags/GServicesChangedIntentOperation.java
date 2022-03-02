package com.google.android.gms.flags;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GServicesChangedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        nfc.a(this);
    }
}
