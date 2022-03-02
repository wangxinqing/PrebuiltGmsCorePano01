package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PIMEUpdateResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dte();
    final String a;
    public final byte[] b;
    public final PIMEUpdate[] c;

    public PIMEUpdateResponse(String str, byte[] bArr, PIMEUpdate[] pIMEUpdateArr) {
        this.a = str;
        this.b = bArr;
        this.c = pIMEUpdateArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, (Parcelable[]) this.c, i);
        ivx.b(parcel, a2);
    }
}
