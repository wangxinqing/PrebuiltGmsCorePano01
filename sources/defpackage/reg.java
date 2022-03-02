package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.NetworkLocationStatus;

/* renamed from: reg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class reg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        long j = 0;
        NetworkLocationStatus[] networkLocationStatusArr = null;
        int i = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i2 = ivw.g(parcel, readInt);
            } else if (a == 2) {
                i3 = ivw.g(parcel, readInt);
            } else if (a == 3) {
                j = ivw.i(parcel, readInt);
            } else if (a == 4) {
                i = ivw.g(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                networkLocationStatusArr = (NetworkLocationStatus[]) ivw.b(parcel, readInt, NetworkLocationStatus.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new LocationAvailability(i, i2, i3, j, networkLocationStatusArr);
    }
}
