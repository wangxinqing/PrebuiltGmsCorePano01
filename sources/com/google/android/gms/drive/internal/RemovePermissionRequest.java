package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RemovePermissionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kxj();
    public final DriveId a;
    public final String b;
    public final boolean c;
    public final String d;

    public RemovePermissionRequest(DriveId driveId, String str, boolean z, String str2) {
        this.a = driveId;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, false);
        ivx.b(parcel, a2);
    }
}
