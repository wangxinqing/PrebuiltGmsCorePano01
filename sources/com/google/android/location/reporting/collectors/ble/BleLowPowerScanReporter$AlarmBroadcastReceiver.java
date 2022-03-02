package com.google.android.location.reporting.collectors.ble;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BleLowPowerScanReporter$AlarmBroadcastReceiver extends nla {
    final /* synthetic */ ajht a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BleLowPowerScanReporter$AlarmBroadcastReceiver(ajht ajht) {
        super("location");
        this.a = ajht;
    }

    public final void a(Context context, Intent intent) {
        synchronized (this.a) {
            ajht ajht = this.a;
            int i = ajht.a;
            ajht.h();
        }
    }
}
