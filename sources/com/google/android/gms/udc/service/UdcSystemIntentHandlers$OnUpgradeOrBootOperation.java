package com.google.android.gms.udc.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UdcSystemIntentHandlers$OnUpgradeOrBootOperation extends hec {
    private static final String[] a = {"com.google.android.gms.udc.gcm.GcmBroadcastReceiver", "com.google.android.gms.udc.service.UdcContextInitService", "com.google.android.gms.udc.ui.AuthenticatingWebViewActivity", "com.google.android.gms.udc.ui.UdcConsentActivity", "com.google.android.gms.udc.ui.UdcSettingsListActivity"};

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        intent.getAction();
        startService(IntentOperation.getStartIntent((Context) this, "com.google.android.gms.udc.intentoperation.BootOrGmsUpdatedPersistentIntentOperation", "com.google.android.gms.udc.intentoperation.BOOT_OR_GMS_UPDATED"));
        if (!azrk.p()) {
            UdcContextInitChimeraService.a(getBaseContext());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        for (String a2 : a) {
            jhg.a((Context) this, a2, true);
        }
    }
}
