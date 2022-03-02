package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.fencing.PlacefencingFilter;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;

/* renamed from: riy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class riy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlacefencingRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        PlacefencingFilter placefencingFilter = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel, readInt);
                    break;
                case 2:
                    placefencingFilter = (PlacefencingFilter) ivw.a(parcel, readInt, PlacefencingFilter.CREATOR);
                    break;
                case 3:
                    i = ivw.g(parcel, readInt);
                    break;
                case 4:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 5:
                    i3 = ivw.g(parcel, readInt);
                    break;
                case 6:
                    i4 = ivw.g(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new PlacefencingRequest(str, placefencingFilter, i, i2, i3, i4);
    }
}
