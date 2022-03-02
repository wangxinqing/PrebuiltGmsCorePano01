package com.google.android.gms.fastpair.devices;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DevicesListFragment$1 extends nla {
    final /* synthetic */ mrt a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DevicesListFragment$1(mrt mrt, String str) {
        super(str);
        this.a = mrt;
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
            jjg jjg = mte.a;
            this.a.a();
        } else if ("android.location.PROVIDERS_CHANGED".equals(action)) {
            jjg jjg2 = mte.a;
            this.a.a();
        } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE") && !isInitialStickyBroadcast()) {
            jjg jjg3 = mte.a;
            this.a.a();
        }
    }
}
