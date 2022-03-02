package com.google.android.gms.smartdevice.utils.bluetooth;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothController$1 extends nla {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ acqi b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothController$1(acqi acqi, String str, CountDownLatch countDownLatch) {
        super(str);
        this.b = acqi;
        this.a = countDownLatch;
    }

    public final void a(Context context, Intent intent) {
        acqi acqi = this.b;
        int i = acqi.b;
        acqg acqg = acqi.a;
        if (acqg != null && acqg.b()) {
            this.a.countDown();
            acqi.a(context, this);
        }
    }
}
