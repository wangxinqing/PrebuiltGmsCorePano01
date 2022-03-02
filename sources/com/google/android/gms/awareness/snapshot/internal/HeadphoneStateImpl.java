package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class HeadphoneStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new grj();
    public final int a;

    public HeadphoneStateImpl(int i) {
        this.a = i;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, a2);
    }
}
