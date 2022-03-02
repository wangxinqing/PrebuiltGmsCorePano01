package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothClassic$AdvertisingOperation$1 extends nla {
    final /* synthetic */ int a;
    final /* synthetic */ CountDownLatch b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothClassic$AdvertisingOperation$1(String str, int i, CountDownLatch countDownLatch) {
        super(str);
        this.a = i;
        this.b = countDownLatch;
    }

    public final void a(Context context, Intent intent) {
        if ("android.bluetooth.adapter.action.SCAN_MODE_CHANGED".equals(intent.getAction()) && this.a == intent.getIntExtra("android.bluetooth.adapter.extra.SCAN_MODE", -1)) {
            this.b.countDown();
        }
    }
}
