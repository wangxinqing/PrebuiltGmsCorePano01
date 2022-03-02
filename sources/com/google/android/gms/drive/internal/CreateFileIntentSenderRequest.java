package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CreateFileIntentSenderRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kug();
    public final MetadataBundle a;
    public final int b;
    public final String c;
    public final DriveId d;
    public final Integer e;

    public CreateFileIntentSenderRequest(MetadataBundle metadataBundle, int i, String str, DriveId driveId, Integer num) {
        this.a = metadataBundle;
        this.b = i;
        this.c = str;
        this.d = driveId;
        this.e = num;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, i, false);
        ivx.a(parcel, 6, this.e);
        ivx.b(parcel, a2);
    }
}
