package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import java.util.List;

/* renamed from: rfm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rfm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientationRequestInternal[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        DeviceOrientationRequest deviceOrientationRequest = DeviceOrientationRequestInternal.b;
        List list = DeviceOrientationRequestInternal.a;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                deviceOrientationRequest = (DeviceOrientationRequest) ivw.a(parcel, readInt, DeviceOrientationRequest.CREATOR);
            } else if (a == 2) {
                list = ivw.c(parcel, readInt, ClientIdentity.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                str = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new DeviceOrientationRequestInternal(deviceOrientationRequest, list, str);
    }
}
