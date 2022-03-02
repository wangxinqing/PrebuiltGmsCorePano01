package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlacePhotoResult extends AbstractSafeParcelable implements icl {
    public static final Parcelable.Creator CREATOR = new rif();
    public final Status a;
    final BitmapTeleporter b;
    public final Bitmap c;

    public PlacePhotoResult(Status status, BitmapTeleporter bitmapTeleporter) {
        this.a = status;
        this.b = bitmapTeleporter;
        this.c = bitmapTeleporter != null ? bitmapTeleporter.a() : null;
    }

    public final Status aO() {
        return this.a;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("status", this.a);
        a2.a("bitmap", this.c);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
