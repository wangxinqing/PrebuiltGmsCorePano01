package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AdvertisingOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tig();
    public Strategy a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public byte[] f;
    public boolean g;
    public ParcelUuid h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public AdvertisingOptions() {
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = true;
        this.g = false;
        this.i = true;
        this.j = true;
        this.k = true;
        this.l = false;
        this.m = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdvertisingOptions) {
            AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj;
            return ius.a(this.a, advertisingOptions.a) && ius.a(Boolean.valueOf(this.b), Boolean.valueOf(advertisingOptions.b)) && ius.a(Boolean.valueOf(this.c), Boolean.valueOf(advertisingOptions.c)) && ius.a(Boolean.valueOf(this.d), Boolean.valueOf(advertisingOptions.d)) && ius.a(Boolean.valueOf(this.e), Boolean.valueOf(advertisingOptions.e)) && Arrays.equals(this.f, advertisingOptions.f) && ius.a(Boolean.valueOf(this.g), Boolean.valueOf(advertisingOptions.g)) && ius.a(this.h, advertisingOptions.h) && ius.a(Boolean.valueOf(this.i), Boolean.valueOf(advertisingOptions.i)) && ius.a(Boolean.valueOf(this.j), Boolean.valueOf(advertisingOptions.j)) && ius.a(Boolean.valueOf(this.k), Boolean.valueOf(advertisingOptions.k)) && ius.a(Boolean.valueOf(this.l), Boolean.valueOf(advertisingOptions.l)) && ius.a(Boolean.valueOf(this.m), Boolean.valueOf(advertisingOptions.m));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Boolean.valueOf(this.l), Boolean.valueOf(this.m)});
    }

    public AdvertisingOptions(Strategy strategy, boolean z, boolean z2, boolean z3, boolean z4, byte[] bArr, boolean z5, ParcelUuid parcelUuid, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.a = strategy;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = bArr;
        this.g = z5;
        this.h = parcelUuid;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = z9;
        this.m = z10;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i2, false);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h, i2, false);
        ivx.a(parcel, 9, this.i);
        ivx.a(parcel, 10, this.j);
        ivx.a(parcel, 11, this.k);
        ivx.a(parcel, 12, this.l);
        ivx.a(parcel, 13, this.m);
        ivx.b(parcel, a2);
    }
}
