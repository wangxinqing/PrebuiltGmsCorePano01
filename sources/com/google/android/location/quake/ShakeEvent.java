package com.google.android.location.quake;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ShakeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajfn();
    public final long a;
    public final ShakeVettingHints b;

    public ShakeEvent(long j, ShakeVettingHints shakeVettingHints) {
        this.a = j;
        this.b = shakeVettingHints;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }
}