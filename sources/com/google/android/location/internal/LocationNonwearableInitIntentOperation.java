package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationNonwearableInitIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        jix.g(this);
        Intent startIntent = IntentOperation.getStartIntent((Context) this, LocationNonwearablePersistentInitIntentOperation.class, "com.google.android.gms.location.internal.INIT_RUNTIME_STATE");
        iva.a((Object) startIntent);
        startIntent.putExtra("com.google.android.gms.location.internal.FLAGS", i);
        startService(startIntent);
    }
}
