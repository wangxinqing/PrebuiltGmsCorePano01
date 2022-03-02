package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UdcCacheRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acyv();
    public final int[] a;

    public UdcCacheRequest(int[] iArr) {
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UdcCacheRequest)) {
            return false;
        }
        return Arrays.equals(this.a, ((UdcCacheRequest) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("SettingId", Arrays.toString(this.a));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }
}
