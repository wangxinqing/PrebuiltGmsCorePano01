package com.google.android.gms.smartdevice.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GetWifiCredentialsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acqs();
    public String a;

    private GetWifiCredentialsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetWifiCredentialsRequest) {
            return ius.a(this.a, ((GetWifiCredentialsRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public GetWifiCredentialsRequest(String str) {
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }
}
