package com.google.location.nearby.direct.bluetooth.state;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothAdapterWrapper$1 extends nla {
    public final arwm a = new ascq(this, "SendActuallyEnabled");
    public final /* synthetic */ ascs b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothAdapterWrapper$1(ascs ascs, String str) {
        super(str);
        this.b = ascs;
    }

    public final void a(Context context, Intent intent) {
        if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            this.b.e.c(new ascr(this, "BluetoothAdapterStateChanged"));
        }
    }
}
