package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Payload extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gao();
    final int a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;

    public Payload(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = i;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
    }

    public Payload(byte[] bArr, byte[] bArr2) {
        this(1, (byte[]) null, bArr, bArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
