package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LocationSettingsConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new reo();
    public final String a;
    public final String b;
    public final String c;

    public LocationSettingsConfiguration(String str, String str2, String str3) {
        this.c = str;
        this.a = str2;
        this.b = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 5, this.c, false);
        ivx.b(parcel, a2);
    }
}
