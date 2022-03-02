package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AliasedPlacesResult extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new rkx();
    public final Status a;
    public final List b;

    public AliasedPlacesResult(Status status, List list) {
        this.a = status;
        this.b = list;
    }

    public final Status aO() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.c(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
