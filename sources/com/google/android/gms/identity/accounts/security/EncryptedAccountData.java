package com.google.android.gms.identity.accounts.security;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class EncryptedAccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pyd();
    public final int a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;

    public EncryptedAccountData(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        boolean z = true;
        iva.b(bArr.length > 0, "Encrypted bytes must not be empty.");
        iva.b(bArr2.length > 0, "IV bytes must not be empty.");
        iva.b(bArr3.length <= 0 ? false : z, "MAC bytes must not be empty.");
        this.a = i;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, false);
        ivx.a(parcel, 2, this.c, false);
        ivx.a(parcel, 3, this.d, false);
        ivx.b(parcel, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, this.a);
        ivx.b(parcel, a2);
    }
}
