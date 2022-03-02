package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SchedulerDebugReceiver extends nla {
    public SchedulerDebugReceiver() {
        super("scheduler");
    }

    public final void a(Context context, Intent intent) {
        aaaz aaaz;
        if (hxz.g(context) && "INVOKE_ALL".equals(intent.getStringExtra("debug_sub_action")) && (aaaz = aabg.a().a) != null) {
            aaaz.a.c(nxn.INVOKE_ALL);
        }
    }
}
