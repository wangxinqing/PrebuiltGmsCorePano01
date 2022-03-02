package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OwnedByMeFilter extends AbstractFilter {
    public static final Parcelable.Creator CREATOR = new ljo();

    public final Object a(ljf ljf) {
        return ljf.a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ivx.b(parcel, ivx.a(parcel));
    }
}
