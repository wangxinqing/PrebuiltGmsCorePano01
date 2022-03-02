package com.google.android.gms.beacon;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class BleSighting extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gtl();
    public BluetoothDevice a;
    public gti b;
    public byte[] c;
    public int d;
    public long e;

    public BleSighting(BluetoothDevice bluetoothDevice, byte[] bArr, int i, long j) {
        this.a = bluetoothDevice;
        this.c = bArr;
        this.d = i;
        this.e = j;
        this.b = gti.a(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BleSighting bleSighting = (BleSighting) obj;
            return ius.a(this.a, bleSighting.a) && this.d == bleSighting.d && Arrays.equals(this.c, bleSighting.c) && this.e == bleSighting.e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.d), Long.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.d;
        long j = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 87 + String.valueOf(valueOf2).length());
        sb.append("BleSighting{device=");
        sb.append(valueOf);
        sb.append(", bleRecord=");
        sb.append(valueOf2);
        sb.append(", rssi=");
        sb.append(i);
        sb.append(", timestampNanos=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.b(parcel, a2);
    }
}
