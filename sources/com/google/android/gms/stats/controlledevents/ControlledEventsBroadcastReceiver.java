package com.google.android.gms.stats.controlledevents;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class ControlledEventsBroadcastReceiver extends nla {
    ControlledEventsOperation a;

    public ControlledEventsBroadcastReceiver(ControlledEventsOperation controlledEventsOperation) {
        super("stats_controlled_events");
        this.a = controlledEventsOperation;
    }

    public final void a(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            acsh.a("ControlledEventsReceiverFailureScreenOn");
            acsg.a();
            this.a.a();
        }
    }
}
