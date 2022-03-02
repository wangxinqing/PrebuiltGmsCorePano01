package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rvj();
    public final List a;
    public final List b;
    public float c;
    public int d;
    public int e;
    public float f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public List k;

    public PolygonOptions() {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, 5, this.d);
        ivx.b(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f);
        ivx.a(parcel, 8, this.g);
        ivx.a(parcel, 9, this.h);
        ivx.a(parcel, 10, this.i);
        ivx.b(parcel, 11, this.j);
        ivx.c(parcel, 12, this.k, false);
        ivx.b(parcel, a2);
    }

    public PolygonOptions(List list, List list2, float f2, int i2, int i3, float f3, boolean z, boolean z2, boolean z3, int i4, List list3) {
        this.a = list;
        this.b = list2;
        this.c = f2;
        this.d = i2;
        this.e = i3;
        this.f = f3;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = i4;
        this.k = list3;
    }
}
