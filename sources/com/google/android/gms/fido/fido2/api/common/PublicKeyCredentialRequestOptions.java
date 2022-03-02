package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR = new mzw();
    public final byte[] a;
    public final Double b;
    public final String c;
    public final List d;
    public final Integer e;
    public final TokenBinding f;
    public final AuthenticationExtensions g;
    private final UserVerificationRequirement h;

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d2, String str, List list, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions) {
        this.a = (byte[]) iva.a((Object) bArr);
        this.b = d2;
        iva.a((Object) str);
        this.c = str;
        this.d = list;
        this.e = num;
        this.f = tokenBinding;
        if (str2 != null) {
            try {
                this.h = UserVerificationRequirement.a(str2);
            } catch (nae e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.h = null;
        }
        this.g = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (obj instanceof PublicKeyCredentialRequestOptions) {
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
            if (!Arrays.equals(this.a, publicKeyCredentialRequestOptions.a) || !ius.a(this.b, publicKeyCredentialRequestOptions.b) || !ius.a(this.c, publicKeyCredentialRequestOptions.c) || ((((list = this.d) != null || publicKeyCredentialRequestOptions.d != null) && (list == null || (list2 = publicKeyCredentialRequestOptions.d) == null || !list.containsAll(list2) || !publicKeyCredentialRequestOptions.d.containsAll(this.d))) || !ius.a(this.e, publicKeyCredentialRequestOptions.e) || !ius.a(this.f, publicKeyCredentialRequestOptions.f) || !ius.a(this.h, publicKeyCredentialRequestOptions.h) || !ius.a(this.g, publicKeyCredentialRequestOptions.g))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d, this.e, this.f, this.h, this.g});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c, false);
        ivx.c(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e);
        ivx.a(parcel, 7, this.f, i, false);
        UserVerificationRequirement userVerificationRequirement = this.h;
        if (userVerificationRequirement != null) {
            str = userVerificationRequirement.d;
        } else {
            str = null;
        }
        ivx.a(parcel, 8, str, false);
        ivx.a(parcel, 9, this.g, i, false);
        ivx.b(parcel, a2);
    }
}
