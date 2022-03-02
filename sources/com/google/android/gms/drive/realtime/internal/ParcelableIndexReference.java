package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ParcelableIndexReference extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lmr();
    public final String a;
    public final int b;
    public final boolean c;
    public final int d;

    public ParcelableIndexReference(String str, int i, boolean z, int i2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.b(parcel, 5, this.d);
        ivx.b(parcel, a2);
    }
}
