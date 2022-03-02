package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlacePhotoMetadataResult extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new rie();
    public final Status a;
    final DataHolder b;
    public final rid c;

    public PlacePhotoMetadataResult(Status status, DataHolder dataHolder) {
        this.a = status;
        this.b = dataHolder;
        this.c = dataHolder != null ? new rid(this.b) : null;
    }

    public final Status aO() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
