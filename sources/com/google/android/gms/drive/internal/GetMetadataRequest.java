package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetMetadataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kvy();
    public final DriveId a;
    public final boolean b;

    public GetMetadataRequest(DriveId driveId, boolean z) {
        this.a = driveId;
        this.b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
