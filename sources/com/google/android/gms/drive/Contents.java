package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Contents extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jyy();
    public final ParcelFileDescriptor a;
    public final int b;
    final int c;
    public final DriveId d;
    public final boolean e;
    final String f;

    public Contents(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, DriveId driveId, boolean z, String str) {
        this.a = parcelFileDescriptor;
        this.b = i;
        this.c = i2;
        this.d = driveId;
        this.e = z;
        this.f = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, i, false);
        ivx.a(parcel, 7, this.e);
        ivx.a(parcel, 8, this.f, false);
        ivx.b(parcel, a2);
    }
}
