package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdatePermissionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kxu();
    public final DriveId a;
    public final String b;
    public final int c;
    public final boolean d;
    public final String e;

    public UpdatePermissionRequest(DriveId driveId, String str, int i, boolean z, String str2) {
        this.a = driveId;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.b(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e, false);
        ivx.b(parcel, a2);
    }
}
