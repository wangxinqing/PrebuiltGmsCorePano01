package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PartialDriveId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lbw();
    public final String a;
    public final long b;
    public final int c;

    public PartialDriveId(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
