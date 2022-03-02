package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LocationSettingsResult extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new rer();
    public final Status a;
    public final LocationSettingsStates b;

    public LocationSettingsResult(Status status) {
        this(status, (LocationSettingsStates) null);
    }

    public final Status aO() {
        return this.a;
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.a = status;
        this.b = locationSettingsStates;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
