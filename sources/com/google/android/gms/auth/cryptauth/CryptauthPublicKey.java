package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CryptauthPublicKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gal();
    final int a;
    public final byte[] b;

    public CryptauthPublicKey(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
