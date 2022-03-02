package com.google.android.gms.nearby.discovery;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleInitializer extends hec {
    private static final String[] a = {"com.google.android.gms.nearby.discovery.devices.DevicesListActivity", "com.google.android.gms.nearby.discovery.service.DiscoveryService", "com.google.android.gms.nearby.discovery.fastpair.CompanionAppInstallActivity", "com.google.android.gms.nearby.discovery.fastpair.HalfSheetActivity", "com.google.android.gms.nearby.discovery.devices.FindDeviceActivity", "com.google.android.gms.nearby.discovery.fastpair.slice.FastPairSliceProvider"};

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        boolean b = arxk.b(this, tfx.a(this));
        for (String a2 : a) {
            tfy.a(this, a2, b);
        }
        try {
            tfy.a(this, "com.google.android.gms.nearby.discovery.fastpair.slice.FastPairContextualCardProvider", jkr.h());
            if (jkr.h()) {
                Intent intent2 = new Intent("com.google.android.setupwizard.SETUP_WIZARD_FINISHED");
                intent2.setComponent(new ComponentName("com.google.android.settings.intelligence", "com.google.android.settings.intelligence.modules.contextualcards.impl.JobBootBroadcastReceiver"));
                sendBroadcast(intent2);
                ((anih) tsp.a.d()).a("Trigger rescan contextual cards");
            }
        } catch (IllegalArgumentException e) {
            anih anih = (anih) tsp.a.b();
            anih.a((Throwable) e);
            anih.m();
        }
        startService(DiscoveryChimeraService.a(getBaseContext()).setAction("com.google.android.gms.nearby.discovery:ACTION_INIT_MESSAGES_PATH"));
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            uac.b(getBaseContext());
        }
    }
}
