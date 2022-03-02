package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OnConnectionResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uhs();
    public String a;
    public int b;
    public byte[] c;

    public OnConnectionResultParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnConnectionResultParams) {
            OnConnectionResultParams onConnectionResultParams = (OnConnectionResultParams) obj;
            return ius.a(this.a, onConnectionResultParams.a) && ius.a(Integer.valueOf(this.b), Integer.valueOf(onConnectionResultParams.b)) && Arrays.equals(this.c, onConnectionResultParams.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public OnConnectionResultParams(String str, int i, byte[] bArr) {
        this.a = str;
        this.b = i;
        this.c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
