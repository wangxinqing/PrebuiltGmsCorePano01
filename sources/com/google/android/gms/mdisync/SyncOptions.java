package com.google.android.gms.mdisync;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SyncOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new seu();

    public final void writeToParcel(Parcel parcel, int i) {
        ivx.b(parcel, ivx.a(parcel));
    }
}
