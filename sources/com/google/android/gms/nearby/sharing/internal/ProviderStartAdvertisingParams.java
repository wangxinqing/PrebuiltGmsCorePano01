package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ProviderStartAdvertisingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vzx();
    public String a;
    public vyt b;

    public ProviderStartAdvertisingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderStartAdvertisingParams) {
            ProviderStartAdvertisingParams providerStartAdvertisingParams = (ProviderStartAdvertisingParams) obj;
            return ius.a(this.a, providerStartAdvertisingParams.a) && ius.a(this.b, providerStartAdvertisingParams.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public ProviderStartAdvertisingParams(String str, IBinder iBinder) {
        vyt vyt;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            vyt = queryLocalInterface instanceof vyt ? (vyt) queryLocalInterface : new vyr(iBinder);
        } else {
            vyt = null;
        }
        this.a = str;
        this.b = vyt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b.asBinder());
        ivx.b(parcel, a2);
    }
}
