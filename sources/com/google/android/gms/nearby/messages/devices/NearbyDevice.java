package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NearbyDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vbc();
    public static final NearbyDevice a = new NearbyDevice("", (String) null);
    final int b;
    public final String c;
    public final String d;

    public NearbyDevice(int i, String str, String str2) {
        Integer valueOf = Integer.valueOf(i);
        iva.a((Object) valueOf);
        this.b = valueOf.intValue();
        this.c = str == null ? "" : str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyDevice) {
            NearbyDevice nearbyDevice = (NearbyDevice) obj;
            return ius.a(this.c, nearbyDevice.c) && ius.a(this.d, nearbyDevice.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d});
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(str2).length());
        sb.append("NearbyDevice{handle=");
        sb.append(str);
        sb.append(", bluetoothAddress=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public NearbyDevice(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 6, this.d, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.b);
        ivx.b(parcel, a2);
    }
}
