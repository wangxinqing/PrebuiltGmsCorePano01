package com.google.android.gms.instantapps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LaunchSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qeb();

    public final void writeToParcel(Parcel parcel, int i) {
        ivx.b(parcel, ivx.a(parcel));
    }
}
