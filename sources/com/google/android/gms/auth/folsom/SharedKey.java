package com.google.android.gms.auth.folsom;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SharedKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new geo();
    public final int a;
    public final byte[] b;

    public SharedKey(int i, byte[] bArr) {
        iva.a((Object) bArr, (Object) "keyMaterial cannot be null");
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SharedKey) {
            SharedKey sharedKey = (SharedKey) obj;
            return this.a == sharedKey.a && Arrays.equals(this.b, sharedKey.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
