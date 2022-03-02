package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PopupLocationInfoParcelable extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nmj();
    public final Bundle a;
    public final IBinder b;

    public PopupLocationInfoParcelable(Bundle bundle, IBinder iBinder) {
        this.a = bundle;
        this.b = iBinder;
    }

    public PopupLocationInfoParcelable(nmk nmk) {
        this.a = nmk.a();
        this.b = nmk.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
