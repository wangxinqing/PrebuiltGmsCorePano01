package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DefaultOAuthCredential extends OAuthCredential {
    public static final Parcelable.Creator CREATOR = new apng();
    public final String a;
    public final String b;
    public final String c;
    public final VerifyAssertionRequest d;
    public final String e;
    public final String f;
    public final String g;

    public DefaultOAuthCredential(String str, String str2, String str3, VerifyAssertionRequest verifyAssertionRequest, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = verifyAssertionRequest;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.b(parcel, a2);
    }
}
