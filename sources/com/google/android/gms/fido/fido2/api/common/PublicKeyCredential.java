package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new mzt();
    public final String a;
    public final String b;
    public final byte[] c;
    public final AuthenticatorAttestationResponse d;
    public final AuthenticatorAssertionResponse e;
    public final AuthenticatorErrorResponse f;
    public final AuthenticationExtensionsClientOutputs g;

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs) {
        boolean z = true;
        if (!((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || ((authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null)))) {
            z = false;
        }
        iva.b(z);
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = authenticatorAttestationResponse;
        this.e = authenticatorAssertionResponse;
        this.f = authenticatorErrorResponse;
        this.g = authenticationExtensionsClientOutputs;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredential) {
            PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
            if (!ius.a(this.a, publicKeyCredential.a) || !ius.a(this.b, publicKeyCredential.b) || !Arrays.equals(this.c, publicKeyCredential.c) || !ius.a(this.d, publicKeyCredential.d) || !ius.a(this.e, publicKeyCredential.e) || !ius.a(this.f, publicKeyCredential.f) || !ius.a(this.g, publicKeyCredential.g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.g});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.a(parcel, 7, this.g, i, false);
        ivx.b(parcel, a2);
    }
}
