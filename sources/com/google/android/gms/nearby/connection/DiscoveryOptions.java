package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tix();
    public Strategy a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public ParcelUuid f;
    public boolean g;
    public boolean h;
    public boolean i;

    public DiscoveryOptions() {
        this.b = false;
        this.c = true;
        this.d = true;
        this.e = false;
        this.g = true;
        this.h = true;
        this.i = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscoveryOptions) {
            DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
            return ius.a(this.a, discoveryOptions.a) && ius.a(Boolean.valueOf(this.b), Boolean.valueOf(discoveryOptions.b)) && ius.a(Boolean.valueOf(this.c), Boolean.valueOf(discoveryOptions.c)) && ius.a(Boolean.valueOf(this.d), Boolean.valueOf(discoveryOptions.d)) && ius.a(Boolean.valueOf(this.e), Boolean.valueOf(discoveryOptions.e)) && ius.a(this.f, discoveryOptions.f) && ius.a(Boolean.valueOf(this.g), Boolean.valueOf(discoveryOptions.g)) && ius.a(Boolean.valueOf(this.h), Boolean.valueOf(discoveryOptions.h)) && ius.a(Boolean.valueOf(this.i), Boolean.valueOf(discoveryOptions.i));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i)});
    }

    public DiscoveryOptions(Strategy strategy, boolean z, boolean z2, boolean z3, boolean z4, ParcelUuid parcelUuid, boolean z5, boolean z6, boolean z7) {
        this.a = strategy;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = parcelUuid;
        this.g = z5;
        this.h = z6;
        this.i = z7;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i2, false);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, i2, false);
        ivx.a(parcel, 8, this.g);
        ivx.a(parcel, 9, this.h);
        ivx.a(parcel, 10, this.i);
        ivx.b(parcel, a2);
    }
}
