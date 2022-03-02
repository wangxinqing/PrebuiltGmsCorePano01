package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ValuesRemovedDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lng();
    final int a;
    final int b;
    final int c;
    final String d;
    final int e;

    public ValuesRemovedDetails(int i, int i2, int i3, String str, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, false);
        ivx.b(parcel, 6, this.e);
        ivx.b(parcel, a2);
    }
}
