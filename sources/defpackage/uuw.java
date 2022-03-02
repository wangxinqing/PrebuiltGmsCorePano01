package defpackage;

import android.net.wifi.aware.AttachCallback;
import android.net.wifi.aware.WifiAwareSession;

/* renamed from: uuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uuw extends AttachCallback {
    final /* synthetic */ aosh a;

    public uuw(aosh aosh) {
        this.a = aosh;
    }

    public final void onAttachFailed() {
        this.a.a((Throwable) new Exception("Failed to create WiFi Aware session."));
    }

    public final void onAttached(WifiAwareSession wifiAwareSession) {
        this.a.b((Object) wifiAwareSession);
    }
}
