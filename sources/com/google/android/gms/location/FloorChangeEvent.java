package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FloorChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rcz();
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;

    public FloorChangeEvent(int i, int i2, long j, long j2, long j3, long j4, float f2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i3 = i2;
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        boolean z8 = true;
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "confidence must be equal to or greater than 0");
        if (i3 <= 100) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2, "confidence must be equal to or less than 100");
        if (j5 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        iva.b(z3, "startTimeMillis must be greater than 0");
        if (j5 <= j6) {
            z4 = true;
        } else {
            z4 = false;
        }
        iva.b(z4, "endTimeMillis must be equal to or greater than startTimeMillis");
        if (j7 >= 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        iva.b(z5, "startElapsedRealtimeMillis must be equal to or greater than 0");
        if (j7 <= j8) {
            z6 = true;
        } else {
            z6 = false;
        }
        iva.b(z6, "endElapsedRealtimeMillis must be equal to or greater than startElapsedRealtimeMillis");
        if (j7 < j5) {
            z7 = true;
        } else {
            z7 = false;
        }
        iva.b(z7, "startTimeMillis must be greater than startElapsedRealtimeMillis");
        iva.b(j8 >= j6 ? false : z8, "endTimeMillis must be greater than endElapsedRealtimeMillis");
        this.a = i;
        this.b = i3;
        this.c = j5;
        this.d = j6;
        this.e = j7;
        this.f = j8;
        this.g = f2;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "FloorChangeEvent [type=%d, confidence=%d, elevationChange=%f, startTimeMillis=%d, endTimeMillis=%d, startElapsedRealtimeMillis=%d, endElapsedRealtimeMillis=%d]", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Float.valueOf(this.g), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.b(parcel, a2);
    }
}
