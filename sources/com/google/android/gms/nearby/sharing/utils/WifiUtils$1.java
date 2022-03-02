package com.google.android.gms.nearby.sharing.utils;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WifiUtils$1 extends nla {
    final /* synthetic */ aosh a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiUtils$1(String str, aosh aosh) {
        super(str);
        this.a = aosh;
    }

    public final void a(Context context, Intent intent) {
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("wifi_state", -1) == 3) {
            this.a.b((Object) null);
        }
    }
}
