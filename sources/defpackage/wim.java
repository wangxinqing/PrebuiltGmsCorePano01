package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import com.google.android.chimera.Activity;
import com.google.android.gms.nearby.sharing.utils.WifiUtils$1;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: wim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wim implements Callable {
    private final Activity a;
    private final WifiManager b;

    public wim(Activity activity, WifiManager wifiManager) {
        this.a = activity;
        this.b = wifiManager;
    }

    public final Object call() {
        Activity activity = this.a;
        WifiManager wifiManager = this.b;
        aosh f = aosh.f();
        WifiUtils$1 wifiUtils$1 = new WifiUtils$1("nearby", f);
        activity.registerReceiver(wifiUtils$1, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
        if (!wifiManager.setWifiEnabled(true)) {
            f.a((Throwable) new Exception("Wifi manager denied the enable request."));
        }
        boolean b2 = thr.b("enableWifi", (Future) f, 3000);
        thp.a((Context) activity, (BroadcastReceiver) wifiUtils$1);
        if (b2 || wifiManager.isWifiEnabled()) {
            return null;
        }
        throw new Exception("Got exception when turning on Wi-Fi");
    }
}
