package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.update.control.ActiveStateTrackingBroadcastReceiver;
import com.google.android.gms.update.control.BatteryControl$2;
import com.google.android.gms.update.control.ChimeraGcmTaskService;

/* renamed from: adkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adkm {
    public static final iwd a = adnt.d("BatteryControl");
    public static final adra b = new adra("control.battery.passive_battery_charging_monitoring_enabled", false);
    public static final adqz c = new adkl();
    public final Context d;
    public final adrn e = ((adrn) adrn.a.b());
    private final ActiveStateTrackingBroadcastReceiver f = new BatteryControl$2();

    public adkm(Context context) {
        this.d = context;
    }

    public final void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        amrl.a(true);
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        this.f.a(this.d, intentFilter);
    }

    public final void b() {
        this.f.a(this.d);
    }

    public final void c() {
        this.e.a(b.b(true));
        ChimeraGcmTaskService.c(this.d);
    }

    public final void d() {
        this.e.a(b);
        ChimeraGcmTaskService.d(this.d);
    }
}
