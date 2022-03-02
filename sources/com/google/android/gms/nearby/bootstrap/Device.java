package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Device extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tdc();
    final int a;
    public final String b;
    public final String c;
    public final String d;
    public final byte e;

    public Device(int i, String str, String str2, String str3, byte b2) {
        this.a = i;
        iva.c(str);
        this.b = str;
        iva.a((Object) str2);
        this.c = str2;
        iva.a((Object) str3);
        this.d = str3;
        iva.b(b2 <= 4, "Unknown device type");
        this.e = b2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Device) {
            Device device = (Device) obj;
            if (!this.b.equals(device.b) || !this.c.equals(device.c) || this.e != device.e || !this.d.equals(device.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.e * 29791) + (this.d.hashCode() * 961) + (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.c;
        byte b2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        sb.append("[");
        sb.append(b2);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, false);
        ivx.a(parcel, 4, this.e);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }

    public Device(String str, String str2, String str3, byte b2) {
        this(2, str, str2, str3, b2);
    }
}
