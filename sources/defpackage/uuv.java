package defpackage;

import com.google.android.gms.nearby.mediums.wifiaware.WifiAwareImpl$LazyWifiAwareSession$1;

/* renamed from: uuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class uuv implements Runnable {
    private final WifiAwareImpl$LazyWifiAwareSession$1 a;

    public uuv(WifiAwareImpl$LazyWifiAwareSession$1 wifiAwareImpl$LazyWifiAwareSession$1) {
        this.a = wifiAwareImpl$LazyWifiAwareSession$1;
    }

    public final void run() {
        this.a.a.b();
    }
}
