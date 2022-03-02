package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OnStoppedAdvertisingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uih();
    public int a;

    private OnStoppedAdvertisingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnStoppedAdvertisingParams) {
            return ius.a(Integer.valueOf(this.a), Integer.valueOf(((OnStoppedAdvertisingParams) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public OnStoppedAdvertisingParams(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, a2);
    }
}
