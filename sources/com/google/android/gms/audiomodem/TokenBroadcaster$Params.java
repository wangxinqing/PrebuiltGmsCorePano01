package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TokenBroadcaster$Params extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new eek();
    public final byte[] a;
    public final int b;
    public final Encoding[] c;
    public final int d;

    public TokenBroadcaster$Params(byte[] bArr, int i, Encoding[] encodingArr) {
        this(bArr, i, encodingArr, -1);
    }

    public TokenBroadcaster$Params(byte[] bArr, int i, Encoding[] encodingArr, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = encodingArr;
        this.d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, 3, this.b);
        ivx.a(parcel, 4, (Parcelable[]) this.c, i);
        ivx.b(parcel, 5, this.d);
        ivx.b(parcel, a2);
    }
}
