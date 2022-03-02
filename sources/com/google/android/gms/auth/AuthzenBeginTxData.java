package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthzenBeginTxData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ehw();
    final int a;
    final int b;
    public final byte[] c;

    public AuthzenBeginTxData(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthzenBeginTxData) {
            AuthzenBeginTxData authzenBeginTxData = (AuthzenBeginTxData) obj;
            if (this.b != authzenBeginTxData.b || !Arrays.equals(this.c, authzenBeginTxData.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c});
    }

    public AuthzenBeginTxData(int i, byte[] bArr) {
        this.a = 1;
        this.b = i;
        this.c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
