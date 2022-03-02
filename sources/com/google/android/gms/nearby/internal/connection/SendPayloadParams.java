package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SendPayloadParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uis();
    public uha a;
    public String[] b;
    public ParcelablePayload c;
    public boolean d;

    public SendPayloadParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendPayloadParams) {
            SendPayloadParams sendPayloadParams = (SendPayloadParams) obj;
            return ius.a(this.a, sendPayloadParams.a) && Arrays.equals(this.b, sendPayloadParams.b) && ius.a(this.c, sendPayloadParams.c) && ius.a(Boolean.valueOf(this.d), Boolean.valueOf(sendPayloadParams.d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c, Boolean.valueOf(this.d)});
    }

    public SendPayloadParams(IBinder iBinder, String[] strArr, ParcelablePayload parcelablePayload, boolean z) {
        uha uha;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            uha = queryLocalInterface instanceof uha ? (uha) queryLocalInterface : new ugy(iBinder);
        } else {
            uha = null;
        }
        this.a = uha;
        this.b = strArr;
        this.c = parcelablePayload;
        this.d = z;
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
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
