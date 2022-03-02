package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ExportedSymmetricKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gam();
    final int a;
    public final byte[] b;
    public final long c;

    public ExportedSymmetricKey(int i, byte[] bArr, long j) {
        this.a = i;
        this.b = bArr;
        this.c = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
