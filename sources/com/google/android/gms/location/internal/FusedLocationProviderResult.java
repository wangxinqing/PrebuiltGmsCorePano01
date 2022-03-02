package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class FusedLocationProviderResult extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new rfx();
    public static final FusedLocationProviderResult a = new FusedLocationProviderResult(Status.a);
    public final Status b;

    public FusedLocationProviderResult(Status status) {
        this.b = status;
    }

    public final Status aO() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
