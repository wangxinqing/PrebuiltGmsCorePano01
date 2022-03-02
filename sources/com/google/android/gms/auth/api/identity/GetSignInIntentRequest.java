package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fse();
    public final String a;
    public final String b;
    public String c;

    public GetSignInIntentRequest(String str, String str2, String str3) {
        iva.a((Object) str);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GetSignInIntentRequest) {
            GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
            if (!ius.a(this.a, getSignInIntentRequest.a) || !ius.a(this.b, getSignInIntentRequest.b) || !ius.a(this.c, getSignInIntentRequest.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
