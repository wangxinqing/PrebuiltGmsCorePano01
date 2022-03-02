package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HierarchicalPlaceLikelihoodEntity extends AbstractSafeParcelable implements rhi {
    public static final Parcelable.Creator CREATOR = new rjo();
    public static final List a = Collections.emptyList();
    public final PlaceEntity b;
    public final float c;
    public final float d;
    public final int e;
    public final List f;

    public HierarchicalPlaceLikelihoodEntity(PlaceEntity placeEntity, float f2, float f3, int i, List list) {
        this.b = placeEntity;
        this.c = f2;
        this.d = f3;
        this.e = i;
        this.f = list;
    }

    public static HierarchicalPlaceLikelihoodEntity a(PlaceEntity placeEntity, float f2, float f3, int i, List list) {
        iva.a((Object) placeEntity);
        iva.a((Object) list);
        return new HierarchicalPlaceLikelihoodEntity(placeEntity, f2, f3, i, list);
    }

    public final float ba() {
        return this.c;
    }

    public final rhq bb() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HierarchicalPlaceLikelihoodEntity) {
            HierarchicalPlaceLikelihoodEntity hierarchicalPlaceLikelihoodEntity = (HierarchicalPlaceLikelihoodEntity) obj;
            return this.b.equals(hierarchicalPlaceLikelihoodEntity.b) && this.c == hierarchicalPlaceLikelihoodEntity.c && this.d == hierarchicalPlaceLikelihoodEntity.d && this.e == hierarchicalPlaceLikelihoodEntity.e && this.f.equals(hierarchicalPlaceLikelihoodEntity.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Float.valueOf(this.c)});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final int s() {
        return this.e;
    }

    public final List t() {
        return this.f;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("place", this.b);
        a2.a("likelihood", Float.valueOf(this.c));
        a2.a("hierarchyLikelihood", Float.valueOf(this.d));
        a2.a("hierarchyLevel", Integer.valueOf(this.e));
        a2.a("containedPlaceIds", this.f.toString());
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, i, false);
        ivx.a(parcel, 2, this.c);
        ivx.a(parcel, 3, this.d);
        ivx.b(parcel, 4, this.e);
        ivx.b(parcel, 5, this.f, false);
        ivx.b(parcel, a2);
    }
}
