package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UnlockFactoryResetProtectionResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gfu();
    final int a;
    public final int b;

    public UnlockFactoryResetProtectionResponse(int i) {
        this(1, i);
    }

    public UnlockFactoryResetProtectionResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
