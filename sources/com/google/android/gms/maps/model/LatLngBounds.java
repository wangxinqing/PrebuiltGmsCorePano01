package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rvd();
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        iva.a((Object) latLng, (Object) "null southwest");
        iva.a((Object) latLng2, (Object) "null northeast");
        double d = latLng2.a;
        double d2 = latLng.a;
        iva.b(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.a));
        this.a = latLng;
        this.b = latLng2;
    }

    public final LatLng a() {
        double d;
        LatLng latLng = this.a;
        double d2 = latLng.a;
        LatLng latLng2 = this.b;
        double d3 = (d2 + latLng2.a) / 2.0d;
        double d4 = latLng2.b;
        double d5 = latLng.b;
        if (d5 > d4) {
            d = ((d4 + 360.0d) + d5) / 2.0d;
        } else {
            d = (d4 + d5) / 2.0d;
        }
        return new LatLng(d3, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngBounds) {
            LatLngBounds latLngBounds = (LatLngBounds) obj;
            return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("southwest", this.a);
        a2.a("northeast", this.b);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.b(parcel, a2);
    }

    public final boolean a(LatLng latLng) {
        double d = latLng.a;
        LatLng latLng2 = this.a;
        if (latLng2.a > d) {
            return false;
        }
        LatLng latLng3 = this.b;
        if (d > latLng3.a) {
            return false;
        }
        double d2 = latLng.b;
        double d3 = latLng2.b;
        double d4 = latLng3.b;
        return d3 <= d4 ? d3 <= d2 && d2 <= d4 : d3 <= d2 || d2 <= d4;
    }
}
