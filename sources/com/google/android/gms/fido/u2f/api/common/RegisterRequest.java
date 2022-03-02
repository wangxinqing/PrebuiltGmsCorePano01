package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RegisterRequest extends AbstractSafeParcelable implements myv {
    public static final Parcelable.Creator CREATOR = new nbx();
    public final int a;
    public final byte[] b;
    public final String c;
    private final ProtocolVersion d;

    public RegisterRequest(int i, String str, byte[] bArr, String str2) {
        this.a = i;
        try {
            this.d = ProtocolVersion.a(str);
            this.b = bArr;
            this.c = str2;
        } catch (nbw e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final JSONObject a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterRequest) {
            RegisterRequest registerRequest = (RegisterRequest) obj;
            if (Arrays.equals(this.b, registerRequest.b) && this.d == registerRequest.d) {
                String str = this.c;
                if (str != null) {
                    if (!str.equals(registerRequest.c)) {
                        return false;
                    }
                } else if (registerRequest.c != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((Arrays.hashCode(this.b) + 31) * 31) + this.d.hashCode()) * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.d.d, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }
}
