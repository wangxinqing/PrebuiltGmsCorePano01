package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class Snoop$Params extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new eei();
    public final Encoding[] a;
    public final boolean b;
    public final boolean c;
    public final long d;

    public Snoop$Params(Encoding[] encodingArr, boolean z, boolean z2, long j) {
        this.a = encodingArr;
        this.b = z;
        this.c = z2;
        this.d = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, (Parcelable[]) this.a, i);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d);
        ivx.b(parcel, a2);
    }
}
