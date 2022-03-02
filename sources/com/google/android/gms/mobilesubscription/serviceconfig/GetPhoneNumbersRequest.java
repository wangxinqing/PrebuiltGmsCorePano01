package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GetPhoneNumbersRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tbh();
    public String a;
    public UserKey b;
    public Bundle c;

    public GetPhoneNumbersRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPhoneNumbersRequest) {
            GetPhoneNumbersRequest getPhoneNumbersRequest = (GetPhoneNumbersRequest) obj;
            return ius.a(this.a, getPhoneNumbersRequest.a) && ius.a(this.b, getPhoneNumbersRequest.b) && ius.a(this.c, getPhoneNumbersRequest.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public GetPhoneNumbersRequest(String str, UserKey userKey, Bundle bundle) {
        this.a = str;
        this.b = userKey;
        this.c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 63, this.c, false);
        ivx.b(parcel, a2);
    }
}
