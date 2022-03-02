package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceOrientationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfm();
    public static final List a = Collections.emptyList();
    public static final DeviceOrientationRequest b = new DeviceOrientationRequest();
    public DeviceOrientationRequest c;
    public List d;
    public String e;

    public DeviceOrientationRequestInternal(DeviceOrientationRequest deviceOrientationRequest, List list, String str) {
        this.c = deviceOrientationRequest;
        this.d = list;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceOrientationRequestInternal) {
            DeviceOrientationRequestInternal deviceOrientationRequestInternal = (DeviceOrientationRequestInternal) obj;
            if (!ius.a(this.c, deviceOrientationRequestInternal.c) || !ius.a(this.d, deviceOrientationRequestInternal.d) || !ius.a(this.e, deviceOrientationRequestInternal.e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String str = this.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 77 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.c, i, false);
        ivx.c(parcel, 2, this.d, false);
        ivx.a(parcel, 3, this.e, false);
        ivx.b(parcel, a2);
    }
}
