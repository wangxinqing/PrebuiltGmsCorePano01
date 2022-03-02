package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fvw();
    @Deprecated
    String a;
    public GoogleSignInAccount b;
    @Deprecated
    String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        iva.a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        iva.a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 4, this.a, false);
        ivx.a(parcel, 7, this.b, i, false);
        ivx.a(parcel, 8, this.c, false);
        ivx.b(parcel, a2);
    }
}
