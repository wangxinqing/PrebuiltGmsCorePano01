package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fss();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String g;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6) {
        iva.c(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = str6;
    }

    public final int a() {
        int i;
        if (!TextUtils.isEmpty(this.b)) {
            i = 2;
        } else {
            i = 1;
        }
        if (!TextUtils.isEmpty(this.c)) {
            i++;
        }
        if (!TextUtils.isEmpty(this.d)) {
            i++;
        }
        return (this.e == null || Uri.EMPTY.equals(this.e)) ? i : i + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignInCredential) {
            SignInCredential signInCredential = (SignInCredential) obj;
            if (!ius.a(this.a, signInCredential.a) || !ius.a(this.b, signInCredential.b) || !ius.a(this.c, signInCredential.c) || !ius.a(this.d, signInCredential.d) || !ius.a(this.e, signInCredential.e) || !ius.a(this.f, signInCredential.f) || !ius.a(this.g, signInCredential.g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, false);
        ivx.b(parcel, a2);
    }
}
