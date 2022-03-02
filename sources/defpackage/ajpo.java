package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.google.android.location.util.DeviceActiveAlarmTimer;
import com.google.android.location.util.DeviceIdleHelper$PowerManagerReciever;

/* renamed from: ajpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajpo {
    public final Context a;
    public final PowerManager b;
    public final DeviceIdleHelper$PowerManagerReciever c;
    public final IntentFilter d;
    public boolean e;
    public DeviceActiveAlarmTimer f;

    public ajpo(Context context) {
        IntentFilter intentFilter;
        if (jkr.b()) {
            this.a = context;
            this.b = (PowerManager) context.getSystemService("power");
            this.c = new DeviceIdleHelper$PowerManagerReciever(this);
            intentFilter = new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        } else {
            intentFilter = null;
            this.a = null;
            this.b = null;
            this.c = null;
        }
        this.d = intentFilter;
    }

    public final boolean a() {
        if (jkr.b()) {
            return this.b.isDeviceIdleMode();
        }
        return false;
    }
}
