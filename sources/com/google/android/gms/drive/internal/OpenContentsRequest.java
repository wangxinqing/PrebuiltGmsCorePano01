package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OpenContentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kxe();
    public final DriveId a;
    public final int b;
    public final int c;

    public OpenContentsRequest(DriveId driveId, int i, int i2) {
        this.a = driveId;
        this.b = i;
        this.c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
