package com.google.android.gms.smartdevice.directtransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DirectTransferOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acen();
    public final int a;

    public DirectTransferOptions(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, a2);
    }
}
