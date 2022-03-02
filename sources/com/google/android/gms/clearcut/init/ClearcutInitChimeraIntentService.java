package com.google.android.gms.clearcut.init;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ClearcutInitChimeraIntentService extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        Context applicationContext = getApplicationContext();
        applicationContext.startService(IntentOperation.getStartIntent(applicationContext, ClearcutBootCompleteIntentOperation.class, "android.intent.action.CLEARCUT_BOOT_COMPLETED"));
    }

    /* access modifiers changed from: protected */
    public final void c() {
        Context applicationContext = getApplicationContext();
        applicationContext.startService(IntentOperation.getStartIntent(applicationContext, ClearcutBootCompleteIntentOperation.class, "android.intent.action.CLEARCUT_LOCKED_BOOT_COMPLETED"));
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        jhg.a((Context) this, "com.google.android.gms.clearcut.debug.ClearcutDebugDumpService", true);
        getApplicationContext().startService(new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.clearcut.debug.ClearcutDebugDumpService")));
        new yfb(yef.a((Context) this), "com.google.android.gms.playlog.uploader", "direct_boot:com.google.android.gms.playlog.uploader", this).a("");
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        Context applicationContext = getApplicationContext();
        applicationContext.startService(IntentOperation.getStartIntent(applicationContext, hsi.class, "android.intent.action.CLEARCUT_MODULE_UPDATE"));
    }
}
