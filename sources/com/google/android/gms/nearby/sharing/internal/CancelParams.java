package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CancelParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vxe();
    public ShareTarget a;
    public ifu b;

    public CancelParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CancelParams) {
            CancelParams cancelParams = (CancelParams) obj;
            return ius.a(this.a, cancelParams.a) && ius.a(this.b, cancelParams.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public CancelParams(ShareTarget shareTarget, IBinder iBinder) {
        ifu ifu;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            ifu = queryLocalInterface instanceof ifu ? (ifu) queryLocalInterface : new ifs(iBinder);
        } else {
            ifu = null;
        }
        this.a = shareTarget;
        this.b = ifu;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b.asBinder());
        ivx.b(parcel, a2);
    }
}
