package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BleSignalImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vbv();
    final int a;
    public final int b;
    public final int c;

    public BleSignalImpl(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = a(i3);
    }

    public static int a(int i) {
        if (i <= -169 || i >= 87) {
            return Integer.MIN_VALUE;
        }
        return i;
    }

    public static int b(int i) {
        return a(i - 41);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BleSignalImpl) {
            BleSignalImpl bleSignalImpl = (BleSignalImpl) obj;
            return this.b == bleSignalImpl.b && this.c == bleSignalImpl.c;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(48);
        sb.append("BleSignal{rssi=");
        sb.append(i);
        sb.append(", txPower=");
        sb.append(i2);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
