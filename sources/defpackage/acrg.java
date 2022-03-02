package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;

/* renamed from: acrg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acrg extends nis {
    private static final iwd a = acqa.a("Wifi", "ConnectToWifiNetworkOperation");
    private final acrb b;
    private final ConnectToWifiNetworkRequest c;

    public acrg(acrb acrb, ConnectToWifiNetworkRequest connectToWifiNetworkRequest) {
        super(159, "ConnectToWifiNetworkOperation");
        this.b = acrb;
        this.c = connectToWifiNetworkRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(acqk acqk) {
        String str = this.c.a;
        iwd iwd = a;
        String valueOf = String.valueOf(str);
        iwd.a(valueOf.length() == 0 ? new String("SSID: ") : "SSID: ".concat(valueOf), new Object[0]);
        a.a("Creating WifiConfiguration", new Object[0]);
        try {
            ConnectToWifiNetworkRequest connectToWifiNetworkRequest = this.c;
            if (acqk.a(acqo.a(connectToWifiNetworkRequest.b, connectToWifiNetworkRequest.a, connectToWifiNetworkRequest.c, connectToWifiNetworkRequest.d)) == -1) {
                a.e("Could not setup wifi, likely due to authentication error", new Object[0]);
                this.b.a(Status.c, new ConnectToWifiNetworkResponse());
                return;
            }
            this.b.a(Status.a, new ConnectToWifiNetworkResponse());
        } catch (UnsupportedOperationException e) {
            a.e("Exception setting up WiFi", e, new Object[0]);
            this.b.a(new Status(10601), new ConnectToWifiNetworkResponse());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        a(new acqk(context));
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.b.a(status, new ConnectToWifiNetworkResponse());
    }
}
