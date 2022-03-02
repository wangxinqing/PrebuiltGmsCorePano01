package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Position extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adub();
    public final double a;
    public final double b;

    public Position(double d, double d2) {
        if (d2 >= -180.0d && d2 < 180.0d) {
            this.b = d2;
        } else {
            this.b = ((((d2 - 0.02490234375d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d;
        }
        this.a = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
