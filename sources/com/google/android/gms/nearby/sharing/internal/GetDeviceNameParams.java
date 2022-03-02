package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GetDeviceNameParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vxs();
    public vyq a;

    public GetDeviceNameParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetDeviceNameParams) {
            return ius.a(this.a, ((GetDeviceNameParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public GetDeviceNameParams(IBinder iBinder) {
        vyq vyq;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IStringResultListener");
            vyq = queryLocalInterface instanceof vyq ? (vyq) queryLocalInterface : new vyo(iBinder);
        } else {
            vyq = null;
        }
        this.a = vyq;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a.asBinder());
        ivx.b(parcel, a2);
    }
}
