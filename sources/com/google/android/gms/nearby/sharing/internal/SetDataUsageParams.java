package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SetDataUsageParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new waq();
    public int a;
    public ifu b;

    public SetDataUsageParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetDataUsageParams) {
            SetDataUsageParams setDataUsageParams = (SetDataUsageParams) obj;
            return ius.a(Integer.valueOf(this.a), Integer.valueOf(setDataUsageParams.a)) && ius.a(this.b, setDataUsageParams.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public SetDataUsageParams(int i, IBinder iBinder) {
        ifu ifu;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ifu = queryLocalInterface instanceof ifu ? (ifu) queryLocalInterface : new ifs(iBinder);
        } else {
            ifu = null;
        }
        this.a = i;
        this.b = ifu;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b.asBinder());
        ivx.b(parcel, a2);
    }
}
