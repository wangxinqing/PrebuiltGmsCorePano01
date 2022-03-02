package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rva();
    public LatLng a;
    public double b;
    public float c;
    public int d;
    public int e;
    public float f;
    public boolean g;
    public boolean h;
    public List i;

    public CircleOptions() {
        this.a = null;
        this.b = 0.0d;
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = null;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i2, false);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, 5, this.d);
        ivx.b(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f);
        ivx.a(parcel, 8, this.g);
        ivx.a(parcel, 9, this.h);
        ivx.c(parcel, 10, this.i, false);
        ivx.b(parcel, a2);
    }

    public CircleOptions(LatLng latLng, double d2, float f2, int i2, int i3, float f3, boolean z, boolean z2, List list) {
        this.a = latLng;
        this.b = d2;
        this.c = f2;
        this.d = i2;
        this.e = i3;
        this.f = f3;
        this.g = z;
        this.h = z2;
        this.i = list;
    }
}
