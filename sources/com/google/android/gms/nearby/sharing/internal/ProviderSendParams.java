package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ProviderSendParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vzv();
    public String a;
    public ShareTarget b;
    public vyt c;

    public ProviderSendParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderSendParams) {
            ProviderSendParams providerSendParams = (ProviderSendParams) obj;
            return ius.a(this.a, providerSendParams.a) && ius.a(this.b, providerSendParams.b) && ius.a(this.c, providerSendParams.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public ProviderSendParams(String str, ShareTarget shareTarget, IBinder iBinder) {
        vyt vyt;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            vyt = queryLocalInterface instanceof vyt ? (vyt) queryLocalInterface : new vyr(iBinder);
        } else {
            vyt = null;
        }
        this.a = str;
        this.b = shareTarget;
        this.c = vyt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c.asBinder());
        ivx.b(parcel, a2);
    }
}
