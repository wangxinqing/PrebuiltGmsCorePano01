package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator CREATOR = new ncc();
    public final byte[] a;
    public final String b;
    public final byte[] c;
    public final byte[] d;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        this.a = (byte[]) iva.a((Object) bArr);
        iva.a((Object) str);
        this.b = str;
        this.c = (byte[]) iva.a((Object) bArr2);
        this.d = (byte[]) iva.a((Object) bArr3);
    }

    private static final String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignResponseData) {
            SignResponseData signResponseData = (SignResponseData) obj;
            if (!Arrays.equals(this.a, signResponseData.a) || !ius.a(this.b, signResponseData.b) || !Arrays.equals(this.c, signResponseData.c) || !Arrays.equals(this.d, signResponseData.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("keyHandle", (Object) anml.g.a(this.a));
        a2.a("clientDataString", (Object) this.b);
        a2.a("signatureData", (Object) anml.g.a(this.c));
        a2.a("application", (Object) anml.g.a(this.d));
        return a2.toString();
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", a(this.a));
            jSONObject.put("clientData", a(this.b.getBytes()));
            jSONObject.put("signatureData", a(this.c));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.b(parcel, a2);
    }
}
