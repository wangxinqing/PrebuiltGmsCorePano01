package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new mzu();
    public final byte[] a;
    public final List b;
    private final PublicKeyCredentialType c;

    static {
        anax.a((Object) nah.a, (Object) nah.b);
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List list) {
        iva.a((Object) str);
        try {
            this.c = PublicKeyCredentialType.a(str);
            this.a = (byte[]) iva.a((Object) bArr);
            this.b = list;
        } catch (mzy e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static PublicKeyCredentialDescriptor a(JSONObject jSONObject) {
        List list;
        String string = jSONObject.getString("type");
        byte[] decode = Base64.decode(jSONObject.getString("id"), 11);
        if (jSONObject.has("transports")) {
            list = Transport.a(jSONObject.getJSONArray("transports"));
        } else {
            list = null;
        }
        return new PublicKeyCredentialDescriptor(string, decode, list);
    }

    public final boolean equals(Object obj) {
        List list;
        if (obj instanceof PublicKeyCredentialDescriptor) {
            PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
            if (this.c.equals(publicKeyCredentialDescriptor.c) && Arrays.equals(this.a, publicKeyCredentialDescriptor.a)) {
                List list2 = this.b;
                if (list2 == null && publicKeyCredentialDescriptor.b == null) {
                    return true;
                }
                if (list2 == null || (list = publicKeyCredentialDescriptor.b) == null || !list2.containsAll(list) || !publicKeyCredentialDescriptor.b.containsAll(this.b)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.c.b, false);
        ivx.a(parcel, 3, this.a, false);
        ivx.c(parcel, 4, this.b, false);
        ivx.b(parcel, a2);
    }
}
