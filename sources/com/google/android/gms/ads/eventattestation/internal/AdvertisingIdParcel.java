package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AdvertisingIdParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new c();
    public final String a;
    public final boolean b;

    public AdvertisingIdParcel(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
