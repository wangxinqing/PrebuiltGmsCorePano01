package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = new nbt();
    public final String a;
    private final ErrorCode b;

    public ErrorResponseData(int i, String str) {
        this.b = ErrorCode.a(i);
        this.a = str;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.b.g);
            String str = this.a;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ErrorResponseData) {
            ErrorResponseData errorResponseData = (ErrorResponseData) obj;
            if (!ius.a(this.b, errorResponseData.b) || !ius.a(this.a, errorResponseData.a)) {
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
        a2.a("errorCode", this.b.g);
        String str = this.a;
        if (str != null) {
            a2.a("errorMessage", (Object) str);
        }
        return a2.toString();
    }

    public ErrorResponseData(ErrorCode errorCode) {
        iva.a((Object) errorCode);
        this.b = errorCode;
        this.a = null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.b.g);
        ivx.a(parcel, 3, this.a, false);
        ivx.b(parcel, a2);
    }
}
