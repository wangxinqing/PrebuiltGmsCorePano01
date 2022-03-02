package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OnContentsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kwq();
    public final Contents a;
    final boolean b;

    public OnContentsResponse(Contents contents, boolean z) {
        this.a = contents;
        this.b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
