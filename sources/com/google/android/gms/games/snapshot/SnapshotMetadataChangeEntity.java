package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SnapshotMetadataChangeEntity extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nnl();
    public final String a;
    public final Long b;
    public final Uri c;
    public BitmapTeleporter d;
    public final Long e;

    SnapshotMetadataChangeEntity() {
        this((String) null, (Long) null, (BitmapTeleporter) null, (Uri) null, (Long) null);
    }

    public SnapshotMetadataChangeEntity(String str, Long l, BitmapTeleporter bitmapTeleporter, Uri uri, Long l2) {
        this.a = str;
        this.b = l;
        this.d = bitmapTeleporter;
        this.c = uri;
        this.e = l2;
        boolean z = true;
        if (!(bitmapTeleporter == null || uri == null)) {
            z = false;
        }
        iva.a(z, (Object) "Cannot set both a URI and an image");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.a(parcel, 5, this.d, i, false);
        ivx.a(parcel, 6, this.e);
        ivx.b(parcel, a2);
    }
}
