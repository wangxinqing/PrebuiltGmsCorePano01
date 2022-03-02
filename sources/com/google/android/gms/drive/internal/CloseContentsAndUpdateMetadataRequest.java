package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CloseContentsAndUpdateMetadataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kuc();
    public final DriveId a;
    public final MetadataBundle b;
    public final Contents c;
    public final boolean d;
    public final String e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;

    public CloseContentsAndUpdateMetadataRequest(DriveId driveId, MetadataBundle metadataBundle, Contents contents, boolean z, String str, int i2, int i3, boolean z2, boolean z3) {
        this.a = driveId;
        this.b = metadataBundle;
        this.c = contents;
        this.d = z;
        this.e = str;
        this.f = i2;
        this.g = i3;
        this.h = z2;
        this.i = z3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i2, false);
        ivx.a(parcel, 3, this.b, i2, false);
        ivx.a(parcel, 4, this.c, i2, false);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e, false);
        ivx.b(parcel, 7, this.f);
        ivx.b(parcel, 8, this.g);
        ivx.a(parcel, 9, this.h);
        ivx.a(parcel, 10, this.i);
        ivx.b(parcel, a2);
    }
}
