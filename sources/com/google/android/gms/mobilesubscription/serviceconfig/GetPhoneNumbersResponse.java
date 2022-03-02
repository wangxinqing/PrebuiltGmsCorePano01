package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GetPhoneNumbersResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tbi();
    public String a;
    public String[] b;
    public Bundle c;

    private GetPhoneNumbersResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPhoneNumbersResponse) {
            GetPhoneNumbersResponse getPhoneNumbersResponse = (GetPhoneNumbersResponse) obj;
            return ius.a(this.a, getPhoneNumbersResponse.a) && Arrays.equals(this.b, getPhoneNumbersResponse.b) && ius.a(this.c, getPhoneNumbersResponse.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c});
    }

    public GetPhoneNumbersResponse(String str, String[] strArr, Bundle bundle) {
        this.a = str;
        this.b = strArr;
        this.c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 63, this.c, false);
        ivx.b(parcel, a2);
    }
}
