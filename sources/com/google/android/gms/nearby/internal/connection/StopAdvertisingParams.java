package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class StopAdvertisingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uiy();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof StopAdvertisingParams);
    }

    public final int hashCode() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ivx.b(parcel, ivx.a(parcel));
    }
}
