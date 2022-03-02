package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class NearbyAlertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rhl();
    public final int a;
    public final int b;
    public final NearbyAlertFilter c;
    public final boolean d;
    public final int e;
    public int f = 110;

    public NearbyAlertRequest(int i, int i2, PlaceFilter placeFilter, NearbyAlertFilter nearbyAlertFilter, boolean z, int i3, int i4) {
        this.a = i;
        this.b = i2;
        if (nearbyAlertFilter != null) {
            this.c = nearbyAlertFilter;
        } else {
            NearbyAlertFilter nearbyAlertFilter2 = null;
            if (placeFilter != null) {
                Set set = placeFilter.g;
                if (set != null && !set.isEmpty()) {
                    nearbyAlertFilter2 = NearbyAlertFilter.b(placeFilter.g);
                } else {
                    Set set2 = placeFilter.e;
                    if (set2 != null && !set2.isEmpty()) {
                        nearbyAlertFilter2 = NearbyAlertFilter.c(placeFilter.e);
                    }
                    this.c = nearbyAlertFilter2;
                }
            }
            this.c = nearbyAlertFilter2;
        }
        this.d = z;
        this.e = i3;
        this.f = i4;
    }

    public static NearbyAlertRequest a(NearbyAlertFilter nearbyAlertFilter, int i, int i2) {
        return new NearbyAlertRequest(3, -1, (PlaceFilter) null, nearbyAlertFilter, false, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyAlertRequest) {
            NearbyAlertRequest nearbyAlertRequest = (NearbyAlertRequest) obj;
            return this.a == nearbyAlertRequest.a && this.b == nearbyAlertRequest.b && ius.a(this.c, nearbyAlertRequest.c) && this.f == nearbyAlertRequest.f && this.e == nearbyAlertRequest.e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(this.f), Integer.valueOf(this.e)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("transitionTypes", Integer.valueOf(this.a));
        a2.a("loiteringTimeMillis", Integer.valueOf(this.b));
        a2.a("nearbyAlertFilter", this.c);
        a2.a("priority", Integer.valueOf(this.f));
        a2.a("radiusType", Integer.valueOf(this.e));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, (Parcelable) null, i, false);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.a(parcel, 5, this.d);
        ivx.b(parcel, 6, this.e);
        ivx.b(parcel, 7, this.f);
        ivx.b(parcel, a2);
    }
}
