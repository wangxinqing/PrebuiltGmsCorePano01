package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OnPayloadReceivedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uic();
    public String a;
    public ParcelablePayload b;
    public boolean c;

    public OnPayloadReceivedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnPayloadReceivedParams) {
            OnPayloadReceivedParams onPayloadReceivedParams = (OnPayloadReceivedParams) obj;
            return ius.a(this.a, onPayloadReceivedParams.a) && ius.a(this.b, onPayloadReceivedParams.b) && ius.a(Boolean.valueOf(this.c), Boolean.valueOf(onPayloadReceivedParams.c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c)});
    }

    public OnPayloadReceivedParams(String str, ParcelablePayload parcelablePayload, boolean z) {
        this.a = str;
        this.b = parcelablePayload;
        this.c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
