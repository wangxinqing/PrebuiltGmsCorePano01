package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.fencing.PlaceIdCollection;
import com.google.android.gms.location.places.fencing.PlacefencingFilter;
import java.util.ArrayList;

/* renamed from: riw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class riw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlacefencingFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                arrayList = ivw.c(parcel, readInt, PlaceIdCollection.CREATOR);
            } else if (a == 2) {
                arrayList2 = ivw.B(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                arrayList3 = ivw.C(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new PlacefencingFilter(arrayList, arrayList2, arrayList3);
    }
}
