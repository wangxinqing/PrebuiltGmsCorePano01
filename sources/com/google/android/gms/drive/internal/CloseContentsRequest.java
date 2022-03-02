package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CloseContentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kud();
    public final Contents a;
    public final Boolean b;
    public final int c;

    public CloseContentsRequest(Contents contents, Boolean bool, int i) {
        this.a = contents;
        this.b = bool;
        this.c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
