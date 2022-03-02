package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationModuleInitIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        jhg.a((Context) this, "com.google.android.gms.location.persistent.LocationPersistentService", true);
        jhg.a((Context) this, "com.google.android.location.reporting.service.UploadGcmTaskService", true);
        jhg.a((Context) this, "com.google.android.location.internal.NanoAppUpdaterGcmTaskService", true);
        int i2 = Build.VERSION.SDK_INT;
        jhg.a((Context) this, "com.google.android.location.fused.FusedLocationService", true);
        if (jkr.g()) {
            jhg.a((Context) this, "com.google.android.location.settings.NlpConsentFooterReceiver", true);
        }
        jhg.a((Context) this, "com.google.android.location.util.LocationAccuracyInjectorService", jkr.g());
        jix.g(this);
        Intent startIntent = IntentOperation.getStartIntent((Context) this, LocationPersistentInitIntentOperation.class, "com.google.android.gms.location.internal.INIT_RUNTIME_STATE");
        amrl.a((Object) startIntent);
        startIntent.putExtra("com.google.android.gms.location.internal.FLAGS", i);
        startService(startIntent);
    }
}
