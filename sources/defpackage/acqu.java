package defpackage;

import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest;
import com.google.android.gms.smartdevice.wifi.WifiHelperChimeraService;

/* renamed from: acqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acqu extends acrd implements niz {
    private final WifiHelperChimeraService a;
    private final nix b;

    public acqu(WifiHelperChimeraService wifiHelperChimeraService, nix nix) {
        this.a = wifiHelperChimeraService;
        this.b = nix;
    }

    public final void a(acrb acrb, ConnectToWifiNetworkRequest connectToWifiNetworkRequest) {
        this.b.a(this.a, new acrg(acrb, connectToWifiNetworkRequest));
    }

    public final void a(acrb acrb, GetWifiCredentialsRequest getWifiCredentialsRequest) {
        this.b.a(this.a, new acri(acrb, getWifiCredentialsRequest));
    }
}
