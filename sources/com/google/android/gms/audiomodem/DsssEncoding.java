package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DsssEncoding extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new edp();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final float f;
    public final int g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public DsssEncoding(int i2, boolean z, boolean z2, int i3, int i4, float f2, int i5, float f3, int i6, int i7, int i8, int i9) {
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.d = i3;
        this.e = i4;
        this.f = f2;
        this.g = i5;
        this.h = f3;
        this.i = i6;
        this.j = i7;
        this.k = i8;
        this.l = i9;
    }

    public final int a() {
        return this.a + this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DsssEncoding) {
            DsssEncoding dsssEncoding = (DsssEncoding) obj;
            return this.a == dsssEncoding.a && this.b == dsssEncoding.b && this.c == dsssEncoding.c && this.d == dsssEncoding.d && this.e == dsssEncoding.e && this.f == dsssEncoding.f && this.g == dsssEncoding.g && this.h == dsssEncoding.h && this.i == dsssEncoding.i && this.j == dsssEncoding.j && this.k == dsssEncoding.k && this.l == dsssEncoding.l;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, 5, this.d);
        ivx.b(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f);
        ivx.b(parcel, 8, this.g);
        ivx.a(parcel, 9, this.h);
        ivx.b(parcel, 10, this.i);
        ivx.b(parcel, 11, this.j);
        ivx.b(parcel, 12, this.k);
        ivx.b(parcel, 13, this.l);
        ivx.b(parcel, a2);
    }
}
