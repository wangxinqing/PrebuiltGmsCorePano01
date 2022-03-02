package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ProgramResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new npv();
    public final int a;
    public final byte[] b;
    public final int c;

    public ProgramResponse(int i, byte[] bArr, int i2) {
        this.a = i;
        this.b = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }

    public ProgramResponse(byte[] bArr, int i) {
        this(1, bArr, i);
    }
}
