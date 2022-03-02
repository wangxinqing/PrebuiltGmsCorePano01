package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TransitEstimate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aduy();
    public final int a;
    public final float b;

    public TransitEstimate(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
