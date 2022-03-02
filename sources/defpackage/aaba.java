package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: aaba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaba {
    public final PowerManager a;

    public aaba(Context context) {
        int i = Build.VERSION.SDK_INT;
        this.a = (PowerManager) context.getSystemService("power");
    }

    public final boolean a() {
        PowerManager powerManager;
        if (!jkr.b() || (powerManager = this.a) == null || !powerManager.isDeviceIdleMode()) {
            return false;
        }
        return true;
    }
}
