package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SendDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new eud();
    final int a = 1;
    public final String b;
    public final byte[] c;

    public SendDataRequest(String str, byte[] bArr) {
        iva.a((Object) str);
        this.b = str;
        this.c = (byte[]) iva.a((Object) bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
