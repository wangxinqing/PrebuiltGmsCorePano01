package defpackage;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;

/* renamed from: acrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface acrb extends IInterface {
    void a(Status status, ConnectToWifiNetworkResponse connectToWifiNetworkResponse);

    void a(Status status, GetWifiCredentialsResponse getWifiCredentialsResponse);
}
