package com.google.android.location.quake;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ShakeVettingHints extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajfp();
    public final long a;
    public final boolean b;
    public final boolean c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final int j;

    public ShakeVettingHints(long j2, boolean z, boolean z2, double d2, double d3, double d4, double d5, double d6, double d7, int i2) {
        this.a = j2;
        this.b = z;
        this.c = z2;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = d5;
        this.h = d6;
        this.i = d7;
        this.j = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h);
        ivx.a(parcel, 9, this.i);
        ivx.b(parcel, 10, this.j);
        ivx.b(parcel, a2);
    }
}
