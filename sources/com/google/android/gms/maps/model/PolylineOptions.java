package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rvk();
    public final List a;
    public float b;
    public int c;
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;
    public Cap h;
    public Cap i;
    public int j;
    public List k;

    public PolylineOptions() {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = new ButtCap();
        this.i = new ButtCap();
        this.j = 0;
        this.k = null;
        this.a = new ArrayList();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f);
        ivx.a(parcel, 8, this.g);
        ivx.a(parcel, 9, this.h, i2, false);
        ivx.a(parcel, 10, this.i, i2, false);
        ivx.b(parcel, 11, this.j);
        ivx.c(parcel, 12, this.k, false);
        ivx.b(parcel, a2);
    }

    public PolylineOptions(List list, float f2, int i2, float f3, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i3, List list2) {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = 0.0f;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = new ButtCap();
        this.i = new ButtCap();
        this.a = list;
        this.b = f2;
        this.c = i2;
        this.d = f3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        if (cap != null) {
            this.h = cap;
        }
        if (cap2 != null) {
            this.i = cap2;
        }
        this.j = i3;
        this.k = list2;
    }
}
