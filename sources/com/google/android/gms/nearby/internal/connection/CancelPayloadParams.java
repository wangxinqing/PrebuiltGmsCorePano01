package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CancelPayloadParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uds();
    public uha a;
    public long b;

    public CancelPayloadParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CancelPayloadParams) {
            CancelPayloadParams cancelPayloadParams = (CancelPayloadParams) obj;
            return ius.a(this.a, cancelPayloadParams.a) && ius.a(Long.valueOf(this.b), Long.valueOf(cancelPayloadParams.b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b)});
    }

    public CancelPayloadParams(IBinder iBinder, long j) {
        uha uha;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            uha = queryLocalInterface instanceof uha ? (uha) queryLocalInterface : new ugy(iBinder);
        } else {
            uha = null;
        }
        this.a = uha;
        this.b = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a2 = ivx.a(parcel);
        uha uha = this.a;
        if (uha != null) {
            iBinder = uha.asBinder();
        } else {
            iBinder = null;
        }
        ivx.a(parcel, 1, iBinder);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, a2);
    }
}
