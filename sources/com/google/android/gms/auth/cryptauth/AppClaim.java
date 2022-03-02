package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppClaim extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gab();
    final int a;
    public final String b;
    public final boolean c;
    public final byte[] d;

    public AppClaim(int i, String str, boolean z, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
