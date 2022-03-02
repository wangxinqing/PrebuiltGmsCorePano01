package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CreateFileRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kuh();
    public final DriveId a;
    public final MetadataBundle b;
    final Contents c;
    final Integer d;
    public final boolean e;
    public final String f;
    public final int g;
    final int h;

    public CreateFileRequest(DriveId driveId, MetadataBundle metadataBundle, Contents contents, int i, boolean z, String str, int i2, int i3) {
        boolean z2;
        if (!(contents == null || i3 == 0)) {
            if (contents.b == i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            iva.b(z2, "inconsistent contents reference");
        }
        if (i == 0 && contents == null && i3 == 0) {
            throw new IllegalArgumentException("Need a valid contents");
        }
        iva.a((Object) driveId);
        this.a = driveId;
        iva.a((Object) metadataBundle);
        this.b = metadataBundle;
        this.c = contents;
        this.d = Integer.valueOf(i);
        this.f = str;
        this.g = i2;
        this.e = z;
        this.h = i3;
    }

    public final int a() {
        Contents contents = this.c;
        return contents != null ? contents.b : this.h;
    }

    public final int b() {
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.a(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f, false);
        ivx.b(parcel, 8, this.g);
        ivx.b(parcel, 9, this.h);
        ivx.b(parcel, a2);
    }
}
