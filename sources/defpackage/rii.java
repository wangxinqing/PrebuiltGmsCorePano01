package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceRequest;

/* renamed from: rii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rii implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlaceRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        PlaceFilter placeFilter = null;
        long j = -1;
        long j2 = Long.MAX_VALUE;
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    placeFilter = (PlaceFilter) ivw.a(parcel2, readInt, PlaceFilter.CREATOR);
                    break;
                case 3:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 4:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 5:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 6:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 7:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new PlaceRequest(placeFilter, j, i, j2, z, z2);
    }
}
