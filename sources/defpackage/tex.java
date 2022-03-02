package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;

/* renamed from: tex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tex implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        Device device = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        long j = 0;
        int i = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        device = (Device) ivw.a(parcel2, readInt, Device.CREATOR);
                        break;
                    case 2:
                        str = ivw.q(parcel2, readInt);
                        break;
                    case 3:
                        str2 = ivw.q(parcel2, readInt);
                        break;
                    case 4:
                        iBinder = ivw.r(parcel2, readInt);
                        break;
                    case 5:
                        iBinder2 = ivw.r(parcel2, readInt);
                        break;
                    case 6:
                        iBinder3 = ivw.r(parcel2, readInt);
                        break;
                    case 7:
                        b2 = ivw.e(parcel2, readInt);
                        break;
                    case 8:
                        j = ivw.i(parcel2, readInt);
                        break;
                    case 9:
                        str3 = ivw.q(parcel2, readInt);
                        break;
                    case 10:
                        b3 = ivw.e(parcel2, readInt);
                        break;
                    case 11:
                        b4 = ivw.e(parcel2, readInt);
                        break;
                    default:
                        ivw.b(parcel2, readInt);
                        break;
                }
            } else {
                i = ivw.g(parcel2, readInt);
            }
        }
        ivw.E(parcel2, b);
        return new ConnectRequest(i, device, str, str2, b2, j, str3, b3, b4, iBinder, iBinder2, iBinder3);
    }
}
