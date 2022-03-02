package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CheckAuthStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tbb();
    public String a;
    public ServiceType b;
    public Long c;
    public AuthType d;
    public String e;
    public Bundle f;

    public CheckAuthStatusRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckAuthStatusRequest) {
            CheckAuthStatusRequest checkAuthStatusRequest = (CheckAuthStatusRequest) obj;
            return ius.a(this.a, checkAuthStatusRequest.a) && ius.a(this.b, checkAuthStatusRequest.b) && ius.a(this.c, checkAuthStatusRequest.c) && ius.a(this.d, checkAuthStatusRequest.d) && ius.a(this.e, checkAuthStatusRequest.e) && ius.a(this.f, checkAuthStatusRequest.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public CheckAuthStatusRequest(String str, ServiceType serviceType, Long l, AuthType authType, String str2, Bundle bundle) {
        this.a = str;
        this.b = serviceType;
        this.c = l;
        this.d = authType;
        this.e = str2;
        this.f = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 63, this.f, false);
        ivx.b(parcel, a2);
    }
}
