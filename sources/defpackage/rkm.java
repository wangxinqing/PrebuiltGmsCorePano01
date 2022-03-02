package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;

/* renamed from: rkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rkm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlaceLikelihoodEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        PlaceEntity placeEntity = null;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                placeEntity = (PlaceEntity) ivw.a(parcel, readInt, PlaceEntity.CREATOR);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                f = ivw.l(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new PlaceLikelihoodEntity(placeEntity, f);
    }
}
