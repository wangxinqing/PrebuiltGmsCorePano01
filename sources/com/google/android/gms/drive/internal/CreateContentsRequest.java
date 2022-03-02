package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CreateContentsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kuf();
    public final int a;

    public CreateContentsRequest(int i) {
        boolean z = true;
        if (!(i == 536870912 || i == 805306368)) {
            z = false;
        }
        iva.b(z, "Cannot create a new read-only contents!");
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.b(parcel, a2);
    }
}
