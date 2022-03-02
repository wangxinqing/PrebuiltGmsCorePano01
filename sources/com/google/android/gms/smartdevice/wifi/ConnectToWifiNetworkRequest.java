package com.google.android.gms.smartdevice.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ConnectToWifiNetworkRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acqq();
    public String a;
    public String b;
    public String c;
    public boolean d;

    public ConnectToWifiNetworkRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectToWifiNetworkRequest) {
            ConnectToWifiNetworkRequest connectToWifiNetworkRequest = (ConnectToWifiNetworkRequest) obj;
            return ius.a(this.a, connectToWifiNetworkRequest.a) && ius.a(this.b, connectToWifiNetworkRequest.b) && ius.a(this.c, connectToWifiNetworkRequest.c) && ius.a(Boolean.valueOf(this.d), Boolean.valueOf(connectToWifiNetworkRequest.d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    public ConnectToWifiNetworkRequest(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
