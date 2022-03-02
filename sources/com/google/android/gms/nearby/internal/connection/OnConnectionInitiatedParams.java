package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class OnConnectionInitiatedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uhm();
    public String a;
    public String b;
    public String c;
    public boolean d;
    public byte[] e;
    public byte[] f;
    public byte[] g;
    public boolean h;

    public OnConnectionInitiatedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnConnectionInitiatedParams) {
            OnConnectionInitiatedParams onConnectionInitiatedParams = (OnConnectionInitiatedParams) obj;
            return ius.a(this.a, onConnectionInitiatedParams.a) && ius.a(this.b, onConnectionInitiatedParams.b) && ius.a(this.c, onConnectionInitiatedParams.c) && ius.a(Boolean.valueOf(this.d), Boolean.valueOf(onConnectionInitiatedParams.d)) && Arrays.equals(this.e, onConnectionInitiatedParams.e) && Arrays.equals(this.f, onConnectionInitiatedParams.f) && Arrays.equals(this.g, onConnectionInitiatedParams.g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g))});
    }

    public OnConnectionInitiatedParams(String str, String str2, String str3, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = bArr;
        this.f = bArr2;
        this.g = bArr3;
        this.h = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.a(parcel, 8, this.d);
        ivx.b(parcel, a2);
    }
}
