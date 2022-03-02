package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fsv();
    public final String a;
    public final String b;

    public SignInPassword(String str, String str2) {
        iva.a((Object) str, (Object) "Account identifier cannot be null");
        String trim = str.trim();
        iva.a(trim, (Object) "Account identifier cannot be empty");
        this.a = trim;
        iva.c(str2);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignInPassword) {
            SignInPassword signInPassword = (SignInPassword) obj;
            if (!ius.a(this.a, signInPassword.a) || !ius.a(this.b, signInPassword.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
