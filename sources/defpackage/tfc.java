package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;

/* renamed from: tfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tfc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendDataRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Device device = null;
        byte[] bArr = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                device = (Device) ivw.a(parcel, readInt, Device.CREATOR);
            } else if (a == 2) {
                bArr = ivw.t(parcel, readInt);
            } else if (a == 3) {
                iBinder = ivw.r(parcel, readInt);
            } else if (a != 1000) {
                ivw.b(parcel, readInt);
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SendDataRequest(i, device, bArr, iBinder);
    }
}
