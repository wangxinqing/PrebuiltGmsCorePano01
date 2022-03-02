package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AdRequestAttestationTokenRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new b();
    public final String a;
    public final byte[] b;
    public final String c;

    public AdRequestAttestationTokenRequestParcel(String str, byte[] bArr, String str2) {
        this.a = str;
        this.b = bArr;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
