package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetCapabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeaj();
    public final int a;
    public final CapabilityInfoParcelable b;

    public GetCapabilityResponse(int i, CapabilityInfoParcelable capabilityInfoParcelable) {
        this.a = i;
        this.b = capabilityInfoParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
