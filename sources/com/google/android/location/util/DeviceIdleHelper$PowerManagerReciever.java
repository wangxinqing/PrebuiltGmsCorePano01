package com.google.android.location.util;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceIdleHelper$PowerManagerReciever extends nla {
    final /* synthetic */ ajpo a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceIdleHelper$PowerManagerReciever(ajpo ajpo) {
        super("location");
        this.a = ajpo;
    }

    public final void a(Context context, Intent intent) {
        if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(intent.getAction())) {
            boolean isDeviceIdleMode = this.a.b.isDeviceIdleMode();
            ajpo ajpo = this.a;
            if (isDeviceIdleMode != ajpo.e) {
                ajpo.e = isDeviceIdleMode;
                DeviceActiveAlarmTimer deviceActiveAlarmTimer = ajpo.f;
                if (deviceActiveAlarmTimer != null && deviceActiveAlarmTimer.c && isDeviceIdleMode != deviceActiveAlarmTimer.e) {
                    deviceActiveAlarmTimer.e = isDeviceIdleMode;
                    if (isDeviceIdleMode) {
                        deviceActiveAlarmTimer.b.a((jgw) deviceActiveAlarmTimer);
                        long elapsedRealtime = deviceActiveAlarmTimer.d - (SystemClock.elapsedRealtime() - deviceActiveAlarmTimer.f);
                        deviceActiveAlarmTimer.d = elapsedRealtime;
                        if (elapsedRealtime <= 0) {
                            deviceActiveAlarmTimer.d();
                            return;
                        }
                        return;
                    }
                    deviceActiveAlarmTimer.e();
                }
            }
        }
    }
}
