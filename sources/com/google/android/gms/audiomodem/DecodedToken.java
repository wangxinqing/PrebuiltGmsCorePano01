package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DecodedToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new edo();
    public final byte[] a;
    public final int b;

    public DecodedToken(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, 3, this.b);
        ivx.b(parcel, a2);
    }
}
