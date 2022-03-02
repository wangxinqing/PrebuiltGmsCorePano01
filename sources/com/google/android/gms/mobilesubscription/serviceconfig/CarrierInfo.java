package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class CarrierInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new taz();
    public Long a;
    public String b;
    public OauthRedirect c;

    private CarrierInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarrierInfo) {
            CarrierInfo carrierInfo = (CarrierInfo) obj;
            return ius.a(this.a, carrierInfo.a) && ius.a(this.b, carrierInfo.b) && ius.a(this.c, carrierInfo.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public CarrierInfo(Long l, String str, OauthRedirect oauthRedirect) {
        this.a = l;
        this.b = str;
        this.c = oauthRedirect;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
