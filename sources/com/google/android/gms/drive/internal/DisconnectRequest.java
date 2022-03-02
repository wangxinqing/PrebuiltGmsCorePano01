package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DisconnectRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kul();

    public final void writeToParcel(Parcel parcel, int i) {
        ivx.b(parcel, ivx.a(parcel));
    }
}
