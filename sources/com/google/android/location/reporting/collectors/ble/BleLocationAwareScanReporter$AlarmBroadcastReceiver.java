package com.google.android.location.reporting.collectors.ble;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BleLocationAwareScanReporter$AlarmBroadcastReceiver extends nla {
    final /* synthetic */ ajhs a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BleLocationAwareScanReporter$AlarmBroadcastReceiver(ajhs ajhs) {
        super("location");
        this.a = ajhs;
    }

    public final void a(Context context, Intent intent) {
        jiq jiq = this.a.f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.a.j;
        StringBuilder sb = new StringBuilder(65);
        sb.append("Stopping high frequency BLE scanning after ");
        sb.append(elapsedRealtime - j);
        sb.append("ms");
        ajix.a("GCoreUlr", sb.toString());
        this.a.g();
    }
}
