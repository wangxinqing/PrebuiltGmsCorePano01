package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothRadio$2 extends nla {
    final /* synthetic */ boolean a;
    final /* synthetic */ CountDownLatch b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothRadio$2(String str, boolean z, CountDownLatch countDownLatch) {
        super(str);
        this.a = z;
        this.b = countDownLatch;
    }

    public final void a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
        if (this.a) {
            if (intExtra != 12) {
                return;
            }
        } else if (intExtra != 10) {
            return;
        }
        this.b.countDown();
    }
}
