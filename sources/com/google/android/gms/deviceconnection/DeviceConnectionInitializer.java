package com.google.android.gms.deviceconnection;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceConnectionInitializer extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        startService(new Intent().setClassName(this, "com.google.android.gms.deviceconnection.service.DeviceConnectionWatcherService"));
    }
}
