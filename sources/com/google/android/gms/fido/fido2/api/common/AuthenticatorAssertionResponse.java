package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = new mzk();
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = (byte[]) iva.a((Object) bArr);
        this.b = (byte[]) iva.a((Object) bArr2);
        this.c = (byte[]) iva.a((Object) bArr3);
        this.d = (byte[]) iva.a((Object) bArr4);
        this.e = bArr5;
    }

    public final String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final JSONObject a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthenticatorAssertionResponse) {
            AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
            if (!Arrays.equals(this.a, authenticatorAssertionResponse.a) || !Arrays.equals(this.b, authenticatorAssertionResponse.b) || !Arrays.equals(this.c, authenticatorAssertionResponse.c) || !Arrays.equals(this.d, authenticatorAssertionResponse.d) || !Arrays.equals(this.e, authenticatorAssertionResponse.e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("keyHandle", (Object) anml.g.a(this.a));
        a2.a("clientDataJSON", (Object) anml.g.a(this.b));
        a2.a("authenticatorData", (Object) anml.g.a(this.c));
        a2.a("signature", (Object) anml.g.a(this.d));
        if (this.e != null) {
            a2.a("userHandle", (Object) anml.g.a(this.e));
        }
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.b(parcel, a2);
    }
}
