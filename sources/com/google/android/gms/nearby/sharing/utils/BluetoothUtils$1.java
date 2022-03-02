package com.google.android.gms.nearby.sharing.utils;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothUtils$1 extends nla {
    final /* synthetic */ aosh a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothUtils$1(String str, aosh aosh) {
        super(str);
        this.a = aosh;
    }

    public final void a(Context context, Intent intent) {
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 12) {
            this.a.b((Object) null);
        }
    }
}
