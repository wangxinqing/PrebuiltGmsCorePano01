package com.google.android.gms.drive.networkcontrol;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BatteryStateChangeReceiver extends ChangeReceiver {
    private static final ith a = new ith("BatteryStateChangeRecei", "");

    public BatteryStateChangeReceiver(Context context) {
        super(context, "android.intent.action.ACTION_POWER_CONNECTED", "android.intent.action.ACTION_POWER_DISCONNECTED");
        a((lgv) new lgt(lrh.a(context)));
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
            a((lgv) new lgt(true));
        } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            a((lgv) new lgt(false));
        } else {
            a.b("BatteryStateChangeRecei", "Received unexpected action %s", action);
        }
    }
}
