package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ScreenStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new grn();
    public final int a;

    public ScreenStateImpl(int i) {
        this.a = i;
    }

    public final String toString() {
        int i = this.a;
        return i != 1 ? i != 2 ? "ScreenState: UNKNOWN" : "ScreenState: SCREEN_ON" : "ScreenState: SCREEN_OFF";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, a2);
    }
}
