package defpackage;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.ble.BleFilter;

/* renamed from: uzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uzw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BleFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ParcelUuid parcelUuid = null;
        ParcelUuid parcelUuid2 = null;
        ParcelUuid parcelUuid3 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 1) {
                switch (a) {
                    case 4:
                        parcelUuid = (ParcelUuid) ivw.a(parcel, readInt, ParcelUuid.CREATOR);
                        break;
                    case 5:
                        parcelUuid2 = (ParcelUuid) ivw.a(parcel, readInt, ParcelUuid.CREATOR);
                        break;
                    case 6:
                        parcelUuid3 = (ParcelUuid) ivw.a(parcel, readInt, ParcelUuid.CREATOR);
                        break;
                    case 7:
                        bArr = ivw.t(parcel, readInt);
                        break;
                    case 8:
                        bArr2 = ivw.t(parcel, readInt);
                        break;
                    case 9:
                        i2 = ivw.g(parcel, readInt);
                        break;
                    case 10:
                        bArr3 = ivw.t(parcel, readInt);
                        break;
                    case 11:
                        bArr4 = ivw.t(parcel, readInt);
                        break;
                    default:
                        ivw.b(parcel, readInt);
                        break;
                }
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new BleFilter(i, parcelUuid, parcelUuid2, parcelUuid3, bArr, bArr2, i2, bArr3, bArr4);
    }
}
