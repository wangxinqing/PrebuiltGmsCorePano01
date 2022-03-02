package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import com.google.android.gms.nearby.messages.internal.DistanceImpl;
import com.google.android.gms.nearby.messages.internal.Update;

/* renamed from: vdy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vdy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Update[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Message message = null;
        DistanceImpl distanceImpl = null;
        BleSignalImpl bleSignalImpl = null;
        NearbyDevice nearbyDevice = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 3:
                    message = (Message) ivw.a(parcel, readInt, Message.CREATOR);
                    break;
                case 4:
                    distanceImpl = (DistanceImpl) ivw.a(parcel, readInt, DistanceImpl.CREATOR);
                    break;
                case 5:
                    bleSignalImpl = (BleSignalImpl) ivw.a(parcel, readInt, BleSignalImpl.CREATOR);
                    break;
                case 6:
                    nearbyDevice = (NearbyDevice) ivw.a(parcel, readInt, NearbyDevice.CREATOR);
                    break;
                case 7:
                    bArr = ivw.t(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new Update(i, i2, message, distanceImpl, bleSignalImpl, nearbyDevice, bArr);
    }
}
