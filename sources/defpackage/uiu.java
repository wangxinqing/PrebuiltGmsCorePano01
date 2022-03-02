package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.internal.connection.StartAdvertisingParams;

/* renamed from: uiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uiu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StartAdvertisingParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str = null;
        String str2 = null;
        AdvertisingOptions advertisingOptions = null;
        IBinder iBinder3 = null;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    iBinder = ivw.r(parcel, readInt);
                    break;
                case 2:
                    iBinder2 = ivw.r(parcel, readInt);
                    break;
                case 3:
                    str = ivw.q(parcel, readInt);
                    break;
                case 4:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 5:
                    j = ivw.i(parcel, readInt);
                    break;
                case 6:
                    advertisingOptions = (AdvertisingOptions) ivw.a(parcel, readInt, AdvertisingOptions.CREATOR);
                    break;
                case 7:
                    iBinder3 = ivw.r(parcel, readInt);
                    break;
                case 8:
                    bArr = ivw.t(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new StartAdvertisingParams(iBinder, iBinder2, str, str2, j, advertisingOptions, iBinder3, bArr);
    }
}
