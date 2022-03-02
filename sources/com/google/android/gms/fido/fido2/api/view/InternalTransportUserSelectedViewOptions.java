package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InternalTransportUserSelectedViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new naq();

    public final nax b() {
        return nax.INTERNAL_TRANSPORT_USER_SELECTED;
    }

    public final boolean equals(Object obj) {
        return obj instanceof InternalTransportUserSelectedViewOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ivx.b(parcel, ivx.a(parcel));
    }
}
