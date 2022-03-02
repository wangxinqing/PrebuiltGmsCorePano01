package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NearbyLikelihoodEntity extends AbstractSafeParcelable implements rhm {
    public static final Parcelable.Creator CREATOR = new rkb();
    public final PlaceEntity a;
    public final float b;

    public NearbyLikelihoodEntity(PlaceEntity placeEntity, float f) {
        this.a = placeEntity;
        this.b = f;
    }

    public static NearbyLikelihoodEntity a(PlaceEntity placeEntity, float f) {
        iva.a((Object) placeEntity);
        return new NearbyLikelihoodEntity(placeEntity, f);
    }

    public final rhq bb() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyLikelihoodEntity) {
            NearbyLikelihoodEntity nearbyLikelihoodEntity = (NearbyLikelihoodEntity) obj;
            return this.a.equals(nearbyLikelihoodEntity.a) && this.b == nearbyLikelihoodEntity.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("nearby place", this.a);
        a2.a("likelihood", Float.valueOf(this.b));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
