package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;

/* renamed from: acra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class acra extends bhw implements acrb {
    public acra() {
        super("com.google.android.gms.smartdevice.wifi.internal.IWifiHelperCallbacks");
    }

    public void a(Status status, ConnectToWifiNetworkResponse connectToWifiNetworkResponse) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, GetWifiCredentialsResponse getWifiCredentialsResponse) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) bhx.a(parcel, Status.CREATOR), (GetWifiCredentialsResponse) bhx.a(parcel, GetWifiCredentialsResponse.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a((Status) bhx.a(parcel, Status.CREATOR), (ConnectToWifiNetworkResponse) bhx.a(parcel, ConnectToWifiNetworkResponse.CREATOR));
        }
        return true;
    }
}
