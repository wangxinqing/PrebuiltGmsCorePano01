package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest;

/* renamed from: acrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acrc extends bhv implements acre {
    public acrc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.wifi.internal.IWifiHelperService");
    }

    public final void a(acrb acrb, ConnectToWifiNetworkRequest connectToWifiNetworkRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) acrb);
        bhx.a(aQ, (Parcelable) connectToWifiNetworkRequest);
        b(2, aQ);
    }

    public final void a(acrb acrb, GetWifiCredentialsRequest getWifiCredentialsRequest) {
        throw null;
    }
}
