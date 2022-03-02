package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DistanceImpl extends AbstractSafeParcelable implements uww {
    public static final Parcelable.Creator CREATOR = new vby();
    final int a;
    public final int b;
    public final double c;

    public DistanceImpl(double d) {
        this(1, 1, d);
    }

    public final double a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DistanceImpl) {
            DistanceImpl distanceImpl = (DistanceImpl) obj;
            return this.b == distanceImpl.b && compareTo(distanceImpl) == 0;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Double.valueOf(this.c)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(this.c);
        objArr[1] = this.b != 1 ? "UNKNOWN" : "LOW";
        return String.format(locale, "(%.1fm, %s)", objArr);
    }

    public DistanceImpl(int i, int i2, double d) {
        this.a = i;
        this.b = i2;
        this.c = d;
    }

    /* renamed from: a */
    public final int compareTo(uww uww) {
        if (!Double.isNaN(this.c) || !Double.isNaN(uww.a())) {
            return Double.compare(this.c, uww.a());
        }
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
