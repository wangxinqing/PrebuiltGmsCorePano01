package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.beacon.BleSighting;

/* renamed from: gtl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gtl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BleSighting[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        BluetoothDevice bluetoothDevice = null;
        byte[] bArr = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                bluetoothDevice = (BluetoothDevice) ivw.a(parcel, readInt, BluetoothDevice.CREATOR);
            } else if (a == 3) {
                bArr = ivw.t(parcel, readInt);
            } else if (a == 4) {
                i = ivw.g(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                j = ivw.i(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new BleSighting(bluetoothDevice, bArr, i, j);
    }
}
