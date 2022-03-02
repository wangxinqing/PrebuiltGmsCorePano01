package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class InternalSignInCredentialWrapper extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fsk();
    public static final Scope a = new Scope("profile");
    public static final Scope b = new Scope("email");
    public static final Scope c = new Scope("openid");
    public static final Scope d = new Scope("https://www.googleapis.com/auth/userinfo.profile");
    public static final Scope e = new Scope("https://www.googleapis.com/auth/userinfo.email");
    public final Account f;
    public final SignInCredential g;
    public final List h;
    public final boolean i;

    public InternalSignInCredentialWrapper(Account account, SignInCredential signInCredential, List list, boolean z) {
        iva.a((Object) account);
        this.f = account;
        iva.a((Object) signInCredential);
        this.g = signInCredential;
        if (!TextUtils.isEmpty(signInCredential.f)) {
            iva.b(list.isEmpty(), "Password credentials should have empty granted-scopes list");
            iva.b(!z, "Converted credentials should not contain the original password");
        }
        iva.a((Object) list);
        this.h = list;
        this.i = z;
    }

    public final boolean a() {
        return this.i || !TextUtils.isEmpty(this.g.f) || this.h.contains(c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InternalSignInCredentialWrapper) {
            InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) obj;
            if (this.i != internalSignInCredentialWrapper.i || !ius.a(this.f, internalSignInCredentialWrapper.f) || !ius.a(this.g, internalSignInCredentialWrapper.g) || !ius.a(this.h, internalSignInCredentialWrapper.h)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.g, this.h, Boolean.valueOf(this.i)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.f, i2, false);
        ivx.a(parcel, 2, this.g, i2, false);
        ivx.c(parcel, 3, this.h, false);
        ivx.a(parcel, 4, this.i);
        ivx.b(parcel, a2);
    }
}
