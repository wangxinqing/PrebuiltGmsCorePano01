package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OnConnectionResponseParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uhq();
    public String a;
    public int b;
    public byte[] c;

    public OnConnectionResponseParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnConnectionResponseParams) {
            OnConnectionResponseParams onConnectionResponseParams = (OnConnectionResponseParams) obj;
            return ius.a(this.a, onConnectionResponseParams.a) && ius.a(Integer.valueOf(this.b), Integer.valueOf(onConnectionResponseParams.b)) && Arrays.equals(this.c, onConnectionResponseParams.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public OnConnectionResponseParams(String str, int i, byte[] bArr) {
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
