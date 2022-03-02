package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ValuesSetDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lnh();
    final int a;
    final int b;
    final int c;

    public ValuesSetDetails(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
