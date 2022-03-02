package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TokenBinding extends AbstractSafeParcelable implements myv {
    public static final Parcelable.Creator CREATOR = new nab();
    public final String a;
    private final TokenBindingStatus b;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");
        
        public static final Parcelable.Creator CREATOR = null;
        public final String d;

        static {
            CREATOR = new mzz();
        }

        private TokenBindingStatus(String str) {
            this.d = str;
        }

        public static TokenBindingStatus a(String str) {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.d)) {
                    return tokenBindingStatus;
                }
            }
            throw new naa(str);
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return this.d;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.d);
        }
    }

    static {
        new TokenBinding(TokenBindingStatus.SUPPORTED.d, (String) null);
        new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.d, (String) null);
    }

    public TokenBinding(String str, String str2) {
        iva.a((Object) str);
        try {
            this.b = TokenBindingStatus.a(str);
            this.a = str2;
        } catch (naa e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final JSONObject a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenBinding) {
            TokenBinding tokenBinding = (TokenBinding) obj;
            if (!amqx.a(this.b, tokenBinding.b) || !amqx.a(this.a, tokenBinding.a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.b.d, false);
        ivx.a(parcel, 3, this.a, false);
        ivx.b(parcel, a2);
    }
}
