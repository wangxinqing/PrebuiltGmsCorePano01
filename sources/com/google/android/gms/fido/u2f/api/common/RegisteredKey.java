package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RegisteredKey extends AbstractSafeParcelable implements myv {
    public static final Parcelable.Creator CREATOR = new nbz();
    public final KeyHandle a;
    public final String b;
    public String c;

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        iva.a((Object) keyHandle);
        this.a = keyHandle;
        this.c = str;
        this.b = str2;
    }

    public final JSONObject a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.c;
        if (str == null) {
            if (registeredKey.c != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.c)) {
            return false;
        }
        if (!this.a.equals(registeredKey.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 != null) {
            if (!str2.equals(registeredKey.b)) {
                return false;
            }
        } else if (registeredKey.b != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = ((((str != null ? str.hashCode() : 0) + 31) * 31) + this.a.hashCode()) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.a.b, 11));
            if (this.a.c != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", this.a.c.d);
            }
            List list = this.a.d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.b, false);
        ivx.b(parcel, a2);
    }
}
