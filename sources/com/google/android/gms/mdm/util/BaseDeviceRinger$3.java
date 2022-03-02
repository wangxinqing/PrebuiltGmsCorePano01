package com.google.android.gms.mdm.util;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BaseDeviceRinger$3 extends nla {
    final /* synthetic */ sng a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseDeviceRinger$3(sng sng, String str) {
        super(str);
        this.a = sng;
    }

    public final void a(Context context, Intent intent) {
        new Object[1][0] = intent.getAction();
        int i = crc.a;
        this.a.j.b();
    }
}
