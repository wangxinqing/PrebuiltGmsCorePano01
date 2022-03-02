package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RegistrationInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yfc();
    public final String a;
    public final int b;
    public final String[] c;
    public final byte[] d;
    public final boolean e;
    public final int[] f;
    public final String g;

    public RegistrationInfo(String str, int i, String[] strArr, byte[] bArr, boolean z, int[] iArr, String str2) {
        this.a = str;
        this.b = i;
        this.c = strArr;
        this.d = bArr;
        this.e = z;
        this.f = iArr;
        this.g = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.b(parcel, a2);
    }
}
