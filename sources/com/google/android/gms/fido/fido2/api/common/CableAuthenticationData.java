package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CableAuthenticationData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new mzo();
    public final long a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;

    public CableAuthenticationData(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = j;
        this.b = (byte[]) iva.a((Object) bArr);
        this.c = (byte[]) iva.a((Object) bArr2);
        this.d = (byte[]) iva.a((Object) bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CableAuthenticationData) {
            CableAuthenticationData cableAuthenticationData = (CableAuthenticationData) obj;
            if (this.a != cableAuthenticationData.a || !Arrays.equals(this.b, cableAuthenticationData.b) || !Arrays.equals(this.c, cableAuthenticationData.c) || !Arrays.equals(this.d, cableAuthenticationData.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
