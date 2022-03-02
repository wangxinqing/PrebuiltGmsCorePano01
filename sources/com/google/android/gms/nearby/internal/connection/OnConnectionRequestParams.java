package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OnConnectionRequestParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uho();
    public String a;
    public String b;
    public byte[] c;

    public OnConnectionRequestParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnConnectionRequestParams) {
            OnConnectionRequestParams onConnectionRequestParams = (OnConnectionRequestParams) obj;
            return ius.a(this.a, onConnectionRequestParams.a) && ius.a(this.b, onConnectionRequestParams.b) && Arrays.equals(this.c, onConnectionRequestParams.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public OnConnectionRequestParams(String str, String str2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
