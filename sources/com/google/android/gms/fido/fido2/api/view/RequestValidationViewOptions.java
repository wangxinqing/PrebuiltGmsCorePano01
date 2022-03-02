package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RequestValidationViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new nau();

    public final nax b() {
        return nax.REQUEST_VALIDATION;
    }

    public final boolean equals(Object obj) {
        return obj instanceof RequestValidationViewOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ivx.b(parcel, ivx.a(parcel));
    }
}
