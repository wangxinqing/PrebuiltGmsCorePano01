package com.google.android.gms.ads.eventattestation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ImpressionAttestationTokenResponseParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new j();
    public final byte[] a;

    public ImpressionAttestationTokenResponseParcel(byte[] bArr) {
        this.a = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }
}
