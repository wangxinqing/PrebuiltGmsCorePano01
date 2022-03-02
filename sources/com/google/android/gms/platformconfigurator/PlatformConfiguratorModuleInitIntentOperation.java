package com.google.android.gms.platformconfigurator;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlatformConfiguratorModuleInitIntentOperation extends hec {
    private static void a(Context context, String str) {
        context.startService(IntentOperation.getStartIntent(context, PhenotypeConfigurationUpdateListener.class, str));
    }

    /* access modifiers changed from: protected */
    public final void b(Intent intent) {
        a((Context) this, intent.getAction());
    }

    public final void onHandleIntent(Intent intent, boolean z) {
        if (!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || !"com.google.android.gms.platformconfigurator".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            super.onHandleIntent(intent, z);
        } else {
            a((Context) this, intent.getAction());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        a((Context) this, intent.getAction());
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        a((Context) this, intent.getAction());
    }
}
