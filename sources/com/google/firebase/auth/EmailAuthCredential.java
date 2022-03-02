package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator CREATOR = new apnh();
    public String a;
    public String b;
    public final String c;
    public String d;
    public boolean e;

    public EmailAuthCredential(String str, String str2, String str3, String str4, boolean z) {
        iva.c(str);
        this.a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e);
        ivx.b(parcel, a2);
    }
}
