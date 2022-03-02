package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OnStartAdvertisingResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uig();
    public int a;
    public String b;

    public OnStartAdvertisingResultParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnStartAdvertisingResultParams) {
            OnStartAdvertisingResultParams onStartAdvertisingResultParams = (OnStartAdvertisingResultParams) obj;
            return ius.a(Integer.valueOf(this.a), Integer.valueOf(onStartAdvertisingResultParams.a)) && ius.a(this.b, onStartAdvertisingResultParams.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public OnStartAdvertisingResultParams(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
