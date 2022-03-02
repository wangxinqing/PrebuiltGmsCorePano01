package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = new mzn();
    public final String a;
    private final ErrorCode b;

    public AuthenticatorErrorResponse(int i, String str) {
        try {
            this.b = ErrorCode.a(i);
            this.a = str;
        } catch (mzr e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", this.b.m);
            String str = this.a;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthenticatorErrorResponse) {
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
            if (!ius.a(this.b, authenticatorErrorResponse.b) || !ius.a(this.a, authenticatorErrorResponse.a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("errorCode", this.b.m);
        String str = this.a;
        if (str != null) {
            a2.a("errorMessage", (Object) str);
        }
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.b.m);
        ivx.a(parcel, 3, this.a, false);
        ivx.b(parcel, a2);
    }
}
