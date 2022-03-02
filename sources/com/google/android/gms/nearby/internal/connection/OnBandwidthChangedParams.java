package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OnBandwidthChangedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uhk();
    public String a;
    public int b;

    public OnBandwidthChangedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnBandwidthChangedParams) {
            OnBandwidthChangedParams onBandwidthChangedParams = (OnBandwidthChangedParams) obj;
            return ius.a(this.a, onBandwidthChangedParams.a) && ius.a(Integer.valueOf(this.b), Integer.valueOf(onBandwidthChangedParams.b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public OnBandwidthChangedParams(String str, int i) {
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
