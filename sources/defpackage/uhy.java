package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;

/* renamed from: uhy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uhy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OnEndpointFoundParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        BluetoothDevice bluetoothDevice = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                str2 = ivw.q(parcel, readInt);
            } else if (a == 3) {
                str3 = ivw.q(parcel, readInt);
            } else if (a == 4) {
                bluetoothDevice = (BluetoothDevice) ivw.a(parcel, readInt, BluetoothDevice.CREATOR);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                bArr = ivw.t(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new OnEndpointFoundParams(str, str2, str3, bluetoothDevice, bArr);
    }
}
