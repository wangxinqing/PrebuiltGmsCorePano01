package com.google.android.gms.location.places.fencing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlacefencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new riy();
    public final String a;
    public final PlacefencingFilter b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public PlacefencingRequest(String str, PlacefencingFilter placefencingFilter, int i, int i2, int i3, int i4) {
        this.a = str;
        this.b = placefencingFilter;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean a() {
        return (this.c & -13) == 0;
    }

    public final boolean a(int i) {
        return (i & this.c) != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.b(parcel, 5, this.e);
        ivx.b(parcel, 6, this.f);
        ivx.b(parcel, a2);
    }
}
