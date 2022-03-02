package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReferenceShiftedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lnb();
    final String a;
    final String b;
    final int c;
    final int d;

    public ReferenceShiftedDetails(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, 4, this.c);
        ivx.b(parcel, 5, this.d);
        ivx.b(parcel, a2);
    }
}
