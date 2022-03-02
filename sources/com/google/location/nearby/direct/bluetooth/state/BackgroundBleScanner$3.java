package com.google.location.nearby.direct.bluetooth.state;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BackgroundBleScanner$3 extends nla {
    public final /* synthetic */ ascn a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundBleScanner$3(ascn ascn, String str) {
        super(str);
        this.a = ascn;
    }

    public final void a(Context context, Intent intent) {
        ascn ascn = this.a;
        asey[] aseyArr = ascn.a;
        ascn.d.c(new asck(this, "BackgroundBleScanner_broadcastReceiver", intent));
    }
}
