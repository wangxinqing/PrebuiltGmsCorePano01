package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;

/* renamed from: gbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gbq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DeviceManagementInfoResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        String str = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new DeviceManagementInfoResponse(i, str, z);
    }
}
