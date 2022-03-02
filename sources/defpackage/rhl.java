package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;

/* renamed from: rhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rhl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NearbyAlertRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        PlaceFilter placeFilter = null;
        NearbyAlertFilter nearbyAlertFilter = null;
        int i = 0;
        int i2 = -1;
        boolean z = false;
        int i3 = 0;
        int i4 = 110;
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
                    placeFilter = (PlaceFilter) ivw.a(parcel, readInt, PlaceFilter.CREATOR);
                    break;
                case 4:
                    nearbyAlertFilter = (NearbyAlertFilter) ivw.a(parcel, readInt, NearbyAlertFilter.CREATOR);
                    break;
                case 5:
                    z = ivw.c(parcel, readInt);
                    break;
                case 6:
                    i3 = ivw.g(parcel, readInt);
                    break;
                case 7:
                    i4 = ivw.g(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new NearbyAlertRequest(i, i2, placeFilter, nearbyAlertFilter, z, i3, i4);
    }
}
