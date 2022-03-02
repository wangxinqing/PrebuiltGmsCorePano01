package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlaceEstimate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adua();
    public static String a = "unknown";
    public final String b;
    public final float c;
    public final String d;
    public final int e;
    public final String f;
    public final float g;
    public final boolean h;

    public PlaceEstimate(String str, float f2, String str2, int i, String str3, float f3, boolean z) {
        this.b = str;
        this.c = f2;
        this.d = str2;
        this.e = i;
        this.f = str3;
        this.g = f3;
        this.h = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c);
        ivx.a(parcel, 3, this.d, false);
        ivx.b(parcel, 4, this.e);
        ivx.a(parcel, 5, this.f, false);
        ivx.a(parcel, 6, this.g);
        ivx.a(parcel, 7, this.h);
        ivx.b(parcel, a2);
    }
}
