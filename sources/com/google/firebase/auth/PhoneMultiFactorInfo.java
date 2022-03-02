package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator CREATOR = new apnk();
    public final String a;
    public final String b;
    public final long c;
    public final String d;

    public PhoneMultiFactorInfo(String str, String str2, long j, String str3) {
        iva.c(str);
        this.a = str;
        this.b = str2;
        this.c = j;
        iva.c(str3);
        this.d = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
