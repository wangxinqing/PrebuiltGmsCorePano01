package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import java.util.ArrayList;

/* renamed from: rko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rko implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlaceOpeningHoursEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                arrayList = ivw.c(parcel, readInt, PlaceOpeningHoursEntity.BusinessHoursInterval.CREATOR);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                arrayList2 = ivw.c(parcel, readInt, PlaceOpeningHoursEntity.ExceptionalHours.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new PlaceOpeningHoursEntity(arrayList, arrayList2);
    }
}
