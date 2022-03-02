package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PayloadTransferUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tjf();
    public long a;
    public int b;
    public long c;
    public long d;

    public PayloadTransferUpdate() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) obj;
            return ius.a(Long.valueOf(this.a), Long.valueOf(payloadTransferUpdate.a)) && ius.a(Integer.valueOf(this.b), Integer.valueOf(payloadTransferUpdate.b)) && ius.a(Long.valueOf(this.c), Long.valueOf(payloadTransferUpdate.c)) && ius.a(Long.valueOf(this.d), Long.valueOf(payloadTransferUpdate.d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d)});
    }

    public PayloadTransferUpdate(long j, int i, long j2, long j3) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
