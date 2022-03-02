package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.AwarenessPlaceEntity;
import com.google.android.gms.awareness.snapshot.internal.AwarenessPlaceLikelihoodEntity;

/* renamed from: grg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class grg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AwarenessPlaceLikelihoodEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        AwarenessPlaceEntity awarenessPlaceEntity = null;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                awarenessPlaceEntity = (AwarenessPlaceEntity) ivw.a(parcel, readInt, AwarenessPlaceEntity.CREATOR);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                f = ivw.l(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new AwarenessPlaceLikelihoodEntity(awarenessPlaceEntity, f);
    }
}
