package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;

/* renamed from: acqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acqw extends acra {
    final /* synthetic */ acwd a;

    public acqw(acwd acwd) {
        this.a = acwd;
    }

    public final void a(Status status, ConnectToWifiNetworkResponse connectToWifiNetworkResponse) {
        ihd.a(status, connectToWifiNetworkResponse, this.a);
    }
}
