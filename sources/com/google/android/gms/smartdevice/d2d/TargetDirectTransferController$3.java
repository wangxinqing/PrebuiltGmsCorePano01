package com.google.android.gms.smartdevice.d2d;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TargetDirectTransferController$3 extends ResultReceiver {
    final /* synthetic */ abvi a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TargetDirectTransferController$3(abvi abvi, Handler handler) {
        super(handler);
        this.a = abvi;
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        abvi abvi = this.a;
        iwd iwd = abvi.h;
        abvi.g();
    }
}
