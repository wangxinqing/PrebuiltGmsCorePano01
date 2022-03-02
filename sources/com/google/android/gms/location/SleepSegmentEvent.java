package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfc();
    public final long a;
    public final long b;
    public final int c;

    public SleepSegmentEvent(long j, long j2, int i) {
        iva.b(j <= j2, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
