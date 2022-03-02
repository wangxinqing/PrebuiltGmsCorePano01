package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator CREATOR = new apnj();
    public String a;
    public String b;
    public boolean c;
    public String d;
    public boolean e;
    public String f;
    public String g;

    public PhoneAuthCredential(String str, String str2, boolean z, String str3, boolean z2, String str4, String str5) {
        boolean z3 = false;
        if (z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) {
            z3 = true;
        } else if ((z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)))) {
            z3 = true;
        }
        iva.b(z3, "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = str4;
        this.g = str5;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new PhoneAuthCredential(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.b(parcel, a2);
    }
}
