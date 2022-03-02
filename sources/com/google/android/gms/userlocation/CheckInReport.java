package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CheckInReport extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adtu();
    public final long a;
    public final String b;
    public final Position c;
    public final int d;
    public final byte[] e;
    public final byte[][] f;

    public CheckInReport(long j, String str, Position position, int i, byte[] bArr, byte[][] bArr2) {
        iva.a((Object) str);
        this.a = j;
        this.b = str;
        this.c = position;
        this.d = i;
        this.e = bArr;
        this.f = bArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, 5, this.d);
        ivx.a(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f);
        ivx.b(parcel, a2);
    }
}
