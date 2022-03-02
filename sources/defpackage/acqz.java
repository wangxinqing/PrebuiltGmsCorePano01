package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;

/* renamed from: acqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acqz extends bhv implements acrb {
    public acqz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.wifi.internal.IWifiHelperCallbacks");
    }

    public final void a(Status status, ConnectToWifiNetworkResponse connectToWifiNetworkResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) connectToWifiNetworkResponse);
        c(2, aQ);
    }

    public final void a(Status status, GetWifiCredentialsResponse getWifiCredentialsResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) getWifiCredentialsResponse);
        c(1, aQ);
    }
}
