package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlaceEntity;
import java.util.ArrayList;

/* renamed from: rjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rjo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new HierarchicalPlaceLikelihoodEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        PlaceEntity placeEntity = null;
        ArrayList arrayList = null;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                placeEntity = (PlaceEntity) ivw.a(parcel, readInt, PlaceEntity.CREATOR);
            } else if (a == 2) {
                f = ivw.l(parcel, readInt);
            } else if (a == 3) {
                f2 = ivw.l(parcel, readInt);
            } else if (a == 4) {
                i = ivw.g(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.C(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new HierarchicalPlaceLikelihoodEntity(placeEntity, f, f2, i, arrayList);
    }
}
