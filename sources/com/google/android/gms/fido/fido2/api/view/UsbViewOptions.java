package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UsbViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new nav();

    public final nax b() {
        return nax.USB;
    }

    public final boolean equals(Object obj) {
        return obj instanceof UsbViewOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ivx.b(parcel, ivx.a(parcel));
    }
}
