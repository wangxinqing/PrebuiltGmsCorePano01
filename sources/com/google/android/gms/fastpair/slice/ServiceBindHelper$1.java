package com.google.android.gms.fastpair.slice;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ServiceBindHelper$1 extends nla {
    public ServiceBindHelper$1(String str) {
        super(str);
    }

    public final void a(Context context, Intent intent) {
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(intent.getAction()) || "android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction())) {
            mtk.a(context, "links");
        }
    }
}
