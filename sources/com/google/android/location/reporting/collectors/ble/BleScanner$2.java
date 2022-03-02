package com.google.android.location.reporting.collectors.ble;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.beacon.BleSettings;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BleScanner$2 extends nla {
    public final /* synthetic */ ajic a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BleScanner$2(ajic ajic, String str) {
        super(str);
        this.a = ajic;
    }

    public final void a(Context context, Intent intent) {
        ajic ajic = this.a;
        BleSettings bleSettings = ajic.a;
        acrz acrz = new acrz(ajic.i, 1, "BleScanner_WakeLock", (String) null, "com.google.android.gms");
        acrz.a(aztb.S());
        this.a.e.execute(new ajib(this, acrz));
    }
}
