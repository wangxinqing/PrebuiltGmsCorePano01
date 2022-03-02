package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new mzj();
    public final FidoAppIdExtension a;
    public final CableAuthenticationExtension b;
    public final UserVerificationMethodExtension c;

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, CableAuthenticationExtension cableAuthenticationExtension, UserVerificationMethodExtension userVerificationMethodExtension) {
        this.a = fidoAppIdExtension;
        this.c = userVerificationMethodExtension;
        this.b = cableAuthenticationExtension;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthenticationExtensions) {
            AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
            if (!ius.a(this.a, authenticationExtensions.a) || !ius.a(this.b, authenticationExtensions.b) || !ius.a(this.c, authenticationExtensions.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, i, false);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
