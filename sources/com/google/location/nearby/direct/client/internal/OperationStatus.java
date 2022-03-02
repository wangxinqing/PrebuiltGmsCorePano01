package com.google.location.nearby.direct.client.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OperationStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ashh();
    final byte[] a;
    public final ashb b;

    public OperationStatus(ashb ashb) {
        this.b = ashb;
        this.a = ashb.k();
    }

    public final String toString() {
        return "Unloggable";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }

    public OperationStatus(byte[] bArr) {
        this.a = bArr;
        try {
            this.b = (ashb) aucj.a((aucj) ashb.h, bArr);
        } catch (auda e) {
            throw new IllegalArgumentException("Invalid proto bytes", e);
        }
    }
}
