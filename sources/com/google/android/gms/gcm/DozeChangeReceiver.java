package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class DozeChangeReceiver extends nla {
    public DozeChangeReceiver() {
        super("gcm");
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(action)) {
            nrr.a().c().b(4);
        } else if ("android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED".equals(action)) {
            nrr.a().c().b(5);
        }
    }
}
