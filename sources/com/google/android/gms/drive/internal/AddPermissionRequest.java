package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AddPermissionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ktx();
    public final DriveId a;
    public final Permission b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;

    public AddPermissionRequest(DriveId driveId, Permission permission, boolean z, String str, boolean z2, String str2) {
        this.a = driveId;
        this.b = permission;
        this.c = z;
        this.d = str;
        this.e = z2;
        this.f = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f, false);
        ivx.b(parcel, a2);
    }
}
