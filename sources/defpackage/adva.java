package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;

/* renamed from: adva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adva implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserLocationNearbyAlertRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = null;
        int i = 0;
        int i2 = -1;
        boolean z = false;
        int i3 = 0;
        int i4 = 110;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                i2 = ivw.g(parcel, readInt);
            } else if (a == 4) {
                userLocationNearbyAlertFilter = (UserLocationNearbyAlertFilter) ivw.a(parcel, readInt, UserLocationNearbyAlertFilter.CREATOR);
            } else if (a == 5) {
                z = ivw.c(parcel, readInt);
            } else if (a == 6) {
                i3 = ivw.g(parcel, readInt);
            } else if (a != 7) {
                ivw.b(parcel, readInt);
            } else {
                i4 = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new UserLocationNearbyAlertRequest(i, i2, userLocationNearbyAlertFilter, z, i3, i4);
    }
}
