package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class IsEnabledParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vyv();
    public vya a;

    public IsEnabledParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IsEnabledParams) {
            return ius.a(this.a, ((IsEnabledParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public IsEnabledParams(IBinder iBinder) {
        vya vya;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IBooleanResultListener");
            vya = queryLocalInterface instanceof vya ? (vya) queryLocalInterface : new vxy(iBinder);
        } else {
            vya = null;
        }
        this.a = vya;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a.asBinder());
        ivx.b(parcel, a2);
    }
}
