package com.google.android.gms.fido.fido2.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InternalTransportChallengeViewOptions extends ViewOptions {
    public static final Parcelable.Creator CREATOR = new nap();
    public final String a;
    public final byte[] b;
    public final byte[] c;

    public InternalTransportChallengeViewOptions(String str, byte[] bArr, byte[] bArr2) {
        iva.a((Object) str);
        this.a = str;
        this.b = bArr;
        this.c = bArr2;
    }

    private static String a(byte[] bArr) {
        return anml.e.a(bArr);
    }

    public final nax b() {
        return nax.INTERNAL_TRANSPORT_CHALLENGE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InternalTransportChallengeViewOptions) {
            InternalTransportChallengeViewOptions internalTransportChallengeViewOptions = (InternalTransportChallengeViewOptions) obj;
            if (!this.a.equals(internalTransportChallengeViewOptions.a) || !Arrays.equals(this.b, internalTransportChallengeViewOptions.b) || !Arrays.equals(this.c, internalTransportChallengeViewOptions.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public static byte[] a(String str) {
        return anml.e.b((CharSequence) str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }

    public final JSONObject a() {
        JSONObject a2 = super.a();
        try {
            a2.put("rpId", this.a);
            byte[] bArr = this.b;
            if (bArr != null) {
                a2.put("keyHandle", a(bArr));
            }
            byte[] bArr2 = this.c;
            if (bArr2 != null) {
                a2.put("dataToSign", a(bArr2));
            }
            return a2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }
}
