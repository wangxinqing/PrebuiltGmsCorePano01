package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.ads.afma.proto2api.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GassResponseParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new npm();
    public final int a;
    public c b;
    public byte[] c;

    public GassResponseParcel(int i, byte[] bArr) {
        this.a = i;
        this.b = null;
        this.c = bArr;
        a();
    }

    public final void a() {
        c cVar = this.b;
        if (cVar == null && this.c != null) {
            return;
        }
        if (cVar != null && this.c == null) {
            return;
        }
        if (cVar != null && this.c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (cVar == null && this.c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        byte[] bArr = this.c;
        if (bArr == null) {
            bArr = this.b.k();
        }
        ivx.a(parcel, 2, bArr, false);
        ivx.b(parcel, a2);
    }

    public GassResponseParcel(c cVar) {
        this.a = 1;
        iva.a((Object) cVar);
        this.b = cVar;
        this.c = null;
        a();
    }
}
