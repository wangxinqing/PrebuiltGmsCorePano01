package com.google.android.gms.common.receiver;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class InternalBroadcastReceiver extends nla {
    public InternalBroadcastReceiver() {
        super("common");
    }

    public final void a(Context context, Intent intent) {
        if ("com.google.android.gms.common.SET_GMS_ACCOUNT".equals(intent.getAction())) {
            jgu.a(context, intent.getStringExtra("PACKAGE_NAME"), intent.getStringExtra("ACCOUNT_NAME"));
        }
    }
}
