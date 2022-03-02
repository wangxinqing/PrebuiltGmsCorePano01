package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AwarenessPlaceLikelihoodEntity extends AbstractSafeParcelable implements rhy {
    public static final Parcelable.Creator CREATOR = new grg();
    public final AwarenessPlaceEntity a;
    public final float b;

    public AwarenessPlaceLikelihoodEntity(AwarenessPlaceEntity awarenessPlaceEntity, float f) {
        this.a = awarenessPlaceEntity;
        this.b = f;
    }

    public final float ba() {
        return this.b;
    }

    public final rhq bb() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AwarenessPlaceLikelihoodEntity) {
            AwarenessPlaceLikelihoodEntity awarenessPlaceLikelihoodEntity = (AwarenessPlaceLikelihoodEntity) obj;
            return this.a.equals(awarenessPlaceLikelihoodEntity.a) && this.b == awarenessPlaceLikelihoodEntity.b;
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
        a2.a("place", this.a);
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
