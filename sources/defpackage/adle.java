package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.update.control.ActiveStateTrackingBroadcastReceiver;
import com.google.android.gms.update.control.ChimeraGcmTaskService;
import com.google.android.gms.update.control.NetworkControl$2;

/* renamed from: adle  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adle {
    public static final iwd a = adnt.d("NetworkControl");
    public static final adra b = new adra("control.network.passive_wifi_reconnection_monitoring_enabled", false);
    public static final adqz c = new adld();
    public final Context d;
    public final adrn e = ((adrn) adrn.a.b());
    private final ActiveStateTrackingBroadcastReceiver f = new NetworkControl$2();

    public adle(Context context) {
        this.d = context;
    }

    public final void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
        this.f.a(this.d, intentFilter);
    }

    public final void b() {
        this.f.a(this.d);
    }

    public final void c() {
        this.e.a(b.b(true));
        ChimeraGcmTaskService.e(this.d);
    }

    public final void d() {
        this.e.a(b);
        ChimeraGcmTaskService.f(this.d);
    }
}
