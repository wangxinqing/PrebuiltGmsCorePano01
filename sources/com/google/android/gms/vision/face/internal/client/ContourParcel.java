package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ContourParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new advu();
    public final PointF[] a;
    public final int b;

    public ContourParcel(PointF[] pointFArr, int i) {
        this.a = pointFArr;
        this.b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, (Parcelable[]) this.a, i);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
