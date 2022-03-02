package com.google.android.gms.nearby.mediums.wifiaware;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.aware.WifiAwareManager;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WifiAwareImpl$LazyWifiAwareSession$1 extends nla {
    public final /* synthetic */ uuy a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiAwareImpl$LazyWifiAwareSession$1(uuy uuy, String str) {
        super(str);
        this.a = uuy;
    }

    public final void a(Context context, Intent intent) {
        WifiAwareManager wifiAwareManager = this.a.a;
        if (wifiAwareManager != null && !wifiAwareManager.isAvailable()) {
            ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.wifiaware.WifiAwareImpl$LazyWifiAwareSession$1", "a", 1044, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi Aware is no longer available.");
            uuy uuy = this.a;
            uuy.b.execute(new uuv(this));
        }
    }
}
