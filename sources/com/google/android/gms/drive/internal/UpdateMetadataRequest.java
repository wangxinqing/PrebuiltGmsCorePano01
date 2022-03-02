package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdateMetadataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kxt();
    public final DriveId a;
    public final MetadataBundle b;

    public UpdateMetadataRequest(DriveId driveId, MetadataBundle metadataBundle) {
        this.a = driveId;
        this.b = metadataBundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
