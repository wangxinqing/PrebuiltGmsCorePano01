package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ScanningUpgradeNotification$1 extends nla {
    final /* synthetic */ aioq a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanningUpgradeNotification$1(aioq aioq, String str) {
        super(str);
        this.a = aioq;
    }

    public final void a(Context context, Intent intent) {
        this.a.a();
        if (intent.getBooleanExtra("launch_settings", false)) {
            Intent intent2 = new Intent("android.settings.LOCATION_SCANNING_SETTINGS");
            intent2.setFlags(268435456);
            context.startActivity(intent2);
        }
    }
}
