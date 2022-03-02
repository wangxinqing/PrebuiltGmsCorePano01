package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlaceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rii();
    public final PlaceFilter a;
    public final long b;
    public final int c;
    public final long d;
    public final boolean e;
    public final boolean f;

    public PlaceRequest(PlaceFilter placeFilter, long j, int i, long j2, boolean z, boolean z2) {
        this.a = placeFilter;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaceRequest) {
            PlaceRequest placeRequest = (PlaceRequest) obj;
            return ius.a(this.a, placeRequest.a) && this.b == placeRequest.b && this.c == placeRequest.c && this.d == placeRequest.d && this.e == placeRequest.e && this.f == placeRequest.f;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("filter", this.a);
        a2.a("interval", Long.valueOf(this.b));
        a2.a("priority", Integer.valueOf(this.c));
        a2.a("expireAt", Long.valueOf(this.d));
        a2.a("receiveFailures", Boolean.valueOf(this.e));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f);
        ivx.b(parcel, a2);
    }
}
