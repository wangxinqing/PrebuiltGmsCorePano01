package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = new mzl();
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = (byte[]) iva.a((Object) bArr);
        this.b = (byte[]) iva.a((Object) bArr2);
        this.c = (byte[]) iva.a((Object) bArr3);
    }

    public final JSONObject a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthenticatorAttestationResponse) {
            AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
            if (!Arrays.equals(this.a, authenticatorAttestationResponse.a) || !Arrays.equals(this.b, authenticatorAttestationResponse.b) || !Arrays.equals(this.c, authenticatorAttestationResponse.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("keyHandle", (Object) anml.g.a(this.a));
        a2.a("clientDataJSON", (Object) anml.g.a(this.b));
        a2.a("attestationObject", (Object) anml.g.a(this.c));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }
}
