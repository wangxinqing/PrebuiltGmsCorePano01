package com.google.location.nearby.direct.client.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OperationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ashg();
    final byte[] a;
    public final asfz b;

    public OperationResponse(asfz asfz) {
        this.b = asfz;
        this.a = asfz.k();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }

    public OperationResponse(byte[] bArr) {
        this.a = bArr;
        try {
            this.b = (asfz) aucj.a((aucj) asfz.d, bArr, aubs.c());
        } catch (auda e) {
            throw new IllegalArgumentException("Invalid proto bytes", e);
        }
    }
}
