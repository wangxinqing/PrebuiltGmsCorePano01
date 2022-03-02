package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.google.android.location.util.LowPowerModeHelper$1;

/* renamed from: ajqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajqi {
    public boolean a = false;
    private final Context b;
    private final PowerManager c;
    private final ajqh d;
    private final Handler e;
    private final IntentFilter f;
    private final BroadcastReceiver g = new LowPowerModeHelper$1(this, "location");
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;

    public ajqi(Context context, ajqh ajqh, Looper looper) {
        this.b = context;
        this.d = ajqh;
        this.c = (PowerManager) context.getSystemService("power");
        this.e = new qvr(looper);
        IntentFilter intentFilter = new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED");
        this.f = intentFilter;
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f.addAction("android.intent.action.SCREEN_ON");
    }

    public final void a() {
        int i2 = Build.VERSION.SDK_INT;
        if (!this.h) {
            this.b.registerReceiver(this.g, this.f, (String) null, this.e);
            this.h = true;
        }
        this.i = this.c.isScreenOn();
        this.a = c();
        b(true);
    }

    public final void b() {
        int i2 = Build.VERSION.SDK_INT;
        if (this.h) {
            this.b.unregisterReceiver(this.g);
            this.h = false;
        }
    }

    public final boolean c() {
        int i2 = Build.VERSION.SDK_INT;
        return this.c.isPowerSaveMode();
    }

    public final void a(boolean z) {
        if (this.i != z) {
            this.i = z;
            b(false);
        }
    }

    public final void b(boolean z) {
        boolean z2 = false;
        if (!this.i && this.a) {
            z2 = true;
        }
        if (z2 != this.j || z) {
            this.j = z2;
            this.d.b(z2);
        }
    }
}
