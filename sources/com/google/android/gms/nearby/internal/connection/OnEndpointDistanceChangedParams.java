package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OnEndpointDistanceChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uhw();
    public String a;
    public int b;

    public OnEndpointDistanceChangedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnEndpointDistanceChangedParams) {
            OnEndpointDistanceChangedParams onEndpointDistanceChangedParams = (OnEndpointDistanceChangedParams) obj;
            return ius.a(this.a, onEndpointDistanceChangedParams.a) && ius.a(Integer.valueOf(this.b), Integer.valueOf(onEndpointDistanceChangedParams.b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public OnEndpointDistanceChangedParams(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
