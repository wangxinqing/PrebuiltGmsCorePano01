package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import com.google.android.chimera.Activity;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: win  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class win {
    public static acwa a(Activity activity) {
        WifiManager wifiManager = (WifiManager) activity.getApplicationContext().getSystemService("wifi");
        if (wifiManager.isWifiEnabled()) {
            return acws.a((Object) null);
        }
        if (ayni.d() || !jkr.h()) {
            return acws.a((Executor) tid.c(), (Callable) new wim(activity, wifiManager));
        }
        activity.startActivityForResult(new Intent("android.settings.panel.action.WIFI"), 1006);
        return acws.a((Object) null);
    }

    public static boolean a(Context context) {
        return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).isWifiEnabled();
    }
}
