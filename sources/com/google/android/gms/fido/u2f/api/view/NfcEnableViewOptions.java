package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NfcEnableViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new nct();

    public final ncx b() {
        return ncx.NFC_ENABLE;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof NfcEnableViewOptions);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ivx.b(parcel, ivx.a(parcel));
    }
}
