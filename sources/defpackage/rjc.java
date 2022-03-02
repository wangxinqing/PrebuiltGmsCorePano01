package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import java.util.ArrayList;

/* renamed from: rjc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rjc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlaceOpeningHoursEntity.ExceptionalHours[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
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
                    i3 = ivw.g(parcel, readInt);
                    break;
                case 4:
                    i4 = ivw.g(parcel, readInt);
                    break;
                case 5:
                    i5 = ivw.g(parcel, readInt);
                    break;
                case 6:
                    i6 = ivw.g(parcel, readInt);
                    break;
                case 7:
                    arrayList = ivw.c(parcel, readInt, PlaceOpeningHoursEntity.BusinessHoursInterval.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new PlaceOpeningHoursEntity.ExceptionalHours(i, i2, i3, i4, i5, i6, arrayList);
    }
}
