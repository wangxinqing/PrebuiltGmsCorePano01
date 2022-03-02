package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;

/* renamed from: rfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rfn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientationRequestUpdateData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        DeviceOrientationRequestInternal deviceOrientationRequestInternal = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                deviceOrientationRequestInternal = (DeviceOrientationRequestInternal) ivw.a(parcel, readInt, DeviceOrientationRequestInternal.CREATOR);
            } else if (a == 3) {
                iBinder = ivw.r(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                iBinder2 = ivw.r(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new DeviceOrientationRequestUpdateData(i, deviceOrientationRequestInternal, iBinder, iBinder2);
    }
}
