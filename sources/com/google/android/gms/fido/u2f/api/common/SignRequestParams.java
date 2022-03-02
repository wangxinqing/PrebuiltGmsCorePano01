package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Deprecated
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = new ncb();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final byte[] d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;

    public SignRequestParams(Integer num, Double d2, Uri uri, byte[] bArr, List list, ChannelIdValue channelIdValue, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = num;
        this.b = d2;
        this.c = uri;
        this.d = bArr;
        boolean z4 = false;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        iva.b(z, "registeredKeys must not be null or empty");
        this.e = list;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RegisteredKey registeredKey = (RegisteredKey) list.get(i);
            if (registeredKey.b != null) {
                z2 = true;
            } else {
                z2 = uri != null;
            }
            iva.b(z2, "registered key has null appId and no request appId is provided");
            if (registeredKey.c != null) {
                z3 = true;
            } else {
                z3 = list != null;
            }
            iva.b(z3, "register request has null challenge and no default challenge isprovided");
            String str2 = registeredKey.b;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        iva.b((str == null || str.length() <= 80) ? true : z4, "Display Hint cannot be longer than 80 characters");
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SignRequestParams) {
            SignRequestParams signRequestParams = (SignRequestParams) obj;
            return ius.a(this.a, signRequestParams.a) && ius.a(this.b, signRequestParams.b) && ius.a(this.c, signRequestParams.c) && Arrays.equals(this.d, signRequestParams.d) && this.e.containsAll(signRequestParams.e) && signRequestParams.e.containsAll(this.e) && ius.a(this.f, signRequestParams.f) && ius.a(this.g, signRequestParams.g);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.e, this.f, this.g, Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c, i, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.c(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f, i, false);
        ivx.a(parcel, 8, this.g, false);
        ivx.b(parcel, a2);
    }
}
