package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothRadio$1 extends nla {
    public final /* synthetic */ ulb a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothRadio$1(ulb ulb, String str) {
        super(str);
        this.a = ulb;
    }

    public final void a(Context context, Intent intent) {
        ulb ulb = this.a;
        ulb.a.execute(new ula(this, intent));
    }
}
