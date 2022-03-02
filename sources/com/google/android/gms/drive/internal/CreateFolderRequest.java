package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CreateFolderRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kui();
    public final DriveId a;
    public final MetadataBundle b;

    public CreateFolderRequest(DriveId driveId, MetadataBundle metadataBundle) {
        iva.a((Object) driveId);
        this.a = driveId;
        iva.a((Object) metadataBundle);
        this.b = metadataBundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
