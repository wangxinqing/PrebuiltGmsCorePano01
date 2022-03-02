package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class DeviceStateReceiver extends nla {
    public aaan a = new aaan();

    public DeviceStateReceiver() {
        super("scheduler");
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(action)) {
            aabg.a().d.b(4);
        } else if ("android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED".equals(action)) {
            aabg.a().d.b(5);
        } else if (axbn.d()) {
            aaan aaan = this.a;
            if ((!action.equals("android.intent.action.DOCK_ACTIVE") && !action.equals("android.intent.action.DOCK_IDLE")) || aaan.a) {
                jbs jbs = new jbs(context);
                if (action.equals("android.intent.action.SCREEN_ON") || action.equals("android.intent.action.DREAMING_STOPPED") || action.equals("android.intent.action.DOCK_ACTIVE")) {
                    aaan.a(jbs, action);
                } else if (action.equals("android.intent.action.SCREEN_OFF") || action.equals("android.intent.action.DREAMING_STARTED") || action.equals("android.intent.action.DOCK_IDLE")) {
                    aaan.a(jbs, action, context);
                } else if (action.equals("com.google.android.gms.gcm.TRIGGER_IDLE")) {
                    aaan.b();
                }
            }
        }
    }
}
