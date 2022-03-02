package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ControlProgressRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kue();
    public final int a;
    public final int b;
    public final DriveId c;

    public ControlProgressRequest(int i, int i2, DriveId driveId) {
        this.a = i;
        this.b = i2;
        this.c = driveId;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
