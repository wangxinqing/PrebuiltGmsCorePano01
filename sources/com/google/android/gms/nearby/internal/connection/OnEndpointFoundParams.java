package com.google.android.gms.nearby.internal.connection;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OnEndpointFoundParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uhy();
    public String a;
    public String b;
    public String c;
    public BluetoothDevice d;
    public byte[] e;

    public OnEndpointFoundParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnEndpointFoundParams) {
            OnEndpointFoundParams onEndpointFoundParams = (OnEndpointFoundParams) obj;
            return ius.a(this.a, onEndpointFoundParams.a) && ius.a(this.b, onEndpointFoundParams.b) && ius.a(this.c, onEndpointFoundParams.c) && ius.a(this.d, onEndpointFoundParams.d) && Arrays.equals(this.e, onEndpointFoundParams.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(Arrays.hashCode(this.e))});
    }

    public OnEndpointFoundParams(String str, String str2, String str3, BluetoothDevice bluetoothDevice, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bluetoothDevice;
        this.e = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, a2);
    }
}
