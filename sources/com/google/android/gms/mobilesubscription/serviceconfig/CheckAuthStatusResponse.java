package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CheckAuthStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tbc();
    public String a;
    public CarrierInfo b;
    public AuthType c;
    public AuthStatus d;
    public UserKey e;
    public Bundle f;

    private CheckAuthStatusResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckAuthStatusResponse) {
            CheckAuthStatusResponse checkAuthStatusResponse = (CheckAuthStatusResponse) obj;
            return ius.a(this.a, checkAuthStatusResponse.a) && ius.a(this.b, checkAuthStatusResponse.b) && ius.a(this.c, checkAuthStatusResponse.c) && ius.a(this.d, checkAuthStatusResponse.d) && ius.a(this.e, checkAuthStatusResponse.e) && ius.a(this.f, checkAuthStatusResponse.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public CheckAuthStatusResponse(String str, CarrierInfo carrierInfo, AuthType authType, AuthStatus authStatus, UserKey userKey, Bundle bundle) {
        this.a = str;
        this.b = carrierInfo;
        this.c = authType;
        this.d = authStatus;
        this.e = userKey;
        this.f = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.a(parcel, 63, this.f, false);
        ivx.b(parcel, a2);
    }
}
